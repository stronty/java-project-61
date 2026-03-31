package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    private static String guess;


    public static void game(){
        Cli.cli();
        System.out.println("What is the result of the expression?");


        Scanner scanner = new Scanner(System.in);

        for(var i = 0; i < 3; i++){
            int randNum1 = (int)(Math.random() * 100);
            int randNum2 = (int)(Math.random() * 100);
            int max = 2;
            int operatorIndex = (int) (Math.random() * (max + 1));
            String operator;

            int answer;
            if( operatorIndex == 0){
                answer = randNum1 + randNum2;
                operator = "+";
            }else if( operatorIndex == 1){
                answer = randNum1 - randNum2;
                operator = "-";
            }else{
                answer = randNum1 * randNum2;
                operator = "*";
            }

            System.out.println("Question: " + randNum1 + operator + randNum2);
            System.out.print("Your answer: ");
            guess = scanner.nextLine();
            if (!Engine.keepPlaying(guess, Integer.toString(answer))){
                return;
            }
        }
        Engine.winGame();
    }
}
