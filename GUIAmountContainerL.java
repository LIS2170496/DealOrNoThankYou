import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.*;

public class GUIAmountContainerL extends JPanel {

    int panelHeight = 750;
    int panelWidth = 160;  

    GUIAmountPanel[] amountPanels;

    // GUIAmountPanel amount1;
    // GUIAmountPanel amount2;
    // GUIAmountPanel amount3;
    // GUIAmountPanel amount4;
    // GUIAmountPanel amount5;
    // GUIAmountPanel amount6;
    // GUIAmountPanel amount7;
    // GUIAmountPanel amount8;
    // GUIAmountPanel amount9;
    // GUIAmountPanel amount10;
    // GUIAmountPanel amount11;
    // GUIAmountPanel amount12;
    // GUIAmountPanel amount13;


    GUIAmountContainerL() {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        //acts as padding (top, left, bottom, right)
        this.setBorder(BorderFactory.createEmptyBorder(5,0,0,0));


        amountPanels = new GUIAmountPanel[13];
        for (int i = 0; i < 13; ++i) {
            amountPanels[i] = new GUIAmountPanel(
                "$ "+ DealOrNoThankYou.cases.amountsList.get(i), 
                DealOrNoThankYou.cases.amountsList.get(i));
                this.add(amountPanels[i]);
        }


        // amount1 = new GUIAmountPanel("$ 0.01", 0.01);
        // amount2 = new GUIAmountPanel("$     1", 1.00);
        // amount3 = new GUIAmountPanel("$     5", 5.00);
        // amount4 = new GUIAmountPanel("$    10",10.00);
        // amount5 = new GUIAmountPanel("$    25",25.00);
        // amount6 = new GUIAmountPanel("$    50",50.00);
        // amount7 = new GUIAmountPanel("$    75",75.00);
        // amount8 = new GUIAmountPanel("$   100",100.00);
        // amount9 = new GUIAmountPanel("$   200",200.00);
        // amount10 = new GUIAmountPanel("$   300",300.00);
        // amount11 = new GUIAmountPanel("$   400",400.00);
        // amount12 = new GUIAmountPanel("$   500",500.00);
        // amount13 = new GUIAmountPanel("$   750",750.00);


        // this.add(amount1);
        // this.add(amount2);
        // this.add(amount3);
        // this.add(amount4);
        // this.add(amount5);
        // this.add(amount6);
        // this.add(amount7);
        // this.add(amount8);
        // this.add(amount9);
        // this.add(amount10);
        // this.add(amount11);
        // this.add(amount12);
        // this.add(amount13);

    }
    
}
