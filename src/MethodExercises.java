import java.util.Arrays;
import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number between 1 and 10");
        int userInput = sc.nextInt();
//        System.out.println(getInteger(1,10, sc));
        factorial(userInput);
//        Oberon classInfo = new Oberon();
//        System.out.printf("There are %s students in class, we are learning %s, and we" +
//                " graduate in %s days on October 1st",
//                classInfo.numOfStudents, Arrays.toString(classInfo.topicsOfLearning), classInfo.dayUntilGraduation);

    }
//    public static float add(float num1, float num2){
//        return num1 + num2;
//    }
//    public static float subtract(float num1, float num2){
//        return num1 - num2;
//    }
//    public static float multiply(float num1, float num2){
//        return num1 * num2;
//    }
//    public static float divide(float num1, float num2){
//        if(num2 == 0){
//            return 0;
//        } else {
//            return num1 / num2;
//        }
//    }
//    public static float modulus(float num1, float num2){
//        return num1 % num2;
//    }


    public static int getInteger(int min, int max, int userInput){
        if(userInput <= min || userInput >= max){
            System.out.printf("Please input a number between %s and %s\n",1, 10);
//            getInteger(min, max, userInput);
        }
        return userInput;
    }
//    public static int getInteger(int min, int max,int userInput){
//        if(userInput >= min && userInput <= max){
//            return 1;
//        } else {
//            return 0;
//        }
//    }
//    public static boolean getIntLogic(int userInput){
//        Scanner sc = new Scanner(System.in);
//        if(getInteger(1,10,userInput) == 0){
//            System.out.println("Please input a number between 1 and 10");
//            getIntLogic(sc.nextInt());
//            return false;
//        } else{
//            System.out.println("true");
//            return true;
//        }
//    }
public static void factorial(int userInput){
    int x = 1;
    String factorial = "";
        for(int i = userInput; i > 0; i--){
            x *= i;
            factorial += (i + " * ");
            if(proceed()){
                System.out.println(factorial);
                System.out.println(x);
                proceed();
            } else {
                System.out.println(x);
            }
        }
}
public static boolean proceed(){
        Scanner sc = new Scanner(System.in);
        String userConfirmation = sc.next();
    System.out.println("Would you like to continue?\n Yes or No");
    return userConfirmation.equalsIgnoreCase("Yes");
}
}
