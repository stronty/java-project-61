package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games");
        Engine.gamesList();

        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        scanner.nextLine();


        Engine.startGame(userInput);
        scanner.close();
    }
}