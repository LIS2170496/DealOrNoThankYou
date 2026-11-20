import javax.swing.JPanel;
import java.awt.*;

public class GUIAmountContainerR extends JPanel {

    int panelHeight = 750;
    int panelWidth = 200;  

    GUIAmountPanel amount14;
    GUIAmountPanel amount15;
    GUIAmountPanel amount16;
    GUIAmountPanel amount17;
    GUIAmountPanel amount18;
    GUIAmountPanel amount19;
    GUIAmountPanel amount20;
    GUIAmountPanel amount21;
    GUIAmountPanel amount22;
    GUIAmountPanel amount23;
    GUIAmountPanel amount24;
    GUIAmountPanel amount25;
    GUIAmountPanel amount26;

    GUIAmountContainerR() {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));


        amount14 = new GUIAmountPanel("$     1,000");
        amount15 = new GUIAmountPanel("$     5,000");
        amount16 = new GUIAmountPanel("$    10,000");
        amount17 = new GUIAmountPanel("$    25,000");
        amount18 = new GUIAmountPanel("$    50,000");
        amount19 = new GUIAmountPanel("$    75,000");
        amount20 = new GUIAmountPanel("$   100,000");
        amount21 = new GUIAmountPanel("$   200,000");
        amount22 = new GUIAmountPanel("$   300,000");
        amount23 = new GUIAmountPanel("$   400,000");
        amount24 = new GUIAmountPanel("$   500,000");
        amount25 = new GUIAmountPanel("$   750,000");
        amount26 = new GUIAmountPanel("$ 1,000,000");


        this.add(amount14);
        this.add(amount15);
        this.add(amount16);
        this.add(amount17);
        this.add(amount18);
        this.add(amount19);
        this.add(amount20);
        this.add(amount21);
        this.add(amount22);
        this.add(amount23);
        this.add(amount24);
        this.add(amount25);
        this.add(amount26);


    }
    
}
