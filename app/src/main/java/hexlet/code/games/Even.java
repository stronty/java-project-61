package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {


    public static void game(){
        Cli.cli();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");



        Scanner scanner = new Scanner(System.in);

        for(var i = 0; i < 3; i++){
            int randomNum = (int)(Math.random() * 100);
            String answer = randomNum % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String guess = scanner.nextLine();

            if (answer.equals(guess)) {
                System.out.println("Correct!");
            } else {
                Engine.loseGame(guess, answer);
                return;
            }
        }
        Engine.winGame();
    }
}
