import java.awt.event.*;

import javax.swing.JOptionPane;

import java.awt.*;


public class DealOrNoThankYou extends GUI implements ActionListener {

    public static GameRoundOpenCases gameRoundOpenCases;
    public static GameRoundBankerOffer gameRoundBankerOffer;
    public static GameRoundFinalRound gameRoundFinalRound;
    public static boolean gameInSession = true;
    public static double bankerOffer;
    public static String winType;
    GUIGameOverPanel gameOverPanel;
    public static boolean superDuperWin = false;

    


    public DealOrNoThankYou() {
        super();
        startButton.addActionListener(this);

        gameRoundOpenCases = new GameRoundOpenCases(this);
        gameRoundBankerOffer = new GameRoundBankerOffer(this);
        gameRoundFinalRound = new GameRoundFinalRound(this);
    }



    
    @Override
    public void actionPerformed(ActionEvent event) {

        Object source = event.getSource();


        if(source == startButton) {
            remove(welcomeMessage);
            remove(welcomePanel);
            remove(startButton);
            repaint();


            GridBagLayout playingLayout = new GridBagLayout();
            setLayout(playingLayout);
            GridBagConstraints c = new GridBagConstraints();
            c.fill = GridBagConstraints.BOTH;

            //ROW 1 - LEFT
            c.gridx = 0;
            c.gridy = 0;
            c.weightx = 0.66;
            c.weighty = 0.8;
            add(caseContainer, c);

            //ROW 1 - MIDDLE
            c = new GridBagConstraints();
            c.gridx = 1;
            c.gridy = 0;
            c.weightx = 0.12;
            c.weighty = 0.8;
            c.fill = GridBagConstraints.BOTH;
            c.insets = new Insets(0,25,0,0);
            add(amountContainerL, c);

            //ROW 1 - RIGHT
            c = new GridBagConstraints();
            c.gridx = 2;
            c.gridy = 0;
            c.weightx = 0.12;
            c.weighty = 0.8;
            c.fill = GridBagConstraints.BOTH;
            add(amountContainerR, c);



            //ROW 2
            c = new GridBagConstraints();
            c.gridx = 0;
            c.gridy = 1;
            c.weightx = 0.2;
            c.weighty = 0.1;
            c.fill = GridBagConstraints.BOTH;
            c.insets = new Insets(0,10,10,0);
            add(casesLeftToOpenLabel, c);

            

            //ROW 3
            c = new GridBagConstraints();
            c.gridx = 0;
            c.gridy = 2;
            c.weightx = 0.2;
            c.weighty = 0.1;
            c.fill = GridBagConstraints.BOTH;
            c.insets = new Insets(0,10,10,0);
            add(currentRoundLabel, c);

            c = new GridBagConstraints();
            c.gridx = 1;
            c.gridy = 2;
            c.weightx = 0.2;
            c.weighty = 0.1;
            c.fill = GridBagConstraints.BOTH;
            c.insets = new Insets(0,45,10,0);
            add(playersChosenCaseLabel, c);

            



            
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
            try {
                gameRoundBankerOffer.startRound(gameRoundNumber);
            }
            catch(FileNotFoundException fileNotFoundException) {
                JOptionPane.showMessageDialog(null,
                fileNotFoundException.getMessage() ,"ERROR", JOptionPane.PLAIN_MESSAGE);
            }
        }

        
        else {
            gameRoundFinalRound.startRound(gameRoundNumber);
        }
    }


    public void roundFinished() {
        gameRoundNumber++;
        currentRoundLabel.setText("Current Round: " + gameRoundNumber);

        if (gameInSession) {
            startGameRound();
        }
        else {
            // add game over

            remove(caseContainer);
            remove(amountContainerL);
            remove(amountContainerR);
            remove(casesLeftToOpenLabel);
            remove(currentRoundLabel);
            remove(playersChosenCaseLabel);

            if (winType.equals("STANDARD")) {
                GUIGameOverPanelStandard gameOverPanel = 
                    new GUIGameOverPanelStandard(
                    DealOrNoThankYou.cases.getCaseValue(
                    DealOrNoThankYou.gameRoundOpenCases.chosenCaseIndex));
                add(gameOverPanel);
            }
            else if (winType.equals("ACCEPTED BANKER OFFER")) {
                GUIGameOverPanelBankerOfferAccepted gameOverPanel = 
                    new GUIGameOverPanelBankerOfferAccepted(bankerOffer);
                add(gameOverPanel);
            }
            else if (winType.equals("SUPER DUPER WIN")) {
                GUIGameOverPanelStandard gameOverPanel = 
                    new GUIGameOverPanelStandard(
                    DealOrNoThankYou.cases.getCaseValue(DealOrNoThankYou.gameRoundOpenCases.chosenCaseIndex), 
                    superDuperWin);
                add(gameOverPanel);
            }

            

            setVisible(true);
            repaint();
            
        }
    }






    public static void main(String[] args) {
        DealOrNoThankYou myGame = new DealOrNoThankYou();
        myGame.setVisible(true);

        //this sets the frame to open in center of screen
        myGame.setLocationRelativeTo(null);
    }



}
