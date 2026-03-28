package hexlet.code;

import java.util.Scanner;

public class Even {

        public static void evenGame(){
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

            var winsInRow = 0;
            var goal = 3;

            Scanner scanner = new Scanner(System.in);

            while(winsInRow <  goal){
                int randomNum = (int)(Math.random() * 100);
                String answer = randomNum % 2 == 0 ? "yes" : "no" ;
                System.out.println("Question: " + randomNum);
                System.out.print("Your answer: ");
                String guess = scanner.nextLine();

                if(answer.equals(guess)){
                    winsInRow++;
                    System.out.println("Correct!");
                }else {
                    System.out.println("'" + guess + "' is wrong asnwer ;(. " +
                            "Correct answer was '" + answer + "'." );
                    scanner.close();
                    return;
                }
            }
            scanner.close();
            System.out.println("Congratulations, " + Cli.getUsername() + "!");
    }
}
