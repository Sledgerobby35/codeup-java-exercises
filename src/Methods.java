public class Methods {
    public static void main(String[] args) {
        System.out.println(greeting("Robby Sledge", 21, "Hello"));
    }

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

    public static String greeting(String name, int age, String quote){
        return "Hello " + name + "\n" + "that's crazy! you don't look " + age + " " +
                "years old!\n" + quote;
    }
}
