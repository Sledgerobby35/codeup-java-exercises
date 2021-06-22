import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f\n", pi);

        Scanner sc = new Scanner(System.in);

//        System.out.println("Please input a Integer");
//        int userNum = sc.nextInt();
//        System.out.println(userNum);

//        System.out.println("Please input any 3 words");
//        String userWord1 = sc.next();
//        String userWord2 = sc.next();
//        String userWord3 = sc.next();
//        System.out.println(userWord1);
//        System.out.println(userWord2);
//        System.out.println(userWord3);

//        System.out.println("Please enter any sentence");
//        String userSentence = sc.nextLine();
//        System.out.println(userSentence);

        System.out.println("Please enter length and width of classroom as integers");
        String length = sc.next();
        String width = sc.next();
        float perimeter =
                (Float.parseFloat(length) * 2) + (Float.parseFloat(width) * 2);

        System.out.printf("The Perimeter of the class room is: %s ft\n", perimeter);

        float area = (Float.parseFloat(length)) * (Float.parseFloat(width));

        System.out.printf("The Area of the classroom is: %s sqFt", area);
        sc.useDelimiter("\n");
//        Scanner sc = new Scanner(System.in);
////        sc.useDelimiter("\n");
//        System.out.println("Please enter a number and a word:");
//        int num = sc.nextInt();
//        int sentence = Integer.parseInt(sc.next());
//
//        System.out.println(num);
//        System.out.println(sentence);

    }
}
