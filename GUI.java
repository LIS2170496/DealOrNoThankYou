import javax.swing.*;

public class GUI extends JFrame {
    
    int frameWidth = 750;
    int frameHeight = 1125;  //width*1.5

    public GUI() {
        super("Deal or No Thank You");
        setSize(frameWidth, frameHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

    }


}
