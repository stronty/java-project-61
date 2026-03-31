package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class PrimeNumbers {

    public static boolean isPrime(int number){
        int numRoot = (int) Math.sqrt(number);

        if(number < 2){
            return  false;
        }

        if(number == 2){
            return true;
        }

        if(number % 2 == 0 ){
            return  false;
        }

        var i = 3;
        do{
            if(number % i == 0){
                return false;
            }
            i += 2;
        } while(i <= numRoot);

        return true;
    }
    public static void game(){
        Cli.cli();
        System.out.println("Answer 'yes' if the number is prime, otherwise answer 'no'.");



        Scanner scanner = new Scanner(System.in);

        for(var i = 0; i < 3; i++){
            int randomNum = (int)(Math.random() * 200);
            String answer = isPrime(randomNum) ? "yes" : "no";
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String guess = scanner.nextLine();

            if (guess.equals(answer)) {
                System.out.println("Correct!");
            } else {
                Engine.loseGame(guess, answer);
                return;
            }
        }
        Engine.winGame();
    }
}
