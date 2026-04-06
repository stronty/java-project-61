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
        var i = 0;
        while(i < TOTAL_ROUNDS){
            switch (gameNum) {
                case MENU_GREET:
                    Cli.cli();
                    return;
                case MENU_EVEN:
                    i = BuildGame.buildGame(Even.getRule(), Even.game(), i, true);
                    break;
                case MENU_CALC:
                    i = BuildGame.buildGame(Calc.getRule(), Calc.game(), i, false);
                    break;
                case MENU_GCD:
                    i = BuildGame.buildGame(GCD.getRule(), GCD.game(), i, false);
                    break;
                case MENU_SEQUENCE:
                    i = BuildGame.buildGame(Sequence.getRule(), Sequence.game(), i, false);
                    break;
                case MENU_PRIME_NUMBERS:
                    i = BuildGame.buildGame(PrimeNumbers.getRule(), PrimeNumbers.game(), i, false);
                    break;
                case EXIT: default:
                    break;
            }
        }

    }

    public static void loseGame(String guess, String answer) {
        System.out.println("'" + guess + "' is wrong answer ;(. "
                + "Correct answer was '" + answer + "'.");

        System.out.println("Let's try again, " + Cli.getUsername() + "!");
    }

    public static void winGame() {
        System.out.println("\nCongratulations, " + Cli.getUsername() + "!");
    }



}
