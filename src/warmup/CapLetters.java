package warmup;

import java.util.Scanner;

public class CapLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a random sentence with Capitals scattered " +
                "throughout");
        String userInput = sc.nextLine();
        System.out.println(allCaps(userInput));
    }

    public static int allCaps(String userInput){
        int result = 0;
        for(int i = 0; i < userInput.length(); i++){
            if(Character.isUpperCase(userInput.charAt(i))){
                result++;
            } else {
                String other = "";
                other += userInput.charAt(i);
            }
        }
        return result;
    }
}
