import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.*;

public class GUIAmountContainerL extends JPanel {

    int panelHeight = 750;
    int panelWidth = 160;  

    GUIAmountPanel amount1;
    GUIAmountPanel amount2;
    GUIAmountPanel amount3;
    GUIAmountPanel amount4;
    GUIAmountPanel amount5;
    GUIAmountPanel amount6;
    GUIAmountPanel amount7;
    GUIAmountPanel amount8;
    GUIAmountPanel amount9;
    GUIAmountPanel amount10;
    GUIAmountPanel amount11;
    GUIAmountPanel amount12;
    GUIAmountPanel amount13;


    GUIAmountContainerL() {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        //acts as padding (top, left, bottom, right)
        this.setBorder(BorderFactory.createEmptyBorder(5,0,0,0));


        amount1 = new GUIAmountPanel("$ 0.01");
        amount2 = new GUIAmountPanel("$     1");
        amount3 = new GUIAmountPanel("$     5");
        amount4 = new GUIAmountPanel("$    10");
        amount5 = new GUIAmountPanel("$    25");
        amount6 = new GUIAmountPanel("$    50");
        amount7 = new GUIAmountPanel("$    75");
        amount8 = new GUIAmountPanel("$   100");
        amount9 = new GUIAmountPanel("$   200");
        amount10 = new GUIAmountPanel("$   300");
        amount11 = new GUIAmountPanel("$   400");
        amount12 = new GUIAmountPanel("$   500");
        amount13 = new GUIAmountPanel("$   750");


        this.add(amount1);
        this.add(amount2);
        this.add(amount3);
        this.add(amount4);
        this.add(amount5);
        this.add(amount6);
        this.add(amount7);
        this.add(amount8);
        this.add(amount9);
        this.add(amount10);
        this.add(amount11);
        this.add(amount12);
        this.add(amount13);

    }
    
}
