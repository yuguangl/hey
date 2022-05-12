
import java.awt.BorderLayout;

import java.awt.Color;



import javax.swing.JButton;

import javax.swing.JPanel;

import javax.swing.JFrame;


public class testing {



    public static void main(String[] args) {





        JFrame frame = new JFrame("JPanels");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        BorderLayout layout = new BorderLayout();

        frame.setLayout(layout);



        JPanel northPanel = new JPanel();

        JPanel westPanel = new JPanel();

        JPanel centerPanel = new JPanel();

        JPanel eastPanel = new JPanel();

        JPanel southPanel = new JPanel();



        northPanel.setBackground(Color.RED);

        westPanel.setBackground(Color.BLUE);

        centerPanel.setBackground(Color.GREEN);

        eastPanel.setBackground(Color.ORANGE);

        southPanel.setBackground(Color.CYAN);



        northPanel.add(new JButton("A"));

        northPanel.add(new JButton("B"));

        northPanel.add(new JButton("C"));



        westPanel.add(new JButton("One"));

        westPanel.add(new JButton("Two"));

        westPanel.add(new JButton("Three"));



        eastPanel.add(new JButton("1"));

        eastPanel.add(new JButton("2"));

        eastPanel.add(new JButton("3"));



        southPanel.add(new JButton("Yes"));

        southPanel.add(new JButton("No"));

        southPanel.add(new JButton("Maybe"));



        frame.add(northPanel, BorderLayout.NORTH);

        frame.add(westPanel, BorderLayout.WEST);

        frame.add(centerPanel, BorderLayout.CENTER);

        frame.add(eastPanel, BorderLayout.EAST);

        frame.add(southPanel, BorderLayout.SOUTH);



        frame.setSize(500, 250);

        frame.setVisible(true);



    }



}
