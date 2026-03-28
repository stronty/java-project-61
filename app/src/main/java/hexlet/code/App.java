package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Engine.gamesList();

        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        int userInput = Integer.parseInt(scanner.nextLine());

        Engine.startGame(userInput);

    }
}