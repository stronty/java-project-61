package hexlet.code;

import hexlet.code.games.*;

public class Engine {
    public static void gamesList(){
        System.out.println("Please enter the game number and press Enter");
        String[] gamesList = {
                "1 - Greet",
                "2 - Even",
                "3 - Calc",
                "4 - GCD",
                "5 - Progression",
                "6 - Prime",
                "0 - Exit"
        };

        for(var game:gamesList) System.out.println(game);
    }

    public static void startGame(int gameNum){

       switch (gameNum) {
           case 1:
               Cli.cli();
               return;
           case 2:
               Even.game();
               break;
           case 3:
               Calc.game();
               break;
           case 4:
               GCD.game();
               break;
           case 5:
               Sequence.game();
               break;
           case 6:
               PrimeNumbers.game();
               break;
           case 0: default:
               break;
       }

    }


    public static void loseGame(String guess, String answer){
        System.out.println("'" + guess + "' is wrong asnwer ;(. " +
                "Correct answer was '" + answer + "'." );
    }

    public static void winGame(){
        System.out.println("\nCongratulations, " + Cli.getUsername() + "!");
    }



}
