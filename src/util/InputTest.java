package util;

import static util.Input.*;

public class InputTest {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(getString());

        System.out.println("Is today well?");
        System.out.println(yesNo());

        System.out.println("Please input a number between 1 and 10");
        System.out.println(getInt(1, 10));

        System.out.println("Please input a number");
        System.out.println(getInt());

        System.out.println("Please input a decimal between 0.5 and 10.5");
        System.out.println(getDouble(0.5, 10.5));

        System.out.println("Please input a decimal number");
        System.out.println(getDouble());
    }
}
