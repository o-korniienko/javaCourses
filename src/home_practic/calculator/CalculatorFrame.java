package home_practic.calculator;

import javax.swing.*;

public class CalculatorFrame{
    private JFrame frame;
    private JPanel panel;
    private static JTextField field;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b0;
    private JButton bAdd;
    private JButton bSubtract;
    private JButton bMultiply;
    private JButton bDivide;
    private JButton bPow;
    private JButton bSqrt;
    private JButton bResult;
    private JButton bClearOne;
    private JButton bClearAll;
    private JButton bPoint;
    private JButton bPerc;


    public CalculatorFrame()  {
        this.frame = new JFrame();
        this.panel = new JPanel();
        this.field = new JTextField(20);
        this.b1 = new JButton("1");
        this.b2 = new JButton("2");
        this.b3 = new JButton("3");
        this.b4 = new JButton("4");
        this.b5 = new JButton("5");
        this.b6 = new JButton("6");
        this.b7 = new JButton("7");
        this.b8 = new JButton("8");
        this.b9 = new JButton("9");
        this.b0 = new JButton("0");
        this.bAdd = new JButton("+");
        this.bSubtract = new JButton("-");
        this.bMultiply = new JButton("*");
        this.bDivide = new JButton("/");
        this.bPow = new JButton("x^");
        this.bSqrt = new JButton("√");
        this.bResult = new JButton("=");
        this.bClearOne = new JButton("C");
        this.bClearAll = new JButton("CE");
        this.bPoint = new JButton(".");
        this.bPerc = new JButton("%");

        panel.setLayout(null);
        field.setBounds(5,5,220,35);
        b1.setBounds(10,45,45,25);
        b2.setBounds(65,45,45,25);
        b3.setBounds(120,45,45,25);
        b4.setBounds(10,80,45,25);
        b5.setBounds(65,80,45,25);
        b6.setBounds(120,80,45,25);
        b7.setBounds(10,115,45,25);
        b8.setBounds(65,115,45,25);
        b9.setBounds(120,115,45,25);
        b0.setBounds(65,150,45,25);
        bAdd.setBounds(175,45,45,25);
        bSubtract.setBounds(175,80,45,25);
        bMultiply.setBounds(175,115,45,25);
        bDivide.setBounds(175,150,45,25);
        bPow.setBounds(230,80,55,25);
        bSqrt.setBounds(230,115,55,25);
        bResult.setBounds(120,150,45,25);
        bClearOne.setBounds(230,45,55,25);
        bClearAll.setBounds(230,5,55,35);
        bPoint.setBounds(10,150,45,25);
        bPerc.setBounds(230,150,55,25);
        panel.add(field);
        panel.add(bClearAll);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(bAdd);
        panel.add(bClearOne);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(bSubtract);
        panel.add(bMultiply);
        panel.add(b9);
        panel.add(b0);
        panel.add(bPoint);
        panel.add(bResult);
        panel.add(bDivide);
        panel.add(bSqrt);
        panel.add(bPow);
        panel.add(bPerc);
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(310,220);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setTitle("Калькулятор");
        frame.setVisible(true);

    }

    public    void setTextToField(String s){
        field.setText(s);
    }
    public  String getTextFromField(){
        String s;
        s= field.getText();
        return s;
    }
    public void setControllers(CalculatorController controller){
        b1.addActionListener(controller);
        b2.addActionListener(controller);
        b3.addActionListener(controller);
        b4.addActionListener(controller);
        b5.addActionListener(controller);
        b6.addActionListener(controller);
        b7.addActionListener(controller);
        b8.addActionListener(controller);
        b9.addActionListener(controller);
        b0.addActionListener(controller);
        bAdd.addActionListener(controller);
        bSubtract.addActionListener(controller);
        bMultiply.addActionListener(controller);
        bDivide.addActionListener(controller);
        bPow.addActionListener(controller);
        bSqrt.addActionListener(controller);
        bResult.addActionListener(controller);
        bPoint.addActionListener(controller);
        bClearAll.addActionListener(controller);
        bClearOne.addActionListener(controller);
        bPerc.addActionListener(controller);
    }
}
