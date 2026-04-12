package hexlet.code;


import hexlet.code.games.Cli;

import java.util.Scanner;

import static hexlet.code.games.GameConstants.EXIT;
import static hexlet.code.games.GameConstants.MENU_GREET;
import static hexlet.code.games.GameConstants.TOTAL_ROUNDS;

public class Engine {

    public static void gamesList() {
        System.out.println("Please enter the game number and press Enter");
        String[] gamesList = {
            "1 - Greet",
            "2 - Even",
            "3 - Calc",
            "4 - GCD",
            "5 - Progression",
            "6 - Prime",
            "0 - Exit"
        };

        for (var game:gamesList) {
            System.out.println(game);
        }
    }

    public static void startGame(int gameNum) {
        String[][] gameData;
        Scanner scanner = new Scanner(System.in);
        String username;

        if (gameNum == MENU_GREET) {
            Cli.cli();
            return;
        } else if (gameNum == EXIT) {
            return;
        } else {
            gameData = GenGame.genRounds(gameNum, TOTAL_ROUNDS);
        }

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        username = scanner.nextLine();
        System.out.println("Hello, " + username + "!\n");

        System.out.println(gameData[gameData.length - 1][0]);

        for (var i = 0; i < TOTAL_ROUNDS; i++) {
            var question = gameData[i][0];
            var answer = gameData[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String guess = scanner.nextLine();

            if (answer.equals(guess)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + guess + "' is wrong answer ;(. "
                        + "Correct answer was '" + answer + "'.");
                System.out.println("Let's try again, " + username + "!");
                return;
            }
        }
        System.out.println("\nCongratulations, " + username + "!");

    }

}
