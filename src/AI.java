
public class AI {

    public final void letBotScore(){

        Game.botPoints++;
        System.out.println();
        System.out.println("==============================================");
        //System.out.println("Bot scores one point!!");
        if(Game.botMusic == true){
            Music.playRespectiveSound("Music/Mario Lose a Life Sound Effect [Free Ringtone Download] (320 kbps).wav/");
        }
        
        System.out.println("Bot: " + Game.botPoints);
        System.out.printf("%s's Score: %s\n", Details.player, Game.playerPoints);
        //System.out.println();

    }

    public final void letPlayerScore(){
        
        Game.playerPoints++;
        System.out.println();
        System.out.println("==============================================");
        //System.out.println(Details.player + " scores one point!!");
        if(Game.playerMusic == true){
            Music.playRespectiveSound("Music/TADA.wav/");
        }
        System.out.printf("%s's Score: %s\n", Details.player, Game.playerPoints);
        System.out.println("Bot's Score: " + Game.botPoints);
        //System.out.println();

    }

    public final void noScore(){

        System.out.println("No one scores :( ");
        Music.playRespectiveSound("Music/beep.wav/");

    }

    public final void decidePointsNScore(){

        if(Game.playerChoice.equals(Game.botChoice)){

            noScore();

        }

        if(Game.playerChoice.equals("Rock") && Game.botChoice.equals("Scissor")){

            //System.out.println("Haha, " +Details.player + "'s Rock smashed bot's Scissor!");
            letPlayerScore();

        }

        else if(Game.playerChoice.equals("Scissor") && Game.botChoice.equals("Rock")){

            //System.out.println("Haha, " + Details.bot + "'s Rock smashed " + Details.player +  "'s Scissor!");
            letBotScore();

        }

        else if(Game.playerChoice.equals("Scissor") && Game.botChoice.equals("Paper")){

            //System.out.println("Haha, " + Details.player + "'s Scissor cuts " + Game.bot +" Paper!");
            letPlayerScore();

        }

        else if(Game.playerChoice.equals("Paper") && Game.botChoice.equals("Scissor")){

            //System.out.println("Haha, " + Game.bot + "'s Scissor cuts " + Game.player +  "'s Paper!");
            letBotScore();

        }

        else if(Game.playerChoice.equals("Paper") && Game.botChoice.equals("Rock")){

            //System.out.println("Haha, " + Game.player + "'s Paper' has wrapped " + Game.bot + "'s Rock'");
            letPlayerScore();

        }

        else if(Game.playerChoice.equals("Rock") && Game.botChoice.equals("Paper")){

            //System.out.println("Haha, " + Game.bot + "'s Paper' has wrapped " + Game.player + "'s Rock'");
            letBotScore();

        }
    
    }
    
}