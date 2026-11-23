import javax.swing.*;
import java.awt.*;

//REQUIREMENT 9 - SWING ELEMENT (JBUTTON)
public class GUICaseButton extends JButton {
    
    int panelWidth = 100;
    int panelHeight = 75;
    JLabel caseNumber;

    GUICaseButton(String caseString) {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setBackground(Color.decode("#c1c0c3"));
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setLayout(new GridBagLayout());

        //REQUIREMENT 9 - SWING ELEMENT (JLABEL)
        caseNumber = new JLabel(caseString);
        caseNumber.setFont(new Font("Arial", Font.BOLD, 30));
        this.add(caseNumber);
    }


}
