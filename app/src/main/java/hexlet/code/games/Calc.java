package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

import static hexlet.code.games.GameConstants.STANDARD_RANGE;
import static hexlet.code.games.GameConstants.TOTAL_OPERATORS;
import static hexlet.code.games.GameConstants.TOTAL_ROUNDS;

public class Calc {


    public static void game() {
        Cli.cli();
        System.out.println("What is the result of the expression?");


        Scanner scanner = new Scanner(System.in);

        for (var i = 0; i < TOTAL_ROUNDS; i++) {
            int randNum1 = (int) (Math.random() * STANDARD_RANGE);
            int randNum2 = (int) (Math.random() * STANDARD_RANGE);
            int operatorIndex = (int) (Math.random() * TOTAL_OPERATORS);
            String operator;

            int answer;

            switch (operatorIndex) {
                case 0:
                    answer = randNum1 + randNum2;
                    operator = " + ";
                    break;
                case 1:
                    answer = randNum1 - randNum2;
                    operator = " - ";
                    break;
                case 2: default:
                    answer = randNum1 * randNum2;
                    operator = " * ";
                    break;
            }

            System.out.println("Question: " + randNum1 + operator + randNum2);
            System.out.print("Your answer: ");
            int guess = scanner.nextInt();
            scanner.nextLine();
            if (guess == answer) {
                System.out.println("Correct!");
            } else {
                Engine.loseGame(Integer.toString(guess), Integer.toString(answer));
                return;
            }
        }
        Engine.winGame();
    }
}
