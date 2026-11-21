import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.*;

public class GUIAmountContainerR extends JPanel {

    int panelHeight = 750;
    int panelWidth = 160;  

    GUIAmountPanel[] amountPanels;

    // GUIAmountPanel amount14;
    // GUIAmountPanel amount15;
    // GUIAmountPanel amount16;
    // GUIAmountPanel amount17;
    // GUIAmountPanel amount18;
    // GUIAmountPanel amount19;
    // GUIAmountPanel amount20;
    // GUIAmountPanel amount21;
    // GUIAmountPanel amount22;
    // GUIAmountPanel amount23;
    // GUIAmountPanel amount24;
    // GUIAmountPanel amount25;
    // GUIAmountPanel amount26;

    GUIAmountContainerR() {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        //acts as padding (top, left, bottom, right)
        this.setBorder(BorderFactory.createEmptyBorder(5,0,0,0));

        amountPanels = new GUIAmountPanel[13];
        for (int i = 0; i < 13; ++i) {
            amountPanels[i] = new GUIAmountPanel(
                "$ "+ DealOrNoThankYou.cases.amountsList.get((i + 13)), 
                DealOrNoThankYou.cases.amountsList.get((i + 13)));
                this.add(amountPanels[i]);
        }


        // amount14 = new GUIAmountPanel("$     1,000",1000.00);
        // amount15 = new GUIAmountPanel("$     5,000",5000.00);
        // amount16 = new GUIAmountPanel("$    10,000",10000.00);
        // amount17 = new GUIAmountPanel("$    25,000",25000.00);
        // amount18 = new GUIAmountPanel("$    50,000",50000.00);
        // amount19 = new GUIAmountPanel("$    75,000",75000.00);
        // amount20 = new GUIAmountPanel("$   100,000",100000.00);
        // amount21 = new GUIAmountPanel("$   200,000",200000.00);
        // amount22 = new GUIAmountPanel("$   300,000",300000.00);
        // amount23 = new GUIAmountPanel("$   400,000",400000.00);
        // amount24 = new GUIAmountPanel("$   500,000",500000.00);
        // amount25 = new GUIAmountPanel("$   750,000",750000.00);
        // amount26 = new GUIAmountPanel("$ 1,000,000",1000000.00);


        // this.add(amount14);
        // this.add(amount15);
        // this.add(amount16);
        // this.add(amount17);
        // this.add(amount18);
        // this.add(amount19);
        // this.add(amount20);
        // this.add(amount21);
        // this.add(amount22);
        // this.add(amount23);
        // this.add(amount24);
        // this.add(amount25);
        // this.add(amount26);


    }
    
}
