package warmup;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWarmup {
    public static void main(String[] args) {
        String[] userLocations = {};
        System.out.println("Please input your favorite vacation spot");
        System.out.println("Press q anytime to exit");
        System.out.println(Arrays.toString(locations(userInput(), userLocations)));
    }

    public static String userInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static String[] locations(String userInput, String[] userLocations) {
        String[] result = Arrays.copyOf(userLocations, userLocations.length + 1);
        result[result.length - 1] = userInput;
        if(!userInput.equalsIgnoreCase("q")){
            return locations(userInput(),result);
        }
        return result;
    }
}