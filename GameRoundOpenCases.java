import javax.swing.JOptionPane;
import java.awt.event.*;
import java.io.*;

public class GameRoundOpenCases implements GameRound, ActionListener {

    int numCasesToOpen;
    int numCasesOpened;
    int timeElapsedSeconds;
    DealOrNoThankYou currentGame;


    public GameRoundOpenCases(DealOrNoThankYou currentGame) {
        this.currentGame = currentGame;
        for (int i = 0; i < DealOrNoThankYou.caseContainer.caseButtons.length; ++i) {
            DealOrNoThankYou.caseContainer.caseButtons[i].addActionListener(this);
        }
    }


    @Override
    public void actionPerformed(ActionEvent event) {

        //Object source = event.getSource();


        for (int i = 0; i < DealOrNoThankYou.caseContainer.caseButtons.length; ++i) {
            if (event.getSource() == DealOrNoThankYou.caseContainer.caseButtons[i]) {

                DealOrNoThankYou.cases.inactivateCase(i);

                JOptionPane.showMessageDialog(null, 
                    "You chose case #" + (i + 1), 
                    "", JOptionPane.PLAIN_MESSAGE);


                // For round 1, write case value to file
                if (DealOrNoThankYou.gameRoundNumber == 1) {
                    try {
                        String winningCaseFileContents = 
                            "Your chosen case is valued at: $" + 
                            DealOrNoThankYou.cases.getCaseValue(i);

                        File winningCaseFile = new File("TOPSECRET.txt");
                        winningCaseFile.createNewFile();
                        FileOutputStream outgoing = new FileOutputStream(winningCaseFile);

                        for (int c = 0; c < winningCaseFileContents.length(); ++c) {
                            outgoing.write(winningCaseFileContents.charAt(c));
                        }

                        outgoing.flush();
                        outgoing.close();

                    }
                    catch (IOException exception) {
                        JOptionPane.showMessageDialog(null,
                            exception.getMessage(),
                            "ERROR", JOptionPane.PLAIN_MESSAGE);
                        
                    }

                    

                }

                else {
                    JOptionPane.showMessageDialog(null, 
                        "Are you ready to see how much this case is worth?", 
                        "", JOptionPane.PLAIN_MESSAGE);

                    JOptionPane.showMessageDialog(null, 
                        "This case is worth: $" + DealOrNoThankYou.cases.getCaseValue(i), 
                        "", JOptionPane.PLAIN_MESSAGE);

                    //FIXME - inactivate amountpanel for that value

                    // if (DealOrNoThankYou.cases.getCaseValue(i) <= 750.0) {

                    // }
                    // else {

                    // }

                }

        

            }
        }

        numCasesOpened = numCasesOpened + 1;
        
        if (numCasesOpened == numCasesToOpen) {
            completeRound();
        }
        

    }
    




    public void startRound(int gameRound) {
        numCasesOpened = 0;

        for (int i = 0; i < DealOrNoThankYou.caseContainer.caseButtons.length; ++i) {
            if(DealOrNoThankYou.cases.getCaseStatus(i).equals("ACTIVE")) {
                DealOrNoThankYou.caseContainer.caseButtons[i].setEnabled(true);
            }
        }
        

        if (gameRound == 1) {
            //player chooses their case
            JOptionPane.showMessageDialog(null, 
                "Pick your case", 
                "Welcome", 
                JOptionPane.PLAIN_MESSAGE);

            numCasesToOpen = 1;
        }

        if (gameRound == 2) {

            numCasesToOpen = 6;

            JOptionPane.showMessageDialog(null, 
                "Pick " + numCasesToOpen + " cases", 
                "", 
                JOptionPane.PLAIN_MESSAGE);
        }

        if (gameRound == 4) {
            numCasesToOpen = 5;
        }

        if (gameRound == 6) {
            numCasesToOpen = 4;
        }

        if (gameRound == 8) {
            numCasesToOpen = 3;
        }

        if (gameRound == 10) {
            numCasesToOpen = 2;
        }

        if (gameRound >= 12) {
            numCasesToOpen = 1;
        }
    }



    public void completeRound() {
        for (int i = 0; i < DealOrNoThankYou.caseContainer.caseButtons.length; ++i) {
        DealOrNoThankYou.caseContainer.caseButtons[i].setEnabled(false);
        }
        currentGame.roundFinished();
    }





    



}
