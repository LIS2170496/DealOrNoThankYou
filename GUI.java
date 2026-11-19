import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    
    int frameHeight = 750;
    int frameWidth = 800;  

    JPanel caseContainer;
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
    

    public GUI() {
        super("Deal or No Thank You");
        setSize(frameWidth, frameHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    

        caseContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

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

        caseContainer.add(case1);
        caseContainer.add(case2);
        caseContainer.add(case3);
        caseContainer.add(case4);
        caseContainer.add(case5);
        caseContainer.add(case6);
        caseContainer.add(case7);
        caseContainer.add(case8);
        caseContainer.add(case9);
        caseContainer.add(case10);
        caseContainer.add(case11);
        caseContainer.add(case12);
        caseContainer.add(case13);
        caseContainer.add(case14);
        caseContainer.add(case15);
        caseContainer.add(case16);
        caseContainer.add(case17);
        caseContainer.add(case18);
        caseContainer.add(case19);
        caseContainer.add(case20);
        caseContainer.add(case21);
        caseContainer.add(case22);
        caseContainer.add(case23);
        caseContainer.add(case24);
        caseContainer.add(case25);
        caseContainer.add(case26);

        add(caseContainer);



        setVisible(true);

    }


}
