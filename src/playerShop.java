import javax.swing.*;
import java.awt.event.*;

public class playerShop {
    public static void main(String[] args){
        JFrame window = new JFrame("Super Auto Guys");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setSize(500, 350);
        window.setVisible(true);
        window.setLayout(null);

        JButton rollButton = new JButton("Roll");
        rollButton.setBounds(20, 250, 90,50);


        window.add(rollButton);

    }
}
