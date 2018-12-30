package jframe_practic;

import javax.swing.*;

public class FrameQuestion extends JFrame {


    public FrameQuestion() {
        setSize(250, 250);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setTitle("Make your choice");

        JButton horde = new JButton("Horde");
        horde.setBounds(35, 90, 80, 20);
        add(horde);
        Listener hordeListener = new Listener(2);
        horde.addActionListener(hordeListener);

        JButton aliance = new JButton("Aliance");
        aliance.setBounds(125, 90, 80, 20);
        add(aliance);
        Listener alianceListener = new Listener(3);
        aliance.addActionListener(alianceListener);
    }
}
