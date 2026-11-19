import javax.swing.*;
import java.awt.*;

public class GUICasePanel extends JPanel {
    
    int panelWidth = 100;
    int panelHeight = 100;
    JLabel caseNumber;

    GUICasePanel(String caseString) {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setBackground(Color.pink);
        this.setLayout(new GridBagLayout());
        caseNumber = new JLabel(caseString);
        this.add(caseNumber);
    }


}
