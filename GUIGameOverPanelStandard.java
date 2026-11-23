import java.text.NumberFormat;
import java.util.Locale;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class GUIGameOverPanelStandard extends GUIGameOverPanel {
    //REQUIREMENT 2 - PARENT CLASS EXTENDED

    int panelWidth = 1100;
    int panelHeight = 550;

    String filepathString;
    Path soundFilePath;
    boolean soundFileExists;

    public GUIGameOverPanelStandard (double amount) throws FileNotFoundException {

        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        filepathString = "applauseLarge.wav";
        soundFilePath = Path.of(filepathString);
        soundFileExists = Files.exists(soundFilePath);

        double winAmount = amount;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String congratulationsString = "Congratulations!";
        String winAmountString = "You have won " + currencyFormat.format(winAmount);

        JLabel congratulationsLabel = new JLabel(congratulationsString);
        congratulationsLabel.setFont(new Font("Arial Black", Font.BOLD, 48));
        congratulationsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(congratulationsLabel);

        JLabel winAmountLabel = new JLabel(winAmountString);
        winAmountLabel.setFont(new Font("Arial Black", Font.BOLD, 48));
        winAmountLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(winAmountLabel);

        if (soundFileExists) {
            playWinSound();
        }
        else {
            throw(new FileNotFoundException(filepathString));
        }
    }



    //REQUIREMENT 1 - OVERLOADED CONSTRUCTOR
    public GUIGameOverPanelStandard (double amount, boolean winSuperDuper) throws FileNotFoundException {
        
        //FIXME - add super duper colors

        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        filepathString = "aSuperDuperWin.wav";
        soundFilePath = Path.of(filepathString);
        soundFileExists = Files.exists(soundFilePath);

        double winAmount = amount;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String congratulationsString = "Congratulations!";
        String winAmountString = "You have won " + currencyFormat.format(winAmount);

        JLabel congratulationsLabel = new JLabel(congratulationsString);
        congratulationsLabel.setFont(new Font("Arial Black", Font.BOLD, 48));
        add(congratulationsLabel);

        JLabel winAmountLabel = new JLabel(winAmountString);
        winAmountLabel.setFont(new Font("Arial Black", Font.BOLD, 48));
        add(winAmountLabel);

        if (soundFileExists) {
            playWinSoundSuperDuper();
        }
        else {
            throw(new FileNotFoundException(filepathString));
        }
    }


    //REQUIREMENT 3 - OVERRIDDEN METHOD
    @Override 
    public void playWinSound() {

        try {
            File file = new File("applauseLarge.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            AudioFormat sourceFormat = audioStream.getFormat();
            AudioFormat targetFormat = new AudioFormat(
                AudioFormat.Encoding.PCM_SIGNED, 
                sourceFormat.getSampleRate(), 
                16, 
                sourceFormat.getChannels(),
                sourceFormat.getChannels() * 2,
                sourceFormat.getSampleRate(),
                false);
            AudioInputStream convertedStream = AudioSystem.getAudioInputStream(targetFormat, audioStream);
            DataLine.Info info = new DataLine.Info(Clip.class, targetFormat);
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(convertedStream);
            clip.start();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,
            e.getMessage() ,"ERROR", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void playWinSoundSuperDuper() {

        try {
            File file = new File("aSuperDuperWin.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            AudioFormat sourceFormat = audioStream.getFormat();
            AudioFormat targetFormat = new AudioFormat(
                AudioFormat.Encoding.PCM_SIGNED, 
                sourceFormat.getSampleRate(), 
                16, 
                sourceFormat.getChannels(),
                sourceFormat.getChannels() * 2,
                sourceFormat.getSampleRate(),
                false);
            AudioInputStream convertedStream = AudioSystem.getAudioInputStream(targetFormat, audioStream);
            DataLine.Info info = new DataLine.Info(Clip.class, targetFormat);
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(convertedStream);
            clip.start();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,
            e.getMessage() ,"ERROR", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
