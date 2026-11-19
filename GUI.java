import javax.swing.*;

public class GUI extends JFrame {
    
    int frameHeight = 750;
    int frameWidth = 1125;  //height*1.5

    public GUI() {
        super("Deal or No Thank You");
        setSize(frameWidth, frameHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

    }


}
