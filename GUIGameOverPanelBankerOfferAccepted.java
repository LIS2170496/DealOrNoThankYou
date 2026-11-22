import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.*;
import java.awt.*;

public class GUIGameOverPanelBankerOfferAccepted extends GUIGameOverPanel {
    int panelWidth = 1100;
    int panelHeight = 550;

    public GUIGameOverPanelBankerOfferAccepted(double amount) {

        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        double winAmount = amount;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String congratulationsString = "Offer Accepted!";
        String winAmountString = "You have won " + currencyFormat.format(winAmount);

        JLabel congratulationsLabel = new JLabel(congratulationsString);
        congratulationsLabel.setFont(new Font("Arial Black", Font.BOLD, 48));
        congratulationsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(congratulationsLabel);

        JLabel winAmountLabel = new JLabel(winAmountString);
        winAmountLabel.setFont(new Font("Arial Black", Font.BOLD, 48));
        winAmountLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(winAmountLabel);
    }
}