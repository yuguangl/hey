import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class playerShop{

    private JFrame window;
    private JButton rollButton;
    private JButton endButton;
    private ImageIcon copy;

//    public playerShop(){
//
//    }
    public static void main(String[] args){
    playerShop player1 = new playerShop();
    player1.play();
    }

    public void play(){
        JFrame window = new JFrame("Super Auto Guys");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon cornerImage = new ImageIcon("src/quan_messy.png");
        window.setIconImage(cornerImage.getImage());

//        window.getContentPane().set;

        window.setResizable(false);
        window.setSize(500, 350);
        window.setVisible(true);
        window.setLayout(null);

        JButton rollButton = new JButton("Roll");
        rollButton.setBounds(20, 250, 90,50);
        rollButton.setIcon(cornerImage);
        rollButton.setFocusable(false);
        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == rollButton) {
                    copy = new ImageIcon((Image) rollButton.getIcon());

                }
            }
        });

        JButton endButton = new JButton("End");
        endButton.setBounds(380, 250, 90,50);
        endButton.setFocusable(false);

        endButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == endButton){
                    endButton.setIcon(copy);
                }
            }
        });

        window.add(rollButton);
        window.add(endButton);



    }
}
