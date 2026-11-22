import java.util.Random;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;

public class GameRoundFinalRound implements GameRound {

    DealOrNoThankYou currentGame;

    public GameRoundFinalRound(DealOrNoThankYou currentGame) {
        this.currentGame = currentGame;
    }

    @Override
    public void startRound(int gameRound) {

        int playersCaseIndex;
        double playersCaseValue;
        int remainingCaseIndex = 0;
        double remainingCaseValue = 0.0;
        int randomNumber;
        Random random = new Random();
        randomNumber = random.nextInt(10);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        Object[] options = {"KEEP", "SWAP"};
        int playerChoice;


        for (int i = 0; i < DealOrNoThankYou.caseContainer.caseButtons.length; ++i) {
            if(DealOrNoThankYou.cases.getCaseStatus(i).equals("ACTIVE")) {
                //DealOrNoThankYou.caseContainer.caseButtons[i].setEnabled(true);
                remainingCaseIndex = i;
                remainingCaseValue = DealOrNoThankYou.cases.getCaseValue(i);
            }
        }

        playersCaseIndex = DealOrNoThankYou.gameRoundOpenCases.chosenCaseIndex;
        playersCaseValue = DealOrNoThankYou.cases.getCaseValue(playersCaseIndex);





        JOptionPane.showMessageDialog(null, 
            "Only one case remains on the board: Case #" + (remainingCaseIndex + 1), 
            "", JOptionPane.PLAIN_MESSAGE);




        if (randomNumber % 2 == 0) {
            // Your case either has $_A_ or $_B_
            JOptionPane.showMessageDialog(null, 
                "Your chosen case contains either " + 
                currencyFormat.format(playersCaseValue) + 
                " or " + 
                currencyFormat.format(remainingCaseValue),
                "", 
                JOptionPane.PLAIN_MESSAGE);
        }
        else {
            // Your case either has $_B_ or $_A_
            JOptionPane.showMessageDialog(null, 
                "Your chosen case contains either " + 
                currencyFormat.format(remainingCaseValue) + 
                " or " + 
                currencyFormat.format(playersCaseValue),
                "", 
                JOptionPane.PLAIN_MESSAGE);
        }


        
        

        playerChoice = JOptionPane.showOptionDialog(null, 
            "Would you like to keep case #" + 
            (playersCaseIndex + 1) + 
            " or would you like to swap for case #" + 
            (remainingCaseIndex + 1) + "?", 
            "",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[1]);

        if (playerChoice == 0) {  //KEEP
            JOptionPane.showMessageDialog(null, 
                "You have chosen to KEEP case #" + (playersCaseIndex + 1), 
                "", JOptionPane.PLAIN_MESSAGE);
            
        }
        else if (playerChoice == 1) {  //SWAP
            DealOrNoThankYou.playersChosenCaseLabel.setText("Your Case: #" + (remainingCaseIndex + 1));

            JOptionPane.showMessageDialog(null, 
                "You have chosen to SWAP cases." + 
                "\n" + 
                "Your case is now case #" + (remainingCaseIndex + 1), 
                "", JOptionPane.PLAIN_MESSAGE); 
        }
        else {  //KEEP
            JOptionPane.showMessageDialog(null, 
                "You have chosen to KEEP case #" + (playersCaseIndex + 1), 
                "", JOptionPane.PLAIN_MESSAGE);
        }

        JOptionPane.showMessageDialog(null, 
            "Are you ready to see how much this case is worth?", 
            "", JOptionPane.PLAIN_MESSAGE);


        // TODO - SET UP FINAL ROUND PASS TO GAME OVER SCREEN


        




        






    }
    
}
