package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void cli(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games");
        System.out.print("May I have your name? ");
        String username = scanner.nextLine();
        System.out.println("\nHello, " + username + "!");

        scanner.close();
    }
}
