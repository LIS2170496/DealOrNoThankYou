import java.awt.event.*;
import java.awt.*;


public class DealOrNoThankYou extends GUI implements ActionListener {

    int gameRoundNumber = 1;



    public DealOrNoThankYou() {
        super();

        startButton.addActionListener(this);
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
