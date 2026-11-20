import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GUIWelcomePanel extends JPanel {
    int panelWidth = 1150;
    int panelHeight = 600;

    Image backgroundImage;

    GUIWelcomePanel() {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));

        try {
            backgroundImage = ImageIO.read(new File("logo.png"));
        }
        catch (IOException e) {
            e.getMessage();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
