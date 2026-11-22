import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;

import java.io.*;
import javax.sound.sampled.*;

import java.nio.file.Files;
import java.nio.file.Path;

public class GameRoundBankerOffer implements GameRound {

    DealOrNoThankYou currentGame;
    double totalActiveAmount = 0;
    int totalActiveCount;
    double currentOffer;
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
    Object[] options = {"DEAL", "NO THANK YOU"};
    int playerChoice;
    boolean acceptOffer;
    int numCasesToOpenNextRound;

    String filepathString;
    Path soundFilePath;
    boolean soundFileExists;

    public GameRoundBankerOffer(DealOrNoThankYou currentGame) {
        this.currentGame = currentGame;
        filepathString = "aPhoneCall.wav";
        soundFilePath = Path.of(filepathString);
        soundFileExists = Files.exists(soundFilePath);
    }
    
    public void startRound(int gameRound) throws FileNotFoundException {
        //start at count 1 and value of player's case
        totalActiveAmount = DealOrNoThankYou.cases.getCaseValue(DealOrNoThankYou.gameRoundOpenCases.chosenCaseIndex);
        totalActiveCount = 1;



        if (soundFileExists) {
            playSound();
        }
        else {
            throw(new FileNotFoundException(filepathString));
        }

        
        
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



        switch (gameRound) {
            case 3:
                numCasesToOpenNextRound = 5;
                break;
            case 5:
                numCasesToOpenNextRound = 4;
                break;
            case 7:
                numCasesToOpenNextRound = 3;
                break;
            case 9:
                numCasesToOpenNextRound = 2;
                break;
            case 11:
                numCasesToOpenNextRound = 1;
                break;
            case 13:
                numCasesToOpenNextRound = 1;
                break;
            case 15:
                numCasesToOpenNextRound = 1;
                break;
            case 17:
                numCasesToOpenNextRound = 1;
                break;
        }
        
        
        if (numCasesToOpenNextRound == 1) {
            playerChoice = JOptionPane.showOptionDialog(null, 
                "The banker would like to buy your case for " + currencyFormat.format(currentOffer) + "." + 
                "\n" + 
                "If you decline, you will need to open " + numCasesToOpenNextRound + " case in the next round." +
                "\n" + 
                "\n" + 
                "Do you accept the banker's offer?\n",
                "",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);
        } 
        else if (numCasesToOpenNextRound == 19) {
            playerChoice = JOptionPane.showOptionDialog(null, 
                "The banker would like to buy your case for " + currencyFormat.format(currentOffer) + "." + 
                "\n" + 
                "\n" + 
                "Do you accept the banker's offer?\n", 
                "",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);
        }
        else {
            playerChoice = JOptionPane.showOptionDialog(null, 
                "The banker would like to buy your case for " + currencyFormat.format(currentOffer) + "." + 
                "\n" + 
                "If you decline, you will need to open " + numCasesToOpenNextRound + " cases in the next round." +
                "\n" + 
                "\n" + 
                "Do you accept the banker's offer?\n", 
                "",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);
        }

        




        
        if (playerChoice == 0) {
            acceptOffer = true;
            DealOrNoThankYou.bankerOffer = currentOffer;
            //FIX ME - update win type
            DealOrNoThankYou.winType = "ACCEPTED BANKER OFFER";
            DealOrNoThankYou.gameInSession = false;
        }
        else if (playerChoice == 1) {
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


    public void playSound() {
        //FIXME - add attribution
        // phone ringing
        // https://freesound.org/people/infobandit/sounds/29621/

        try {
            File file = new File("aPhoneCall.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            clip.start();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,
            e.getMessage() ,"ERROR", JOptionPane.PLAIN_MESSAGE);
        }
    }


}
