package les_25_gui;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {

    public CalculatorFrame() throws HeadlessException {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label1 = new JLabel("Number 1");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum");
        JTextField result = new JTextField(10);
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multyply = new JButton("*");
        JButton divide = new JButton("/");
        JButton clear = new JButton("C");
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(label3);
        panel.add(result);
        panel.add(plus);
        panel.add(minus);
        panel.add(multyply);
        panel.add(divide);
        panel.add(clear);
        this.setContentPane(panel);
        this.setSize(400,100);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("My fourth calculator");
        this.setVisible(true);

        ControllerCalculator controllerCalculator = new ControllerCalculator(field1,field2,result);
        plus.addKeyListener(controllerCalculator);
        plus.addActionListener(controllerCalculator);
        minus.addActionListener(controllerCalculator);
        multyply.addActionListener(controllerCalculator);
        divide.addActionListener(controllerCalculator);
        clear.addActionListener(controllerCalculator);


    }
}
