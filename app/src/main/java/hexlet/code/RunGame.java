package hexlet.code;

import java.util.Scanner;

public class RunGame {
    private static boolean printed = false;
    private static String username;
    private static String answer;
    private static String guess;
    private static String problem;

    public static boolean playRound(String rule, String[] gameData) {
        problem = gameData[0];
        answer = gameData[1];

        if (!printed) {
            printUserName();
            System.out.println(rule);
            printed = true;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Question: " + problem);
        System.out.print("Your answer: ");
        guess = scanner.nextLine();

        return answer.equals(guess);

    }

    private static void printUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        username = scanner.nextLine();
        System.out.println("Hello, " + username + "!\n");
    }

    public static String getAnswer() {
        return answer;
    }

    public static String getGuess() {
        return guess;
    }

    public static String getUsername() {
        return username;
    }

}
