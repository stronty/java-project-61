package hexlet.code.games;

import static hexlet.code.games.GameConstants.PRIME_NUMBERS_START;
import static hexlet.code.games.GameConstants.PRIME_RANGE;

public class PrimeNumbers {

    public static boolean isPrime(int number) {
        int numRoot = (int) Math.sqrt(number);

        if (number < 2) {
            return  false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return  false;
        }

        var i = PRIME_NUMBERS_START;
        do {
            if (number % i == 0) {
                return false;
            }
            i += 2;
        } while (i <= numRoot);

        return true;
    }
    public static String[] game() {

        int randomNum = (int) (Math.random() * PRIME_RANGE);
        String answer = isPrime(randomNum) ? "yes" : "no";

        return new String[]{Integer.toString(randomNum), answer};

    }
    public static String getRule() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
}
