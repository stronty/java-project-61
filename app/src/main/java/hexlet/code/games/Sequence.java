package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Sequence {

    public static int seqGenerate(){
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

        return seq[answerIndex];

    }

    public static void game(){
        Cli.cli();
        System.out.println("What number is missing in the progression?\n");



        Scanner scanner = new Scanner(System.in);

        for(var i = 0; i < 3; i++){
            System.out.println("Question: ");
            int answer = seqGenerate();
            System.out.print("\nYour answer: ");
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
