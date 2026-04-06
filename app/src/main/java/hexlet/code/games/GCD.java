package hexlet.code.games;

import static hexlet.code.games.GameConstants.STANDARD_RANGE;

public class GCD {
    public static int[] calculateGCD() {
        int randNum1 = (int) (Math.random() * STANDARD_RANGE);
        int randNum2 = (int) (Math.random() * STANDARD_RANGE);

        //Euclidean Algorithm
        int a = Math.max(randNum1, randNum2);
        int b = Math.min(randNum1, randNum2);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return new int[]{randNum1, randNum2, a};
    }

    public static String[] game() {


        var mathProblem = calculateGCD();
        var problem = mathProblem[0] + " " + mathProblem[1];
        var answer = mathProblem[2];

        return new String[] { problem, Integer.toString(answer) };

    }
    public static String getRule() {
        return "Find the greatest common divisor of given numbers.";
    }
}
