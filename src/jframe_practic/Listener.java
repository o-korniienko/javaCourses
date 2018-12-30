package jframe_practic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener {
    public int buttonNumber;


    public Listener(int number) {
        buttonNumber = number;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FrameQuestion frameQuestion = new FrameQuestion();
        if (buttonNumber == 1) {
            frameQuestion.setVisible(true);
        }
        if (buttonNumber == 2) {
            JOptionPane.showMessageDialog(new JFrame(), "ahahahahaha you are such a fool");
        }
        if (buttonNumber == 3) {
            JOptionPane.showMessageDialog(new JFrame(), "good choice my friend");
        }
    }
}

