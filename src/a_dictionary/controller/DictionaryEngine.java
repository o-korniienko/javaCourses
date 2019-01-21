package a_dictionary.controller;

import a_dictionary.model.Dictionary;
import a_dictionary.view.DictionaryFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DictionaryEngine implements ActionListener, KeyListener {
    private DictionaryFrame frame;
    private Dictionary d;

    public DictionaryEngine(DictionaryFrame frame, Dictionary d) {
        this.frame = frame;
        this.d = d;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String text = button.getText();

        if (text.equals("translate")) {
            String engText = frame.getEngText();
            engText = engText.trim().toLowerCase();
            String ukrText = d.translate(engText);
            frame.setUkrText(ukrText);
        }

        if (text.equals("clear")) {
            frame.setUkrText("");
            frame.setEngText("");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_DELETE) {
            frame.setUkrText("");
            frame.setEngText("");
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
