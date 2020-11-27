public class Step{
    void printThisStepByStep(String text, int time) throws InterruptedException {
        for(int i = 0; i < text.length(); i++){
        System.out.print(text.charAt(i));
        Thread.sleep(time);
        }
        //System.out.println();
    }
}