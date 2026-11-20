import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    
    int frameHeight = 750;
    int frameWidth = 1200;  

    JLabel welcomeMessage;
    GUIWelcomePanel welcomePanel;
    JButton startButton;

    GUICaseContainer caseContainer;
    GUIAmountContainerL amountContainerL;
    GUIAmountContainerR amountContainerR;

    

    public GUI() {
        super("Deal or No Thank You");
        setSize(frameWidth, frameHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        


        // WELCOME SCREEN 
        welcomeMessage = new JLabel("Welcome To");
        welcomeMessage.setFont(new Font("Arial Black", Font.BOLD, 48));
        add(welcomeMessage);
        welcomePanel = new GUIWelcomePanel();
        add(welcomePanel);
        startButton = new JButton("START");
        startButton.setPreferredSize(new Dimension(250, 75));
        startButton.setFont(new Font("Arial Black", Font.BOLD, 24));
        add(startButton);
        

        // GAMEPLAY CONTAINERS
        caseContainer = new GUICaseContainer();
        //add(caseContainer);
        amountContainerL = new GUIAmountContainerL();
        //add(amountContainerL);
        amountContainerR = new GUIAmountContainerR();
        //add(amountContainerR);


        setVisible(true);

    }


}
