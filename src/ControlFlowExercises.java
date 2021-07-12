import java.util.Scanner;

public class ControlFlowExercises {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }
//        int x = 0;
//        do{
//            System.out.println(x);
//            x += 2;
//        } while(x <= 100);
//
//        int y = 100;
//        do{
//            System.out.println(y);
//            y -= 5;
//        } while(y >= -10);
//
//        int o = 2;
//        do{
//            System.out.println(o);
//            o = (int) Math.pow(o, 2);
//        } while(o < 1000000);

//        for(int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }
//        for(int i = 2; i < 1000000; i = (int) Math.pow(i, 2)){
//            System.out.println(i);
//        }

//        for(int i = 1; i <= 100; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if(i % 5 == 0){
//                System.out.println("Buzz");
//            } else if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }
//        start();
        getGrades();
    }
    public static String userInput(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
//    public static void start(){
//        System.out.println("What number would you like to go to?");
//        int userNumber = scanner.nextInt();
//        System.out.println("Here is  your table\nnumber | squared | cubed\n------ | " +
//                "------- | -----");
//        for(int i = 1; i <= userNumber; i++){
//            System.out.printf("%s      | %s      | %s    \n", i, (int) Math.pow(i, 2),
//                    (int) Math.pow(i, 3));
//        }
//        Continue();
//    }
    public static void Continue(){
        System.out.println("Would you like to continue? Y/N");
        String userInput = userInput();
        if(userInput.equalsIgnoreCase("y")){
            getGrades();
        } else if(userInput.equalsIgnoreCase("n")){
            System.out.println("Goodbye, have a great day!");
        } else {
            System.out.println("Please enter Y or N to continue");
        }
    }
    public static void getGrades(){
        System.out.println("Please input a number between 0 and 100");
        int userNumber = scanner.nextInt();
        if(0 <= userNumber && userNumber <= 59){
            System.out.println("Your grade is: F");
        } else if(60 <= userNumber && userNumber <= 66){
            System.out.println("Your grade is: D");
        } else if(67 <= userNumber && userNumber <= 79){
            System.out.println("Your grade is: C");
        } else if(80 <= userNumber && userNumber <= 87){
            System.out.println("Your grade is: B");
        } else if(88 <= userNumber && userNumber <= 100){
            System.out.println("Your grade is: A");
        }
        Continue();
    }
}
