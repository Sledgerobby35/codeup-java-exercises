package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
     return name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double getGradeAverage(){
        double result = 0;
        for (Integer grade : grades) {
            result += grade;
        }
        return result / grades.size();
    }
}
