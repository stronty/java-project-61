package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");

        System.out.println("0 - Exit");

        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        switch (Integer.parseInt(userInput)){
            case 1:
                Cli.cli();
                break;

            case 2:
                Cli.cli();
                Even.evenGame();

            case 0:
                scanner.close();
        }
    }

}
