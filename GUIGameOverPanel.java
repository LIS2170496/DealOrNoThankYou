import javax.swing.*;
import java.awt.*;

public class GUIGameOverPanel extends JPanel {
    int panelWidth = 1100;
    int panelHeight = 550;

    public GUIGameOverPanel() {

        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    }
}
