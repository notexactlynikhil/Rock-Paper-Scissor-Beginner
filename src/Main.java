import java.io.IOException;

public class Main {
    /***
     * The Ultimate Terminal Game (haha)
     * has been created by Nikhil
     * on a day when no
     * one was
     * alive in this world.
     */
    //author NIKHIL
    Main() throws IOException, InterruptedException {
        final Details detailer = new Details();
        Game gamer = new Game();
        detailer.showDetails();
        gamer.startGame();
    }
    public static void main(String [] args) throws IOException, InterruptedException{
        new Main();
    }
    
}