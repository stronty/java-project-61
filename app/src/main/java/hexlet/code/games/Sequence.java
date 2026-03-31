package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Sequence {
    private static int answer;
    private static String guess;

    public static void seqGenerate(){
        int start = (int)(Math.random() * 25);
        int step = ((int)(Math.random() * 10 + 1));

        int min = 5;
        int max = 10;
        int length = (int)(Math.random() * (max - min + 1) + min);
        var seq = new int[length];

        int answerIndex = (int) (Math.random() * length);

        for(var i = 0; i < length; i++){
            seq[i] = start + i * step;
            if(i != answerIndex){
                System.out.print(seq[i] + " ");
            }else{
                System.out.print(".. ");
            }
        }

        answer = seq[answerIndex];


    }

    public static void game(){
        Cli.cli();
        // Rule for the game
        System.out.println("What number is missing in the progression?\n");
        //Core mechanic


        Scanner scanner = new Scanner(System.in);

        for(var i = 0; i < 3; i++){
            System.out.println("Question: ");
            seqGenerate();
            System.out.print("\nYour answer: ");
            guess = scanner.nextLine();
            if (!Engine.keepPlaying(guess, "" + answer)){
                return;
            }
        }
        Engine.winGame();
    }

}
