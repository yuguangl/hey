import javax.swing.*;

import java.awt.*;

public class playertest1 extends JFrame{
    private int width;
    private int height;

    private Container contentPane;
    private JTextArea message;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;

    public playertest1(int w, int h){
        width =  w;
        height = h;
        contentPane = this.getContentPane();
        message = new JTextArea();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
    }
    public void setUpGUI(){
        this.setSize(width, height);
        this.setTitle("HEY! A MAN HAS FALLEN INTO THE RIVER IN LEGO CITY!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane.setLayout(new GridLayout(1, 5));
        message.setText("AYO!");
        message.setWrapStyleWord(true);
        message.setLineWrap(true);
        message.setEditable(false);
        contentPane.add(b1);
        contentPane.add(b2);
        contentPane.add(b3);
        contentPane.add(b4);
        this.setVisible(true);
    }
    public static void main(String[] args){
        playertest1 p = new playertest1(500, 500);
        p.setUpGUI();
    }
}

