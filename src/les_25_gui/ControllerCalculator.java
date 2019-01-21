package les_25_gui;

import javax.swing.*;
import java.awt.event.*;

public class ControllerCalculator implements ActionListener, KeyListener {

    private JTextField field1;
    private JTextField field2;
    private JTextField field3;

    public ControllerCalculator(JTextField field1, JTextField field2, JTextField field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String text = button.getText();
        double a = Double.parseDouble(field1.getText());
        double b = Double.parseDouble(field2.getText());
        double result;
        if (text.equals("+")) {
            result = a + b;
            field3.setText(String.valueOf(result));
        }
        if (text.equals("-")) {
            result = a - b;
            field3.setText(String.valueOf(result));
        }
        if (text.equals("*")) {
            result = a * b;
            field3.setText(String.valueOf(result));
        }
        if (text.equals("/")) {
            result = a / b;
            field3.setText(String.valueOf(result));
        }
        if (text.equals("C")) {
            field1.setText("");
            field2.setText("");
            field3.setText("");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
       int keyCode = e.getKeyCode();
       if (keyCode == KeyEvent.VK_DELETE ){
           field1.setText("");
           field2.setText("");
           field3.setText("");
       }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
