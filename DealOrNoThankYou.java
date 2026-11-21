import java.awt.event.*;
import java.awt.*;


public class DealOrNoThankYou extends GUI implements ActionListener {

    public static GameRoundOpenCases gameRoundOpenCases;
    public static GameRoundBankerOffer gameRoundBankerOffer;
    public static boolean gameInSession = true;
    


    public DealOrNoThankYou() {
        super();
        startButton.addActionListener(this);
        gameRoundOpenCases = new GameRoundOpenCases(this);
        gameRoundBankerOffer = new GameRoundBankerOffer(this);
        
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

            startGameRound();
            }
    }


    public void startGameRound() {
        if (gameRoundNumber == 1   ||  gameRoundNumber == 2   || 
            gameRoundNumber == 4   ||  gameRoundNumber == 6   || 
            gameRoundNumber == 8   ||  gameRoundNumber == 10  || 
            gameRoundNumber == 12  ||  gameRoundNumber == 14  || 
            gameRoundNumber == 16  ||  gameRoundNumber == 18) {
            gameRoundOpenCases.startRound(gameRoundNumber);
        }
        else if ((gameRoundNumber % 2) == 1  &&  gameRoundNumber < 20) {
            gameRoundBankerOffer.startRound(gameRoundNumber);
        }
        else if (gameRoundNumber == 20) {
            //TODO - ADD FINAL ROUND
        }
    }


    public void roundFinished() {
        gameRoundNumber++;
        currentRoundLabel.setText("Current Round: " + gameRoundNumber);

        if (gameInSession) {
            startGameRound();
        }
    }






    public static void main(String[] args) {
        DealOrNoThankYou myGame = new DealOrNoThankYou();
        myGame.setVisible(true);

        //this sets the frame to open in center of screen
        myGame.setLocationRelativeTo(null);
    }



}
