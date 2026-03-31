package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

import static hexlet.code.games.GameConstants.STANDARD_RANGE;
import static hexlet.code.games.GameConstants.SEQ_STEP_RANGE;
import static hexlet.code.games.GameConstants.SEQ_MAX_LENGTH;
import static hexlet.code.games.GameConstants.SEQ_MIN_LENGTH;
import static hexlet.code.games.GameConstants.TOTAL_ROUNDS;


public class Sequence {


    public static int seqGenerate() {
        int start = (int) (Math.random() * STANDARD_RANGE);
        int step = ((int) (Math.random() * SEQ_STEP_RANGE + 1));

        int length = (int) (Math.random() * (SEQ_MAX_LENGTH - SEQ_MIN_LENGTH + 1) + SEQ_MIN_LENGTH);
        var seq = new int[length];

        int answerIndex = (int) (Math.random() * length);

        for (var i = 0; i < length; i++) {
            seq[i] = start + i * step;
            if (i != answerIndex) {
                System.out.print(seq[i] + " ");
            } else {
                System.out.print(".. ");
            }
        }

        return seq[answerIndex];

    }

    public static void game() {
        Cli.cli();
        System.out.println("What number is missing in the progression?\n");



        Scanner scanner = new Scanner(System.in);

        for (var i = 0; i < TOTAL_ROUNDS; i++) {
            System.out.print("Question: ");
            int answer = seqGenerate();
            System.out.print("\nYour answer: ");
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
