import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.*;
import java.awt.*;

public class GUIGameOverPanel extends JPanel {
    int panelWidth = 1100;
    int panelHeight = 550;

    public GUIGameOverPanel(double amount) {

        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        double winAmount = amount;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String congratulationsString = "Congratulations!";
        String winAmountString = "You have won " + currencyFormat.format(winAmount);

        JLabel congratulationsLabel = new JLabel(congratulationsString);
        congratulationsLabel.setFont(new Font("Arial Black", Font.BOLD, 48));
        add(congratulationsLabel);

        JLabel winAmountLabel = new JLabel(winAmountString);
        winAmountLabel.setFont(new Font("Arial Black", Font.BOLD, 48));
        add(winAmountLabel);


    
    }
    
}
