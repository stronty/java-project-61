package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    public static int[] calculateGCD(){
        int randNum1 = (int)(Math.random() * 100);
        int randNum2 = (int)(Math.random() * 100);

        //Euclidean Algorithm
        int a = Math.max(randNum1, randNum2);
        int b = Math.min(randNum1, randNum2);

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return new int[]{randNum1,randNum2, a};
    }

    public static void game(){
        Cli.cli();
        System.out.println("Find the greatest common divisor of given numbers.");

        Scanner scanner = new Scanner(System.in);

        for(var i = 0; i < 3; i++){
            var mathProblem = calculateGCD();
            var num1 = mathProblem[0];
            var num2 = mathProblem[1];
            var answer = mathProblem[2];

            System.out.println("Question: " + num1 + " " + num2);
            System.out.print("Your answer: ");
            int guess = scanner.nextInt();
            scanner.nextLine();

            if (guess == answer) {
                System.out.println("Correct!");
            } else {
                Engine.loseGame(Integer.toString(guess), Integer.toString(answer));
                return;
            }
        }
        Engine.winGame();
    }
}
