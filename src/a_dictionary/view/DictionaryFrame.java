package a_dictionary.view;

import a_dictionary.controller.DictionaryEngine;

import javax.swing.*;
import java.awt.*;

public class DictionaryFrame extends JFrame {
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JButton buttonTR;
    private JButton buttonCLR;

    public DictionaryFrame(int wid, int hei) {
        super();
        this.setTitle("Dictionary =)");

        int xx = 200;
        int yy = 200;
        this.setBounds(xx, yy, xx + 100, yy + 100);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        this.add(panel);
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();

        JLabel label1 = new JLabel("            English  ");
        JLabel label2 = new JLabel("                Ukrainian");

        panel.add(label1, BorderLayout.WEST);
        panel.add(label2, BorderLayout.AFTER_LAST_LINE);

        panel.add(jTextField1, BorderLayout.NORTH);
        panel.add(jTextField2, BorderLayout.AFTER_LAST_LINE);

        buttonTR = new JButton("translate");
        panel.add(buttonTR);
        buttonCLR = new JButton("clear");
        panel.add(buttonCLR);


        //DictionaryEngine engine = new DictionaryEngine(this, d);


        this.setContentPane(panel);
        this.setSize(wid, hei);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public String getEngText() {

        return jTextField1.getText();
    }

    public void setEngText(String s) {
        jTextField1.setText(s);
    }

    public String getUkrText() {
        return jTextField2.getText();
    }

    public void setUkrText(String s) {
        jTextField2.setText(s);
    }

    public void setControllers(DictionaryEngine engine){
        buttonTR.addActionListener(engine);
        buttonCLR.addActionListener(engine);
        buttonTR.addKeyListener(engine);
        buttonCLR.addKeyListener(engine);

    }
}