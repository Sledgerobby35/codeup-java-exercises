import java.util.Locale;
import java.util.Scanner;

//        warmup:
//        TODO: create a new "Strings-Lecture" java class file (or wherever
//         you like to keep notes/lecture exercises. Copy given
//         code, that is your starting point. Using Scanner prompt a
//         user (in this case it's you, you're the user) to type in
//         their first name. Save the input into a String variable. If
//         your name matches randomName, print "woah! you guessed:
//         enter-randomName-here! How did you know enter-yourName-here
//         is my name?!". if randomName does
//         not
//         match your name exactly, print "Way off my friend! My name
//         isn't randomName-here. It's yourName-here.".
public class StringsLecture {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String[] studentsArr =
//                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
//                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
//                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
//                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
//                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
//                        "Casey", "Dorian", "Tristan", "Jordy"};
//        int randomNum = (int) (Math.random() * 28);
//        String randomName = studentsArr[randomNum];
//        /* your code goes here */
//
//        System.out.println("Please Enter your name");
//
//        String userName = sc.next();
//        if (userName.equals(randomName)) {
//            System.out.printf("woah! you guessed %s! How did you know " +
//                    "%s is my name?!", randomName, userName);
//        } else {
//            System.out.printf("Way off my friend! My name is not " +
//                    "%s It's %s", randomName, userName);
//        }

//        TODO: create a String variable that holds this sentence: "Red
//         Orange Blue Yellow Green Purple". Prompt the user to type in
//         their favorite color, if their fave color is the same as the
//         first word in the String, then print out "my fave color:
//         userColor is the first one". If their fave color is last, then print out "my fave color: userColor is last"

        Scanner sc = new Scanner(System.in);
        String sentence = "Red Orange Blue Yellow Green Purple";
        System.out.println("What is your favorite Color?");
        String userColor = sc.next();

        if(sentence.startsWith(userColor)){
            System.out.printf("My Favorite Color: %s is First\n", userColor);
        }
        if(sentence.endsWith(userColor)){
            System.out.printf("My Favorite Color: %s is Last\n", userColor);
        }

        switch(userColor.toLowerCase(Locale.ROOT)){
            case "red":
                System.out.printf("My Favorite Color: %s is First", userColor);
                break;
            case "purple":
                System.out.printf("My Favorite Color: %s is Last", userColor);
                break;
            default:
                System.out.printf("My Favorite Color: %s is somewhere in the middle",
                        userColor);
                break;
        }
    }
}