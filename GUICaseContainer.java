import javax.swing.JPanel;
import java.awt.*;

public class GUICaseContainer extends JPanel {

    int panelHeight = 675;
    int panelWidth = 675;  

    GUICaseButton[] caseButtons;

    GUICaseContainer() {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        caseButtons = new GUICaseButton[26];
        for (int i = 0; i < caseButtons.length; ++i) {
            caseButtons[i] = new GUICaseButton("" + (i + 1));
            caseButtons[i].setEnabled(false);
            this.add(caseButtons[i]);
        }

    }
}
