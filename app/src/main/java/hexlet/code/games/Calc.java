package hexlet.code.games;

import static hexlet.code.games.GameConstants.STANDARD_RANGE;
import static hexlet.code.games.GameConstants.TOTAL_OPERATORS;

public class Calc {


    public static String[] game() {

        int randNum1 = (int) (Math.random() * STANDARD_RANGE);
        int randNum2 = (int) (Math.random() * STANDARD_RANGE);
        int operatorIndex = (int) (Math.random() * TOTAL_OPERATORS);
        String problem;

        int answer;

        switch (operatorIndex) {
            case 0:
                answer = randNum1 + randNum2;
                problem = randNum1 + " + " + randNum2;
                break;
            case 1:
                answer = randNum1 - randNum2;
                problem = randNum1 + " - " + randNum2;
                break;
            case 2: default:
                answer = randNum1 * randNum2;
                problem = randNum1 + " * " + randNum2;
                break;
        }

        return new String[]{problem, Integer.toString(answer)};

    }

    public static String getRule() {
        return "What is the result of the expression?";
    }
}
