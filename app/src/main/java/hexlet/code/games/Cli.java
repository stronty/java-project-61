package hexlet.code.games;

import java.util.Scanner;

public class Cli {
    public static void cli() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var username = scanner.nextLine();
        System.out.println("Hello, " + username + "!\n");

    }

}
