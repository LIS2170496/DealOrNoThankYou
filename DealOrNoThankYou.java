import java.awt.event.*;

public class DealOrNoThankYou extends GUI implements ActionListener {

    int gameRoundNumber = 1;
    

    public void actionPerformed(ActionEvent event) {
        //FIXME - remember to add repaint(); when things change
    }


    public static void main(String[] args) {
        DealOrNoThankYou myGame = new DealOrNoThankYou();
        myGame.setVisible(true);

        //this sets the frame to open in center of screen
        myGame.setLocationRelativeTo(null);
    }



}
