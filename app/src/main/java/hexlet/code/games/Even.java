package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.games.GameConstants.STANDARD_RANGE;
import static hexlet.code.games.GameConstants.TOTAL_ROUNDS;

public class Even {


    public static void game() {
        Cli.cli();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");



        Scanner scanner = new Scanner(System.in);
        var i = 0;
        while (i < TOTAL_ROUNDS) {
            int randomNum = (int) (Math.random() * STANDARD_RANGE + 1);
            String answer = randomNum % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String guess = scanner.nextLine();

            if (answer.equals(guess)) {
                System.out.println("Correct!");
                i++;
            } else {
                Engine.loseGame(guess, answer);
                return;
            }
        }
        Engine.winGame();
    }
}
