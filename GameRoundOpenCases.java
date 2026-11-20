import javax.swing.JOptionPane;

public class GameRoundOpenCases implements GameRound {
    
    public void startRound(int gameRound) {

        for (int i = 0; i < DealOrNoThankYou.caseContainer.caseButtons.length; ++i) {
            DealOrNoThankYou.caseContainer.caseButtons[i].setEnabled(true);
        }

        if (gameRound == 1) {
            //player chooses their case
            JOptionPane.showMessageDialog(null, 
            "Pick your case", 
            "Welcome", JOptionPane.PLAIN_MESSAGE);
            
        }

        if (gameRound == 2) {
            //player picks 6 cases
        }

        if (gameRound == 4) {
            //player picks 5 cases
        }

        if (gameRound == 6) {
            //player picks 4 cases
        }

        if (gameRound == 8) {
            //player picks 3 cases
        }

        if (gameRound == 10) {
            //player picks 2 cases
        }

        if (gameRound >= 12) {
            //player picks 1 cases
        }

        for (int i = 0; i < DealOrNoThankYou.caseContainer.caseButtons.length; ++i) {
        DealOrNoThankYou.caseContainer.caseButtons[i].setEnabled(false);
        }

        DealOrNoThankYou.gameRoundNumber = DealOrNoThankYou.gameRoundNumber + 1;
        DealOrNoThankYou.currentRoundLabel.setText("Current Round: " + DealOrNoThankYou.gameRoundNumber);



    }

}
