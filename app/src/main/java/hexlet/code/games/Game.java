package hexlet.code.games;

public class Game {

    public static boolean keepPlaying(String guess, String answer){

        if(answer.equals(guess)){
            System.out.println("Correct!");
            return true;
        }else {
            loseGame(guess, answer);
            return false;
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
