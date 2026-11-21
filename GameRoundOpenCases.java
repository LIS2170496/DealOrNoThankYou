import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.awt.Color;

public class GameRoundOpenCases implements GameRound, ActionListener {

    int numCasesToOpen;
    int numCasesLeftToOpen;
    int numCasesOpened;
    int timeElapsedSeconds;
    DealOrNoThankYou currentGame;
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
    int chosenCaseIndex;


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
                    chosenCaseIndex = i;
                    //DealOrNoThankYou.gameRoundBankerOffer.totalActiveAmount = DealOrNoThankYou.cases.getCaseValue(i);
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
                        "This case is worth: " + currencyFormat.format(DealOrNoThankYou.cases.getCaseValue(i)), 
                        "", JOptionPane.PLAIN_MESSAGE);




                    //inactivate amountpanel for value of case chosen

                    if (DealOrNoThankYou.cases.getCaseValue(i) <= 750.0) {
                        for (int a = 0; a < 13; ++a) {
                            if (DealOrNoThankYou.amountContainerL.amountPanels[a].amountValue 
                                == DealOrNoThankYou.cases.getCaseValue(i)) {
                                    DealOrNoThankYou.amountContainerL.amountPanels[a].setBackground(Color.DARK_GRAY);
                                    DealOrNoThankYou.amountContainerL.amountPanels[a].setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
                            }
                        }
                    }
                    else if (DealOrNoThankYou.cases.getCaseValue(i) > 750.0){
                        for (int a = 0; a < 13; ++a) {
                            if (DealOrNoThankYou.amountContainerR.amountPanels[a].amountValue 
                                == DealOrNoThankYou.cases.getCaseValue(i)) {
                                    DealOrNoThankYou.amountContainerR.amountPanels[a].setBackground(Color.DARK_GRAY);
                                    DealOrNoThankYou.amountContainerR.amountPanels[a].setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
                            }
                        }

                    }

                }

        

            }
        }

        numCasesOpened = numCasesOpened + 1;
        numCasesLeftToOpen = numCasesLeftToOpen - 1;

        DealOrNoThankYou.casesLeftToOpenLabel.setText("Cases Left to Open: " + numCasesLeftToOpen);
        
        if (numCasesOpened == numCasesToOpen) {
            DealOrNoThankYou.casesLeftToOpenLabel.setText("");
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
            numCasesLeftToOpen = numCasesToOpen;
        }

        if (gameRound == 2) {

            numCasesToOpen = 6;
            numCasesLeftToOpen = numCasesToOpen;
            DealOrNoThankYou.casesLeftToOpenLabel.setText("Cases Left to Open: " + numCasesLeftToOpen);

            JOptionPane.showMessageDialog(null, 
                "Pick " + numCasesToOpen + " cases", 
                "", 
                JOptionPane.PLAIN_MESSAGE);
        }

        if (gameRound == 4) {
            numCasesToOpen = 5;
            numCasesLeftToOpen = numCasesToOpen;
            DealOrNoThankYou.casesLeftToOpenLabel.setText("Cases Left to Open: " + numCasesLeftToOpen);

            JOptionPane.showMessageDialog(null, 
                "Pick " + numCasesToOpen + " cases", 
                "", 
                JOptionPane.PLAIN_MESSAGE);
        }

        if (gameRound == 6) {
            numCasesToOpen = 4;
            numCasesLeftToOpen = numCasesToOpen;
            DealOrNoThankYou.casesLeftToOpenLabel.setText("Cases Left to Open: " + numCasesLeftToOpen);

            JOptionPane.showMessageDialog(null, 
                "Pick " + numCasesToOpen + " cases", 
                "", 
                JOptionPane.PLAIN_MESSAGE);
        }

        if (gameRound == 8) {
            numCasesToOpen = 3;
            numCasesLeftToOpen = numCasesToOpen;
            DealOrNoThankYou.casesLeftToOpenLabel.setText("Cases Left to Open: " + numCasesLeftToOpen);

            JOptionPane.showMessageDialog(null, 
                "Pick " + numCasesToOpen + " cases", 
                "", 
                JOptionPane.PLAIN_MESSAGE);
        }

        if (gameRound == 10) {
            numCasesToOpen = 2;
            numCasesLeftToOpen = numCasesToOpen;
            DealOrNoThankYou.casesLeftToOpenLabel.setText("Cases Left to Open: " + numCasesLeftToOpen);

            JOptionPane.showMessageDialog(null, 
                "Pick " + numCasesToOpen + " cases", 
                "", 
                JOptionPane.PLAIN_MESSAGE);
        }

        if (gameRound >= 12) {
            numCasesToOpen = 1;
            numCasesLeftToOpen = numCasesToOpen;
            DealOrNoThankYou.casesLeftToOpenLabel.setText("Cases Left to Open: " + numCasesLeftToOpen);

            JOptionPane.showMessageDialog(null, 
                "Pick " + numCasesToOpen + " case", 
                "", 
                JOptionPane.PLAIN_MESSAGE);
        }
    }



    public void completeRound() {
        for (int i = 0; i < DealOrNoThankYou.caseContainer.caseButtons.length; ++i) {
        DealOrNoThankYou.caseContainer.caseButtons[i].setEnabled(false);
        }
        currentGame.roundFinished();
    }





    



}
