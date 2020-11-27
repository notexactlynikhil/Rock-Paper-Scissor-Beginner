import java.io.IOException;
import java.util.Scanner;
public class Details {

    protected static String player = "";
    protected static int maxPoints = 0;
    protected static String bot = "";

    protected void showDetails() throws InterruptedException, IOException {
        Step stepper = new Step();
        Scanner scan = new Scanner(System.in);
        System.out.println("This is a classic game of Rock Paper Scissors!");

        stepper.printThisStepByStep("Enter your name: ", 80);
        player = scan.next();
        System.out.println();
        stepper.printThisStepByStep("Name your bot: ", 80);
        bot = scan.next();
        System.out.println();

        stepper.printThisStepByStep(String.format("=== %s VS %s ===\n", player.toUpperCase(), bot.toUpperCase()), 80);
        //System.out.println("\t====================================");

        stepper.printThisStepByStep(String.format("%s how much max points do you prefer: \n", player), 80);
        maxPoints = scan.nextInt();

        ClearScreen.ClearOutputWindow();
        System.out.println("Winning target: " + maxPoints);
    }

}
