package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.PrimeNumbers;
import hexlet.code.games.Sequence;

import static hexlet.code.games.GameConstants.TOTAL_ROUNDS;

public class Engine {
    private static final int MENU_GREET = 1;
    private static final int MENU_EVEN = 2;
    private static final int MENU_CALC = 3;
    private static final int MENU_GCD = 4;
    private static final int MENU_SEQUENCE = 5;
    private static final int MENU_PRIME_NUMBERS = 6;
    private static final int EXIT = 0;

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
        var round = 0;
        boolean isCorrect;

        while (round < TOTAL_ROUNDS) {
            switch (gameNum) {
                case MENU_GREET:
                    Cli.cli();
                    return;
                case MENU_EVEN:
                    isCorrect = runGame.playRound(Even.getRule(), Even.game());
                    break;
                case MENU_CALC:
                    isCorrect = runGame.playRound(Calc.getRule(), Calc.game());
                    break;
                case MENU_GCD:
                    isCorrect = runGame.playRound(GCD.getRule(), GCD.game());
                    break;
                case MENU_SEQUENCE:
                    isCorrect = runGame.playRound(Sequence.getRule(), Sequence.game());
                    break;
                case MENU_PRIME_NUMBERS:
                    isCorrect = runGame.playRound(PrimeNumbers.getRule(), PrimeNumbers.game());
                    break;
                case EXIT: default:
                    return;
            }

            if (isCorrect) {
                round++;
                System.out.println("Correct!");
                if (round == TOTAL_ROUNDS) {
                    System.out.println("\nCongratulations, " + runGame.getUsername() + "!");
                }
            } else {
                System.out.println("'" + runGame.getGuess() + "' is wrong answer ;(. "
                        + "Correct answer was '" + runGame.getAnswer() + "'.");
                System.out.println("Let's try again, " + runGame.getUsername() + "!");
                return;
            }
        }

    }

}
