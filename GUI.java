import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    
    int frameHeight = 750;
    int frameWidth = 800;  

    JPanel caseContainer;
    CasePanel case1;
    CasePanel case2;
    CasePanel case3;
    CasePanel case4;
    CasePanel case5;
    CasePanel case6;
    CasePanel case7;
    CasePanel case8;
    CasePanel case9;
    CasePanel case10;
    CasePanel case11;
    CasePanel case12;
    CasePanel case13;
    CasePanel case14;
    CasePanel case15;
    CasePanel case16;
    CasePanel case17;
    CasePanel case18;
    CasePanel case19;
    CasePanel case20;
    CasePanel case21;
    CasePanel case22;
    CasePanel case23;
    CasePanel case24;
    CasePanel case25;
    CasePanel case26;
    

    public GUI() {
        super("Deal or No Thank You");
        setSize(frameWidth, frameHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    

        caseContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        case1 = new CasePanel("1");
        case2 = new CasePanel("2");
        case3 = new CasePanel("3");
        case4 = new CasePanel("4");
        case5 = new CasePanel("5");
        case6 = new CasePanel("6");
        case7 = new CasePanel("7");
        case8 = new CasePanel("8");
        case9 = new CasePanel("9");
        case10 = new CasePanel("10");
        case11 = new CasePanel("11");
        case12 = new CasePanel("12");
        case13 = new CasePanel("13");
        case14 = new CasePanel("14");
        case15 = new CasePanel("15");
        case16 = new CasePanel("16");
        case17 = new CasePanel("17");
        case18 = new CasePanel("18");
        case19 = new CasePanel("19");
        case20 = new CasePanel("20");
        case21 = new CasePanel("21");
        case22 = new CasePanel("22");
        case23 = new CasePanel("23");
        case24 = new CasePanel("24");
        case25 = new CasePanel("25");
        case26 = new CasePanel("26");

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
