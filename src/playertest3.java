import javax.swing.*;
import java.awt.event.*;


public class playertest3 {

    public static void main(String[] args){
        boolean press = false;
        JFrame frame1 = new JFrame("button");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button =  new JButton("press");

        button.setBounds(50, 100,95,30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("HELP");
            }
        });
        frame1.add(button);
        frame1.setSize(300,300);
        frame1.setLayout(null);
        frame1.setVisible(true);
        System.out.println(press + "");
//    boolean press1 = false;
//    JFrame frame2 = new JFrame("button1");
//        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    JButton button1 =  new JButton("press");
//
//        button1.setBounds(50, 100,95,30);
//
//        button1.addActionListener(new ActionListener() {
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("HELP1");
//        }
//    });
//        frame2.add(button1);
//        frame2.setSize(300,300);
//        frame2.setLayout(null);
//        frame2.setVisible(true);
//        System.out.println(press1 + "");
        }
}
