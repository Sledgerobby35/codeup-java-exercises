package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student robert = new Student("Robert");
        robert.addGrade(98);
        robert.addGrade(76);
        robert.addGrade(98);

        Student tiffany = new Student("Tiffany");
        tiffany.addGrade(100);
        tiffany.addGrade(97);
        tiffany.addGrade(98);

        Student ricardo = new Student("Ricardo");
        ricardo.addGrade(87);
        ricardo.addGrade(93);
        ricardo.addGrade(97);

        Student amado = new Student("Amado");
        amado.addGrade(95);
        amado.addGrade(96);
        amado.addGrade(97);

        students.put("Sledgerobby35", robert);
        students.put("tiffannyhadden", tiffany);
        students.put("Rfigueroa2317", ricardo);
        students.put("amadoazua3", amado);

        System.out.println("Welcome!\n\nHere are the GitHub usernames of our " +
                "students:\n");
        System.out.println(getGitHubNames(students) + "\n");

        cmdLineLogic(students);
    }

    public static String getGitHubNames(HashMap students){
        String result = "";
        for ( Object key : students.keySet() ) {
            result += "|" + key + "|    ";
        }
        return result;
    }

    public static void cmdLineLogic(HashMap students){
        System.out.println("What student would you like to see more information " +
                "on?\n");
        String userInput = scanner.next();
        if(students.containsKey(userInput)){
            Student currentStudent = (Student) students.get(userInput);
            System.out.printf("Name: %s - GitHub Username: %s\nCurrent Average: %s\n",
                    currentStudent.getName(), userInput, currentStudent.getGradeAverage());
        } else {
            System.out.printf("Sorry, no student found with the GitHub username of " +
                    "\"%s\"\n", userInput);
        }
        goFurther(students);
    }

    public static void goFurther(HashMap students){
        System.out.println("Would you like to see another student: Y or N");
        String userInput = scanner.next();
        if(userInput.equalsIgnoreCase("y")){
            cmdLineLogic(students);
        } else {
            System.out.println("Goodbye, and have a wonderful day!");
        }
    }
}
