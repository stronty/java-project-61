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
import static hexlet.code.games.GameConstants.TOTAL_ROUNDS;

public class GenGame {

    public static String[][] genRounds(int gameNum, int totalRounds) {
        String[][] rounds = new String[totalRounds][2];

        for (var i = 0; i < TOTAL_ROUNDS; i++) {
            switch (gameNum) {
                case MENU_EVEN:
                    rounds[i] = Even.game();
                    break;
                case MENU_CALC:
                    rounds[i] = Calc.game();
                    break;
                case MENU_GCD:
                    rounds[i] = GCD.game();
                    break;
                case MENU_SEQUENCE:
                    rounds[i] = Sequence.game();
                    break;
                case MENU_PRIME_NUMBERS:
                    rounds[i] = PrimeNumbers.game();
                    break;
            }
        }

        return rounds;
    }
}
