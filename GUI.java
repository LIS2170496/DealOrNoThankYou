import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    
    int frameHeight = 750;
    int frameWidth = 1125;  //height*1.5

    JPanel caseContainer;
    CasePanel case1;
    

    public GUI() {
        super("Deal or No Thank You");
        setSize(frameWidth, frameHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    

        caseContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        case1 = new CasePanel();
        caseContainer.add(case1);
        add(caseContainer);



        setVisible(true);

    }


}
