import javax.swing.*;
import java.awt.*;

public class CasePanel extends JPanel {
    
    int panelWidth = 100;
    int panelHeight = 100;
    JLabel caseNumber;

    CasePanel(String caseString) {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setBackground(Color.pink);
        this.setLayout(new GridBagLayout());
        caseNumber = new JLabel(caseString);
        this.add(caseNumber);
    }


}
