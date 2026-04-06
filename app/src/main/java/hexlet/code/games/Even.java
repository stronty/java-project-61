package hexlet.code.games;


import static hexlet.code.games.GameConstants.STANDARD_RANGE;

public class Even {


    public static String[] game() {

        int randomNum = (int) (Math.random() * STANDARD_RANGE + 1);
        String answer = randomNum % 2 == 0 ? "yes" : "no";

        return new String[]{Integer.toString(randomNum), answer};
    }

    public static String getRule() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
}
