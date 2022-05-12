import javax.swing.*;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

public class playertest2 extends JFrame{
    private int width;
    private int height;
    private JButton b1;
    private Container contentPane;
    private JTextArea text;

    public playertest2(int w, int h){
        width = w;
        height = h;
        contentPane = this.getContentPane();
        text = new JTextArea();
        b1 = new JButton("press");
    }
    public void makeGUI(){
        JFrame frame = new JFrame("test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SpringLayout layout = new SpringLayout();
        frame.setLayout(layout);

        contentPane.add(b1);

        frame.setVisible(true);
    }
    public static void main(String[] args){
        playertest2 player = new playertest2(300, 300);
        player.makeGUI();
    }
}
