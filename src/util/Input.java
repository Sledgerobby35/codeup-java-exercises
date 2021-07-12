package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

//    public Input(Scanner scanner) {
//        Input.scanner = new Scanner(System.in);
//    }

    public static String getString(){
        return scanner.next();
    }

    public static boolean yesNo(){
        String userInput = getString();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public static int getInt(int min, int max){
        int userInput = scanner.nextInt();
        if(!(min < userInput && userInput < max)){
            System.out.printf("Please input a number between %s and %s", min, max);
            getInt(min, max);
        }
        return userInput;
    }

    public static int getInt(){
        return scanner.nextInt();
    }
    public static double getDouble(double min, double max){
        double userInput = scanner.nextDouble();
        if(!(min < userInput && userInput < max)){
            System.out.printf("Please input a number between %s and %s", min, max);
            getDouble(min, max);
        }
        return userInput;
    }
    public static double getDouble(){
        return scanner.nextDouble();
    }
}
