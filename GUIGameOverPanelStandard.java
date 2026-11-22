import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.*;
import java.awt.*;

public class GUIGameOverPanelStandard extends GUIGameOverPanel {
    int panelWidth = 1100;
    int panelHeight = 550;

    public GUIGameOverPanelStandard (double amount) {

        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        double winAmount = amount;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String congratulationsString = "Congratulations!";
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



    public GUIGameOverPanelStandard (double amount, boolean winSuperDuper) {
        //FIX ME - ADD SUPER DUPER SOUND AND COLORS
        
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

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
