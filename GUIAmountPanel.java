import javax.swing.*;
import java.awt.*;

public class GUIAmountPanel extends JPanel {
    
    int panelWidth = 150;
    int panelHeight = 40;
    JLabel amountLabel;

    GUIAmountPanel(String amountString) {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setBackground(Color.decode("#f8ca60"));
        this.setBorder(BorderFactory.createLineBorder(Color.decode("#d39505")));
        this.setLayout(new GridBagLayout());

        amountLabel = new JLabel(amountString);
        amountLabel.setFont(new Font("Arial", Font.BOLD, 18));
        this.add(amountLabel);
    }
}
