import javax.swing.*;
import java.awt.event.*;


public class playertest3 {

    public static void main(String[] args) {
        boolean press = false;
        JFrame frame1 = new JFrame("button");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("press");

        button.setBounds(50, 100, 95, 100);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("HELP");
            }
        });
        frame1.add(button);
        frame1.setSize(300, 300);
        frame1.setLayout(null);
        frame1.setVisible(true);
        System.out.println(press + "");
    }
}
