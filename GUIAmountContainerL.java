import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Locale;

public class GUIAmountContainerL extends JPanel {

    int panelHeight = 750;
    int panelWidth = 160;  
    GUIAmountPanel[] amountPanels;


    GUIAmountContainerL() {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        //acts as padding (top, left, bottom, right)
        this.setBorder(BorderFactory.createEmptyBorder(5,0,0,0));

        
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);

        amountPanels = new GUIAmountPanel[13];
        for (int i = 0; i < 13; ++i) {
            amountPanels[i] = new GUIAmountPanel(
                ""+ currencyFormat.format(DealOrNoThankYou.cases.amountsList.get(i)), 
                DealOrNoThankYou.cases.amountsList.get(i));
                this.add(amountPanels[i]);
        }

    }
}
