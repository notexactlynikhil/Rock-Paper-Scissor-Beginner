import java.lang.InterruptedException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Game extends Details {

    //super essential variables haha
    protected static int playerPoints = 0;
    protected static int botPoints = 0;
    private static int playerIndex;
    private int botIndex;
    protected static String playerChoice;
    protected static String botChoice;
    protected String winner;
    final static Scanner sc = new Scanner(System.in);
    static boolean playerMusic = true;
    static boolean botMusic = true;

    protected final void startGame() throws InterruptedException, IOException {
        Random dice = new Random();

        // Available Choices of Rock Paper or Scissor
        final String[] choices = {"Rock", "Paper", "Scissor"};

        while (playerPoints < maxPoints && botPoints < maxPoints) {

            System.out.println();
            System.out.println("====================================");
            System.out.printf("Hey %s enter 'r' to roll: \n", player);
            char roller;
            roller = sc.next().charAt(0);
            //this method clears the previous output
            ClearScreen.ClearOutputWindow();
            System.out.println("====================================");
            
            //sc.hasNext(); // clears the buffer

            if (roller == 'r') { //this block of if bla-bla takes the input from the user to use the RANDOM function
                playerIndex = dice.nextInt(3);
                playerChoice = choices[playerIndex];
                System.out.println(player + " has put " + playerChoice);
            }

            botIndex = dice.nextInt(3);
            botChoice = choices[botIndex];

            System.out.println("====================================");
            System.out.print(bot + " is deciding what to put");

            //displays 3 dots one by one as if bot is deciding somethin
            for(int i = 0; i < 3; i++){
                Thread.sleep(500);
                System.out.print(".");
            }
            
            System.out.printf("\n%s has put %s\n".toUpperCase(), bot, botChoice);
            System.out.println();
            System.out.println("====================================");
            
            final AI i = new AI();
            i.decidePointsNScore();
            if(playerPoints == maxPoints - 1 || botPoints == maxPoints - 1){
                if(playerPoints == maxPoints - 1){
                    playerMusic = false;
                }
                else if(botPoints == maxPoints - 1){
                    botMusic = false;
                }
            }
            if(botPoints >= maxPoints || playerPoints >= maxPoints){
                if(playerPoints >= maxPoints){
                    winner = player;
                    break;
                }
                else if(botPoints >= maxPoints){
                    winner = bot;
                    break;
                }
            }
        }
        declareWinner();
        if(winner.equals(bot)){
            Music.playRespectiveSound("Music/Epic Fail - Sound Effect SFX Full HD (320 kbps).wav/");
        }
        else if(winner.equals(player)){
            Music.playRespectiveSound("Music/Super Mario Bros. Music - Level Complete (320 kbps).wav/");
        }
    }
    private final void declareWinner() throws InterruptedException, IOException {
        
        ClearScreen.ClearOutputWindow();
        System.out.println();
        System.out.println(player + "'s' Score: " + playerPoints);
        System.out.println(bot + "'s Score: " + botPoints);
        System.out.println();
        
        if(winner.equals(player)){
            System.out.println();
            System.out.println("We have a winner :)");
            System.out.println("And its " + player + "!");
        }
        else if(winner.equals(bot)){
            System.out.println();
            System.out.println(bot + " wins!! and " + player + " loses...");

       }
    }
}