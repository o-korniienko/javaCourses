package home_practic.jframe_practic;

import javax.swing.*;

public class Frame extends JFrame {

    public Frame() {
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setTitle("Hello my friend!!!");

        JLabel image = new JLabel(new ImageIcon("C:\\Users\\Alex\\IdeaProjects\\untitled\\src\\home_practic\\jframe_practic\\01.jpg"));
        image.setBounds(0, 100, 400, 225);
        add(image);

        JLabel label = new JLabel("On whose side are you? Are you ready to make your choice?");
        label.setBounds(30, 40, 350, 20);
        add(label);
        JButton button = new JButton("Make your choice.");
        button.setBounds(95, 60, 200, 20);
        add(button);
        Listener buttonaction = new Listener(1);
        button.addActionListener(buttonaction);
    }
}
