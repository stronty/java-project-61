package hexlet.code;

import hexlet.code.games.Cli;

import java.util.Scanner;

import static hexlet.code.games.GameConstants.TOTAL_ROUNDS;

public class BuildGame {
    private static boolean printed = false;
    private static String username;

    public static int buildGame(String rule, String[] gameData, int i) {
        var problem = gameData[0];
        var answer = gameData[1];
        var i1 = i;


        if (!printed) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            username = scanner.nextLine();
            System.out.println("Hello, " + username + "!\n");

            System.out.println(rule);
            printed = true;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Question: " + problem);
        System.out.print("Your answer: ");
        String guess = scanner.nextLine();

        if (guess.equals(answer)) {
            System.out.println("Correct!");
            i1++;
            if (i1 == TOTAL_ROUNDS) {
                System.out.println("\nCongratulations, " + username + "!");
            }
        } else {
            i1 = TOTAL_ROUNDS;

            printLoseGame(guess, answer);

        }
        return i1;
    }

    public static void printLoseGame(String guess, String answer) {
        System.out.println("'" + guess + "' is wrong answer ;(. "
                + "Correct answer was '" + answer + "'.");

        System.out.println("Let's try again, " + username + "!");
    }
}
