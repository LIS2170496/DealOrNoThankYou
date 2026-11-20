import javax.swing.JOptionPane;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class GameRoundOpenCases implements GameRound, ActionListener {

    int numCasesToOpen;
    int numCasesOpened;
    int timeElapsedSeconds;
    Timer timer;





    public GameRoundOpenCases() {
        for (int i = 0; i < DealOrNoThankYou.caseContainer.caseButtons.length; ++i) {
            DealOrNoThankYou.caseContainer.caseButtons[i].addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        //Object source = event.getSource();

        timer.cancel();

        for (int i = 0; i < DealOrNoThankYou.caseContainer.caseButtons.length; ++i) {
            if (event.getSource() == DealOrNoThankYou.caseContainer.caseButtons[i]) {

                DealOrNoThankYou.cases.inactivateCase(i);

                JOptionPane.showMessageDialog(null, 
                    "You chose case #" + (i + 1), 
                    "", JOptionPane.PLAIN_MESSAGE);

                // add if round is 1, write value to file
                // else message dialog, are you ready to see what is in your case?
                // display case value
                // inactivate amountpanel for that value

            }
        }

        numCasesOpened = numCasesOpened + 1;
        
        if (numCasesOpened == numCasesToOpen) {
            completeRound();
        }
        

    }
    




    public void startRound(int gameRound) {

        


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
            numCasesOpened = 0;
            timeElapsedSeconds = 0;
            timer = new Timer();

            while (numCasesOpened < 1) {
                while (timeElapsedSeconds < 60 && numCasesOpened < 1) {
                    timer.scheduleAtFixedRate(stillThere, 0, 1000);
                }
            }
            
            
        }

        if (gameRound == 2) {
            numCasesToOpen = 6;
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

        DealOrNoThankYou.gameRoundNumber = DealOrNoThankYou.gameRoundNumber + 1;
        DealOrNoThankYou.currentRoundLabel.setText("Current Round: " + DealOrNoThankYou.gameRoundNumber);
    }





    TimerTask stillThere = new TimerTask() {
        @Override 
        public void run() {
            timeElapsedSeconds++;
            if (timeElapsedSeconds >= 5) {
                JOptionPane.showMessageDialog(null, 
                    "Are you still there?", 
                    "", JOptionPane.PLAIN_MESSAGE);
                timeElapsedSeconds = 0;
            }
        }
    };



}
