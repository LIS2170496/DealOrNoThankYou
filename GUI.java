import javax.swing.*;


public class GUI extends JFrame {
    
    int frameHeight = 750;
    int frameWidth = 1200;  

    GUICaseContainer caseContainer;
    

    public GUI() {
        super("Deal or No Thank You");
        setSize(frameWidth, frameHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        caseContainer = new GUICaseContainer();
        add(caseContainer);


        setVisible(true);

    }


}
