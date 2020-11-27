import java.io.IOException;
final class ClearScreen {
 	
 	//this only works for windows (this thing is done just to maintain clarity for the user)
    protected static void ClearOutputWindow() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  //         /c is to carry out the command and then terminates
    }

}