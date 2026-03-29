package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

public class Engine {
    public static void gamesList(){
        System.out.println("Please enter the game number and press Enter");
        String[] gamesList = {
                "1 - Greet",
                "2 - Even",
                "3 - Calc",
                "4 - GCD",
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
               Even.evenGame();
               break;
           case 3:
               Calc.calc();
               break;
           case 4:
               GCD.gcd();
               break;
           case 0: default:
               return;
       }

    }




}
