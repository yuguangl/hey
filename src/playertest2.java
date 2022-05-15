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
    }
    public void makeGUI(){
        //frame.
        JFrame frame = new JFrame("test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1 = new JButton("press");

        frame.setSize(width, height);

        text.setText("A MAN HAS FALLEN INTO THE RIVER!");
        text.setWrapStyleWord(true);
        text.setLineWrap(true);
        text.setEditable(false);

        SpringLayout layout = new SpringLayout();
        frame.setLayout(layout);

        b1.setBounds(350,50,100,100);
        frame.add(b1);

        frame.setVisible(true);
    }
    public static void main(String[] args){
        playertest2 player = new playertest2(300, 300);
        player.makeGUI();
    }
}
