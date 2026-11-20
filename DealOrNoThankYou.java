import java.awt.event.*;
import java.awt.*;


public class DealOrNoThankYou extends GUI implements ActionListener {

    public static Cases cases;
    GameRoundOpenCases gameRoundOpenCases;
    GameRoundBankerOffer gameRoundBankerOffer;
    



    public DealOrNoThankYou() {
        super();

        startButton.addActionListener(this);
        cases = new Cases();
        gameRoundOpenCases = new GameRoundOpenCases();
        gameRoundBankerOffer = new GameRoundBankerOffer();
        
    }



    
    @Override
    public void actionPerformed(ActionEvent event) {

        Object source = event.getSource();


        if(source == startButton) {
            remove(welcomeMessage);
            remove(welcomePanel);
            remove(startButton);
            repaint();

            setLayout(new FlowLayout(FlowLayout.LEFT));

            add(caseContainer);
            add(amountContainerL);
            add(amountContainerR);
            add(currentRoundLabel);
            setVisible(true);
            repaint();

            gameRoundOpenCases.startRound(gameRoundNumber);
            }

            


    }






    public static void main(String[] args) {
        DealOrNoThankYou myGame = new DealOrNoThankYou();
        myGame.setVisible(true);

        //this sets the frame to open in center of screen
        myGame.setLocationRelativeTo(null);
    }



}
