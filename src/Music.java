import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

//this class is made to play music
//for different situations (fail, win)
final class Music {
    public static void playRespectiveSound(String musicPath){
        try {
            final AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new java.io.File(musicPath).getAbsoluteFile());
            final Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(final Exception e) {
            System.out.println("Error with playing sound.");
            e.printStackTrace();
        }
    }
    /*
    public static void playFailSound(){
        try {
            final AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new java.io.File("Music/Mario Lose a Life Sound Effect [Free Ringtone Download] (320 kbps).wav/").getAbsoluteFile());
            final Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(final Exception e) {
            System.out.println("Error with playing sound.");
            e.printStackTrace();
        }
    }

    public static void playWinSound(){
        try {
            final AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new java.io.File("Music/rebuilt win mario.wav/").getAbsoluteFile());
            final Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(final Exception e) {
            System.out.println("Error with playing sound.");
            e.printStackTrace();
        }
    }*/
    public static void playPlayerWinnerSong(){
        try {
            System.out.println("entered player win song");
            final AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new java.io.File("Music/Super Mario Bros. Music - Level Complete (320 kbps).wav").getAbsoluteFile());
            final Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(final Exception e) {
            System.out.println("Error with playing sound.");
            e.printStackTrace();
        }
    }
    public static void playBotWinnerSong(){
        try {
            System.out.println("enter bot win song");
            final AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new java.io.File("Music/Epic Fail - Sound Effect SFX Full HD (320 kbps).wav").getAbsoluteFile());
            final Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(final Exception e) {
            System.out.println("Error with playing sound.");
            e.printStackTrace();
        }
    }
}
