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
//        boolean hasNL = sc.hasNext();
//
//        while (hasNL){
//            String word = sc.next();
//
//            if(word.equals("break")){
//                break;
//            }
//
//            System.out.println(word);
//        }
//        int myNum = sc.nextInt();
//        System.out.println(myNum);

//        String myName = "Robby";
//        String yourName = "robby";
////              .equals()
//        System.out.println(myName.equals(yourName));
//        //      .equalsIgnoreCase()
//        System.out.println(myName.equalsIgnoreCase(yourName));

        //        MINI EXERCISE
        // TODO: create three unique usernames (user1, user2, user3).
        //  create a fourth user and set it equal to user input. (ask
        //  the user to enter a username). if the username has already
        //  been used by user1, user2, or user3, print "sorry this
        //  username already exists.

//        String user1 = "Relort35";
//        String user2 = "Amunzetsu";
//        String user3 = "SledgeHammer";
//
//        System.out.println("Please input a username");
//        String user4 = sc.next();
//        if(user4.equalsIgnoreCase(user1) || user4.equalsIgnoreCase(user2) || user4.equalsIgnoreCase(user3)){
//            System.out.println("Sorry this username already exists");
//        } else {
//            System.out.printf("The username you entered is: %s", user4);
//        }
//        String takenUserName = "Sorry this username is already registered";
//
//        switch(user4){
//            case "Relort35":
//                System.out.println(takenUserName);
//                break;
//            case "Amunzetsu":
//                System.out.println(takenUserName);
//                break;
//            case "SledgeHammer":
//                System.out.println(takenUserName);
//                break;
//            default:
//                System.out.printf("The username you wish to register is: %s", user4);
//        }

        //while vs do...while loop:
        //condition is checked before
        //do ... while will always be executed first before condition is checked

//        int num1 = 0;

//        while(num1 <= 10){
//            System.out.println(num1);
//            num1++;
//        }

//        do {
//            System.out.println(num1);
//            num1++;
//        } while(num1 <= 10);


//        for... loop

//        int myNum = 18;

//        for(int myNum = 0; myNum <= 20; myNum++){
//            System.out.println(myNum);
//        }
        String user1 = "Robby";
        String user2 = "Tiffany";
        String user3 = "Relort35";
//        String user4 = sc.next();

//        if(user4.equalsIgnoreCase(user1) || user4.equalsIgnoreCase(user2) || user4.equalsIgnoreCase(user3)){
//            System.out.println("Sorry this username already exists");
//        } else {
//            System.out.printf("The username you entered is: %s", user4);
//        }


//        while(user4.equalsIgnoreCase(user1) || user4.equalsIgnoreCase(user2) || user4.equalsIgnoreCase(user3)){
//            System.out.println("Sorry this username already exists");
//        }
        String user4 = sc.next();
        do{
            System.out.println("Please input a username");
            sc.next();
        } while(user4.equalsIgnoreCase(user1) || user4.equalsIgnoreCase(user2) || user4.equalsIgnoreCase(user3));
    }
}

