import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;

public class GameRoundBankerOffer implements GameRound {

    DealOrNoThankYou currentGame;
    double totalActiveAmount = 0;
    int totalActiveCount;
    double currentOffer;
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
    int playerChoice;
    boolean acceptOffer;

    public GameRoundBankerOffer(DealOrNoThankYou currentGame) {
        this.currentGame = currentGame;
    }
    
    public void startRound(int gameRound) {
        //start at count 1 and value of player's case
        totalActiveAmount = DealOrNoThankYou.cases.getCaseValue(DealOrNoThankYou.gameRoundOpenCases.chosenCaseIndex);
        totalActiveCount = 1;
        


        JOptionPane.showMessageDialog(null, 
            "The banker would like to speak with you", 
            "", 
            JOptionPane.PLAIN_MESSAGE);


        for (int i = 0; i < DealOrNoThankYou.caseContainer.caseButtons.length; ++i) {
            if(DealOrNoThankYou.cases.getCaseStatus(i).equals("ACTIVE")) {
                totalActiveAmount = totalActiveAmount + DealOrNoThankYou.cases.getCaseValue(i);
                totalActiveCount++;
            }
        }

        currentOffer = (totalActiveAmount / totalActiveCount) / 2.0;

        JOptionPane.showMessageDialog(null, 
            "There is " + currencyFormat.format(totalActiveAmount) + " active across " + totalActiveCount + " cases.", 
            "", 
            JOptionPane.PLAIN_MESSAGE);
        
        

        playerChoice = JOptionPane.showConfirmDialog(null, 
            "The banker would like to buy your case for " + currencyFormat.format(currentOffer) + ".\n" + 
            "Do you accept?", 
            "", 
            JOptionPane.YES_NO_OPTION);
        
        if (playerChoice == JOptionPane.YES_OPTION) {
            acceptOffer = true;
            DealOrNoThankYou.gameInSession = false;
        }
        else if (playerChoice == JOptionPane.NO_OPTION) {
            acceptOffer = false;
        }
        else {
            acceptOffer = false;
        }



        completeRound();

    }


    public void completeRound() {
        currentGame.roundFinished();
    }

}
