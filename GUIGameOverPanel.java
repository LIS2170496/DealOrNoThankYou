import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class GUIGameOverPanel extends JPanel {
    //REQUIREMENT 2 - PARENT CLASS
    
    int panelWidth = 1100;
    int panelHeight = 550;

    public GUIGameOverPanel() {

        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    }

    public void playWinSound() {

        try {
            File file = new File("aWinSound.wav");
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
