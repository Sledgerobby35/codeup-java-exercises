import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {
//        String name = "Robert";
//        String role = "Student";
//        String hobby = "playing video games";
//        int age = 21;
//
//        String mySentence = String.format("My name is %s, I am a %s with Codeup, in my free time I " +
//                "enjoy %s. \nI am %d", name, role, hobby, age);
//
//        System.out.println(mySentence);
//
//
//        System.out.printf("My name is %s, I am a %s with Codeup, in my free time I " +
//                "enjoy %s", name, role, hobby);

//        float currencyInPennies = 1000.1299999f;
//
//        String mySentence = String.format("I'll sell you swamp land for $%f per acre",
//                currencyInPennies);
//
//        System.out.println(mySentence);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your full name?");
//        String firstName = sc.next();
//        String lastName = sc.next();
//        System.out.printf("Your first name is: %s\n", firstName);
//        System.out.printf("Your last name is: %s\n", lastName);

        /* TODO: use the scanner to take in the name of the month you were born and print it back out
    - remember to first prompt the user for the input
 */
        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your Birthday? (YYYY MM DD)");
//        String birthYear = sc.next();
//        String birthMonth = sc.next();
//        String birthDay = sc.next();
//
//        System.out.printf("The year you were born is: %s\n", birthYear);
//        System.out.printf("Your were born in the month of: %s\n", birthMonth);
//        System.out.printf("The day in which you were born is: %s\n", birthDay);

//        System.out.print("Enter a number: ");
//
//        String myString = sc.nextLine();
//        System.out.println(myString);
        boolean hasNL = sc.hasNext();

        while (hasNL){
            String word = sc.next();

            if(word.equals("break")){
                break;
            }
            
            System.out.println(word);
        }
//        int myNum = sc.nextInt();
//        System.out.println(myNum);
    }
}

