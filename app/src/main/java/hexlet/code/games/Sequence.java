package hexlet.code.games;


import static hexlet.code.games.GameConstants.STANDARD_RANGE;
import static hexlet.code.games.GameConstants.SEQ_STEP_RANGE;
import static hexlet.code.games.GameConstants.SEQ_MAX_LENGTH;
import static hexlet.code.games.GameConstants.SEQ_MIN_LENGTH;


public class Sequence {


    public static String[] game() {
        int start = (int) (Math.random() * STANDARD_RANGE);
        int step = ((int) (Math.random() * SEQ_STEP_RANGE + 1));

        int length = (int) (Math.random() * (SEQ_MAX_LENGTH - SEQ_MIN_LENGTH + 1) + SEQ_MIN_LENGTH);

        int answerIndex = (int) (Math.random() * length);

        var problem = "";
        String answer = "";

        for (var i = 0; i < length; i++) {
            var seqNumber = start + i * step;
            if (i != answerIndex) {
                problem += seqNumber + " ";
            } else {
                problem += ".. ";
                answer = Integer.toString(seqNumber);
            }
        }

        return new String[]{problem, answer};


    }

    public static String getRule() {
        return "What number is missing in the progression?\n";
    }

}
