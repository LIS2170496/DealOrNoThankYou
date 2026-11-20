import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    
    int frameHeight = 750;
    int frameWidth = 1200;  

    GUIWelcomePanel welcomePanel;

    GUICaseContainer caseContainer;
    GUIAmountContainerL amountContainerL;
    GUIAmountContainerR amountContainerR;

    

    public GUI() {
        super("Deal or No Thank You");
        setSize(frameWidth, frameHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));


        // WELCOME SCREEN CONTAINERS
        welcomePanel = new GUIWelcomePanel();
        add(welcomePanel);
        

        // GAMEPLAY CONTAINERS
        //caseContainer = new GUICaseContainer();
        //add(caseContainer);
        //amountContainerL = new GUIAmountContainerL();
        //add(amountContainerL);
        //amountContainerR = new GUIAmountContainerR();
        //add(amountContainerR);


        setVisible(true);

    }


}
