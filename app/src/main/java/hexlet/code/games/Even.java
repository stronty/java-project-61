package hexlet.code.games;

import java.util.Scanner;

public class Even {
    private static String guess;
    private static String answer;


    public static void evenGame(){
        Cli.cli();
        // Rule for the game
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        //Core mechanic


        Scanner scanner = new Scanner(System.in);

        for(var i = 0; i < 3; i++){
            int randomNum = (int)(Math.random() * 100);
            answer = randomNum % 2 == 0 ? "yes" : "no" ;
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            guess = scanner.nextLine();
            if (!Game.keepPlaying(guess, answer)){
                return;
            }
        }
        Game.winGame();
    }
}
