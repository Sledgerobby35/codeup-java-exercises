package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Movie[] allMovies = MoviesArray.findAll();
        while (displayMovies(allMovies, userInput()).equals("-1"));
    }

    public static int userInput() {
        System.out.println("What would you like to do?");
        System.out.println("0 - Exit\n1 - View all movies\n2 - View movies in the " +
                "animated category\n3 - View movies in the drama category\n4 - view " +
                "movies in the horror category\n5 - view movies in the scifi " +
                "category");
        return scanner.nextInt();
    }

    public static String displayMovies(Movie[] arrayOfMovies, int userChoice) {
        String movieInfo = "";
        switch (userChoice) {
            case 0:
                break;
            case 1:
                for (Movie movie : arrayOfMovies) {
                    movieInfo += movie.getName() + " -- " + movie.getCategory() + "\n";
                }
                System.out.println(movieInfo);
                return "1";
            case 2:
                for (Movie movie : arrayOfMovies) {
                    if (movie.getCategory().equals("animated")) {
                        movieInfo += movie.getName() + " -- " + movie.getCategory() +
                                "\n";
                    }
                }
                System.out.println(movieInfo);
                return "2";
            case 3:
                for (Movie movie : arrayOfMovies) {
                    if (movie.getCategory().equals("drama")) {
                        movieInfo += movie.getName() + " -- " + movie.getCategory() +
                                "\n";
                    }
                }
                System.out.println(movieInfo);
                return "3";
            case 4:
                for (Movie movie : arrayOfMovies) {
                    if (movie.getCategory().equals("horror")) {
                        movieInfo += movie.getName() + " -- " + movie.getCategory() +
                                "\n";
                    }
                }
                System.out.println(movieInfo);
                return "4";
            case 5:
                for (Movie movie : arrayOfMovies) {
                    if (movie.getCategory().equals("scifi")) {
                        movieInfo += movie.getName() + " -- " + movie.getCategory() +
                                "\n";
                    }
                }
                System.out.println(movieInfo);
                return "5";
            default:
                System.out.println("Please choose from one of the provided " +
                        "selections\n");
                return "-1";
        }
        return "";
    }
}
