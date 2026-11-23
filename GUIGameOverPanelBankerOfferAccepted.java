import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.*;
import java.awt.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.sound.sampled.*;




public class GUIGameOverPanelBankerOfferAccepted extends GUIGameOverPanel {
    //REQUIREMENT 2 - PARENT CLASS EXTENDED

    int panelWidth = 1100;
    int panelHeight = 550;

    String filepathString;
    Path soundFilePath;
    boolean soundFileExists;
    String originalCaseString = null;

    //REQUIREMENT 6 - METHOD THROWS CUSTOM EXCEPTION
    public GUIGameOverPanelBankerOfferAccepted(double amount) throws FileNotFoundException{

        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        filepathString = "applauseSmall.wav";
        soundFilePath = Path.of(filepathString);
        soundFileExists = Files.exists(soundFilePath);

        double winAmount = amount;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String congratulationsString = "Offer Accepted!";
        String winAmountString = "You have won " + currencyFormat.format(winAmount);

        JLabel congratulationsLabel = new JLabel(congratulationsString);
        congratulationsLabel.setFont(new Font("Arial Black", Font.BOLD, 48));
        congratulationsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(congratulationsLabel);

        JLabel winAmountLabel = new JLabel(winAmountString);
        winAmountLabel.setFont(new Font("Arial Black", Font.BOLD, 48));
        winAmountLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(winAmountLabel);


        //REQUIREMENT 7 - READ FROM A FILE
        try {
            InputStream incoming = null;
            incoming = Files.newInputStream(DealOrNoThankYou.gameRoundOpenCases.winningCaseFile.toPath());
            BufferedReader reader = new BufferedReader(new InputStreamReader(incoming));
            originalCaseString = reader.readLine();
            reader.close();
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,
            e.getMessage() ,"ERROR", JOptionPane.PLAIN_MESSAGE);
        }

        JLabel originalCaseLabel = new JLabel(originalCaseString);
        originalCaseLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        originalCaseLabel.setBorder(BorderFactory.createEmptyBorder(250,0,0,0));
        add(originalCaseLabel);



        if (soundFileExists) {
            playWinSound();
        }
        else {
            throw(new FileNotFoundException(filepathString));
        }
    }



    @Override 
    public void playWinSound() {
        //REQUIREMENT 10 - AUDIO
        try {
            File file = new File(filepathString);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            clip.start();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,
            e.getMessage() ,"ERROR", JOptionPane.PLAIN_MESSAGE);
        }
    }
}