import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    
    int frameHeight = 750;
    int frameWidth = 1200;  
    public static int gameRoundNumber = 1;

    JLabel welcomeMessage;
    GUIWelcomePanel welcomePanel;
    JButton startButton;

    public static Cases cases = new Cases();
    public static GUICaseContainer caseContainer;
    GUIAmountContainerL amountContainerL;
    GUIAmountContainerR amountContainerR;
    public static JLabel currentRoundLabel;

    

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
        amountContainerL = new GUIAmountContainerL();
        amountContainerR = new GUIAmountContainerR();
        currentRoundLabel = new JLabel("Current Round: " + gameRoundNumber);
        currentRoundLabel.setBackground(Color.yellow);


        setVisible(true);

    }


}
