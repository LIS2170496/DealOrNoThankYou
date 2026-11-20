import javax.swing.*;
import java.awt.*;

public class GUICasePanel extends JPanel {
    
    int panelWidth = 100;
    int panelHeight = 100;
    JLabel caseNumber;

    GUICasePanel(String caseString) {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setBackground(Color.decode("#c1c0c3"));
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setLayout(new GridBagLayout());

        caseNumber = new JLabel(caseString);
        caseNumber.setFont(new Font("Arial", Font.BOLD, 30));
        this.add(caseNumber);
    }


}
