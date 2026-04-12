package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.PrimeNumbers;
import hexlet.code.games.Sequence;

import static hexlet.code.games.GameConstants.MENU_CALC;
import static hexlet.code.games.GameConstants.MENU_EVEN;
import static hexlet.code.games.GameConstants.MENU_GCD;
import static hexlet.code.games.GameConstants.MENU_PRIME_NUMBERS;
import static hexlet.code.games.GameConstants.MENU_SEQUENCE;

public class GenGame {

    public static String[][] genRounds(int gameNum, int totalRounds) {
        String[][] rounds = new String[totalRounds + 1][];
        rounds[totalRounds] = new String[1];

        for (var i = 0; i < totalRounds; i++) {
            switch (gameNum) {
                case MENU_EVEN:
                    rounds[i] = Even.game();
                    rounds[totalRounds][0] = Even.getRule();
                    break;
                case MENU_CALC:
                    rounds[i] = Calc.game();
                    rounds[totalRounds][0] = Calc.getRule();
                    break;
                case MENU_GCD:
                    rounds[i] = GCD.game();
                    rounds[totalRounds][0] = GCD.getRule();
                    break;
                case MENU_SEQUENCE:
                    rounds[i] = Sequence.game();
                    rounds[totalRounds][0] = Sequence.getRule();
                    break;
                case MENU_PRIME_NUMBERS:
                    rounds[i] = PrimeNumbers.game();
                    rounds[totalRounds][0] = PrimeNumbers.getRule();
                    break;
                default:
                    break;
            }
        }

        return rounds;
    }
}
