import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.*;
import java.awt.*;

import java.io.*;
import javax.sound.sampled.*;


public class GUIGameOverPanelBankerOfferAccepted extends GUIGameOverPanel {
    int panelWidth = 1100;
    int panelHeight = 550;

    public GUIGameOverPanelBankerOfferAccepted(double amount) {

        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

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

        playWinSound();
    }



    @Override 
    public void playWinSound() {
        //FIXME - maybe this can be custom exception throw

        //FIXME - add attribution
        // a small applause
        // https://freesound.org/people/Robo9418/sounds/863035/


        try {
            File file = new File("applauseSmall.wav");
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