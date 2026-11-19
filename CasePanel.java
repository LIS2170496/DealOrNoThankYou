import javax.swing.*;
import java.awt.*;

public class CasePanel extends JPanel {
    
    int panelWidth = 100;
    int panelHeight = 100;

    CasePanel() {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setBackground(Color.pink);
    }

    
}
