package example;

import javax.swing.*;
import java.awt.*;

public class FrameTry extends JFrame {

    JButton b1,b2,b3,b4,b5;
    JTextField field;
    JLabel label;
    public FrameTry(){
        setLayout(new FlowLayout());
        setSize(300,400);
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        label = new JLabel("Hello World!!!!!!!!!!!!!!!!!!!!");
        field = new JTextField("Hello World!!!!!!!!!!!!!!!!");
        add(field);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(label);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }
}
