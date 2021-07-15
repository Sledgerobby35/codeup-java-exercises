package warmup;

import oop.Person;
import util.Input;

public class EnrollmentEligibility {

    //TODO Let’s say that you’re writing a program that checks whether or not a user
    // is eligible to open up a new bank account. The requirements are that they have
    // to be older than 16 years old and have at least $200 to start their bank
    // account. Write a method that will return a string that states whether they’re
    // eligible to bank at Banco di Laura or whether they are not eligible, make
    // sure to  throw an `NumberFormatException` if the user inputs anything that’s
    // not a number
    public static void main(String[] args) {
//        Person newCustomer = new Person("Hailey", 22);
//        Person newCustomer2 = new Person("Jenna", 15);
//        newCustomer.setOAB(1000);
//        newCustomer2.setOAB(150);
//        eligible(17, 200, newCustomer);

//        try {
//            System.out.println("Let's see...");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero!");
//        } catch(ArithmeticException e) {
//            System.out.println(e);
//            System.out.println("Math still works!");
//
//        }

    }
    public static void eligible(int minAge, int minAccountBalance, Person customer){
        if(customer.getAge() < minAge || customer.getOAB() < minAccountBalance){
//            System.out.printf("Apologies, %s you are not eligible to open an " +
//                    "account with Banco di Laura\n", customer.getName());
            throw new NumberFormatException("\nApologies, you are not eligible to " +
                    "open an " +
                    "account with Banco di Laura\n");
        } else {
            System.out.printf("Congratulation %s, you are eligible to open an " +
                    "account with Banco di Laura\n", customer.getName());
        }
    }

//    public static void eligible(){
//        Input userInput = new Input();
//        int userAge;
//        String userName;
//        System.out.println("Hello, would you like to start a new bank account?");
//        if(userInput.yesNo()){
//
//        }
//
//    }
//
//    public static Person person(){
//        Input userInput = new Input();
//        int userAge;
//        String userName;
//
//        System.out.println("Could you please input your age");
//        userAge = userInput.getInt();
//
//        System.out.println("Thank you, now could I get your name please");
//        userName = userInput.getString();
//
//        Person newCustomer = new Person(userName, userAge);
//        return newCustomer;
//    }

    //TRY - CATCH

}