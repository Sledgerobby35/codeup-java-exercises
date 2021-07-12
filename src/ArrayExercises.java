import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayExercises {
    public static void main(String[] args) {
//        int[] numbers  = {1,2,3,4,5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));

        Person person1 = new Person("John");
        Person person2 = new Person("Amy");
        Person person3 = new Person("Briana");

        String[] personNames = {person1.getName(),person2.getName(), person3.getName()};
//        for (int i = 0; i < personNames.length; i++) {
//            System.out.println(personNames[i]);
//        }
        System.out.println(Arrays.toString(personNames));
        Person person4 = new Person("Caroline");
        System.out.println(addPerson(personNames, person4.getName()));
    }
    public static ArrayList<String> addPerson(String[] personArray,
                                             String personObject){
        ArrayList<String> objectList = new ArrayList<String>();
        Collections.addAll(objectList, personArray);
        objectList.add(personObject);
        return objectList;
    }
}
