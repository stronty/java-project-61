package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.PrimeNumbers;
import hexlet.code.games.Sequence;

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
        switch (gameNum) {
            case MENU_GREET:
                Cli.cli();
                return;
            case MENU_EVEN:
                Even.game();
                break;
            case MENU_CALC:
                Calc.game();
                break;
            case MENU_GCD:
                GCD.game();
                break;
            case MENU_SEQUENCE:
                Sequence.game();
                break;
            case MENU_PRIME_NUMBERS:
                PrimeNumbers.game();
                break;
            case EXIT: default:
                break;
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
