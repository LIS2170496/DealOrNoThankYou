import javax.swing.JPanel;
import java.awt.*;

public class GUICaseContainer extends JPanel {

    int panelHeight = 750;
    int panelWidth = 800;  

    GUICasePanel case1;
    GUICasePanel case2;
    GUICasePanel case3;
    GUICasePanel case4;
    GUICasePanel case5;
    GUICasePanel case6;
    GUICasePanel case7;
    GUICasePanel case8;
    GUICasePanel case9;
    GUICasePanel case10;
    GUICasePanel case11;
    GUICasePanel case12;
    GUICasePanel case13;
    GUICasePanel case14;
    GUICasePanel case15;
    GUICasePanel case16;
    GUICasePanel case17;
    GUICasePanel case18;
    GUICasePanel case19;
    GUICasePanel case20;
    GUICasePanel case21;
    GUICasePanel case22;
    GUICasePanel case23;
    GUICasePanel case24;
    GUICasePanel case25;
    GUICasePanel case26;

    GUICaseContainer() {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        case1 = new GUICasePanel("1");
        case2 = new GUICasePanel("2");
        case3 = new GUICasePanel("3");
        case4 = new GUICasePanel("4");
        case5 = new GUICasePanel("5");
        case6 = new GUICasePanel("6");
        case7 = new GUICasePanel("7");
        case8 = new GUICasePanel("8");
        case9 = new GUICasePanel("9");
        case10 = new GUICasePanel("10");
        case11 = new GUICasePanel("11");
        case12 = new GUICasePanel("12");
        case13 = new GUICasePanel("13");
        case14 = new GUICasePanel("14");
        case15 = new GUICasePanel("15");
        case16 = new GUICasePanel("16");
        case17 = new GUICasePanel("17");
        case18 = new GUICasePanel("18");
        case19 = new GUICasePanel("19");
        case20 = new GUICasePanel("20");
        case21 = new GUICasePanel("21");
        case22 = new GUICasePanel("22");
        case23 = new GUICasePanel("23");
        case24 = new GUICasePanel("24");
        case25 = new GUICasePanel("25");
        case26 = new GUICasePanel("26");

        this.add(case1);
        this.add(case2);
        this.add(case3);
        this.add(case4);
        this.add(case5);
        this.add(case6);
        this.add(case7);
        this.add(case8);
        this.add(case9);
        this.add(case10);
        this.add(case11);
        this.add(case12);
        this.add(case13);
        this.add(case14);
        this.add(case15);
        this.add(case16);
        this.add(case17);
        this.add(case18);
        this.add(case19);
        this.add(case20);
        this.add(case21);
        this.add(case22);
        this.add(case23);
        this.add(case24);
        this.add(case25);
        this.add(case26);

    }
}
