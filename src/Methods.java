import java.util.Scanner;

public class Methods {
//    public static void main(String[] args) {
//        System.out.println(greetUser(greeting()));
//    }

//    public static int greeting(int age) {
//        System.out.println("age: " + age);
//        return age;
//    }

    //  Syntax

    //  public - Visibility of this method to other classes
    //  static - Available for this class and not an instance of the class
    //  void, String, int - defines how the class returns data (if any)
    //  main - name of the method, should be custom named after main is established
    //  (data param) - type of data and parameters to follow
    //

    //    TODO: create a new method that accepts the name of a basketball
    //     team (ex: the spurs) and returns a String that says
    //     "[basketballTeam] is the best team.". Invoke that method within
    //     your main method (remember to pass in the name of the basketball
    //     team). print out the result of the new method.

//    public static String basketBall(String teamName) {
//        return teamName + " is the best team.";
//    }

    //    TODO: create a new method that accepts the string created from the
    //     first method and returns the number of characters in that string.

//    public static void numOfCharInString(String args){
//
//    }


    //Method Overloading

//    public static void greeting() {
//        System.out.println("hello, world");
//    }

    //    TODO: invoke a method that accepts (and returns) the following:
    //        - accepts: your first name and your last name. returns: A
    //        string that reads: "Hello Laura Ruiz-Roehrs (replace with your
    //        first and last)";

//    public static String greeting(String name, int age, String quote){
//        return "Hello " + name + "\n" + "that's crazy! you don't look " + age + " " +
//                "years old!\n" + quote;
//    }

    //    WARMUP
//    TODO: prompt a user to tell us about themselves (age, name, if
//     they have any pets (true/false). Using method overloading, create
//     methods that will return the first fact they told us about
//     themselves. ex: I can input: 18 -- Laura -- false in which case I
//     expect you to return: 18. but if I tell you my name first: Laura --
//     false -- 18. I expect you to return "Laura" ... etc.


//    public static String greeting(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please provide your Name, age, and do you have any pets");
//        return sc.next();
//    }
//    public static String greetUser(String userInput){
//        return userInput;
//    }
//    public static int greetUser(int userInput) {
//        return userInput;
//    }
//    public static boolean greetUser(boolean userInput){
//        return userInput;
//    }

//    public static void main(String[] args) {
//        //  int -- primitive data type
//        //  Integer -- Object
//        //  String -- Object -- the reason why you cant compare strings
//        //  using
//        Integer numero = 10;
//        System.out.println(numero.hashCode());
//        System.out.println(returnNum(numero).hashCode());
//    }
//    public static Integer returnNum(Integer randomNum){
//        System.out.println(randomNum.hashCode());
//        System.out.println(randomNum.hashCode());
//        return randomNum;
//    }
//public static void main(String[] args) {
//    int num = 5;
//    anotherMethod(num);
//}
//
//public static void anotherMethod(int randomNum){
//    System.out.println(randomNum);
//}

    //    TODO: you are a sports manager. Prompt your client who is training
//         for a marathon how many miles they have to run today. You're the
//         coach, so you decide how many miles they ran that day. print out
//         how many miles they have left in training until they have 0 miles
//         left.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many miles do will I be running today Coach?");
        int miles = sc.nextInt();
        milesLeft(miles);
    }
    public static void milesLeft(int numOfMiles){
        numOfMiles--;
        if(numOfMiles > 0){
            System.out.println("You have " + numOfMiles + " miles left");
            milesLeft(numOfMiles);
        } else {
            System.out.println("All finished, good job today!");
        }
    }
}
