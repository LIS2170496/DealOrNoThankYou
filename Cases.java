import java.awt.Color;
import java.util.*;

public class Cases {

    //REQUIREMENT 11 - LINKED LIST
    LinkedList<Double> amountsList = new LinkedList<Double>();
    record Case(double amount, String status) {}
    Case[] gameplayCases = new Case[26];
    List<Double> gameplayAmountsList;


    Cases () {
        //REQUIREMENT 11 - LINKED LIST
        amountsList.add(0.01);
        amountsList.add(1.00);
        amountsList.add(5.00);
        amountsList.add(10.00);
        amountsList.add(25.00);
        amountsList.add(50.00);
        amountsList.add(75.00);
        amountsList.add(100.00);
        amountsList.add(200.00);
        amountsList.add(300.00);
        amountsList.add(400.00);
        amountsList.add(500.00);
        amountsList.add(750.00);

        amountsList.add(1000.00);
        amountsList.add(5000.00);
        amountsList.add(10000.00);
        amountsList.add(25000.00);
        amountsList.add(50000.00);
        amountsList.add(75000.00);
        amountsList.add(100000.00);
        amountsList.add(200000.00);
        amountsList.add(300000.00);
        amountsList.add(400000.00);
        amountsList.add(500000.00);
        amountsList.add(750000.00);
        amountsList.add(1000000.00);

        gameplayAmountsList = new ArrayList<>(amountsList);


        this.shuffleCases();

        
    }




    public void shuffleCases() {
        
        Collections.shuffle(gameplayAmountsList);

        for (int i = 0; i < gameplayAmountsList.size(); ++i) {
            Case newCase = new Case(gameplayAmountsList.get(i), "ACTIVE");
            gameplayCases[i] = newCase;
        }

    }


    public void inactivateCase(int i) {
        Case newCase = new Case(gameplayAmountsList.get(i), "INACTIVE");
        gameplayCases[i] = newCase;
        DealOrNoThankYou.caseContainer.caseButtons[i].setBackground(Color.DARK_GRAY);

        //update fix bug - when clicked on case, inactivate includes removing ability to click button
        DealOrNoThankYou.caseContainer.caseButtons[i].setEnabled(false);

    }


    public String getCaseStatus(int i) {
        return gameplayCases[i].status;
    }

    public double getCaseValue(int i) {
        return gameplayCases[i].amount();
    }





}