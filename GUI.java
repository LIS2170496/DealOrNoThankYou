import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    
    int frameHeight = 750;
    int frameWidth = 1125;  //height*1.5

    JPanel caseContainer;
    

    public GUI() {
        super("Deal or No Thank You");
        setSize(frameWidth, frameHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        



        //testing
        CasePanel case1 = new CasePanel();
        //case1.setBounds(50,50,100,100);
        //add(case1);

        caseContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        //setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        caseContainer.add(case1);
        add(caseContainer);



        setVisible(true);

    }


}
