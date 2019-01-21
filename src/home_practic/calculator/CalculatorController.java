package home_practic.calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class CalculatorController implements ActionListener {
    private CalculatorFrame frame;

    private static String numberStr1;

    private static String numberStr2;
    private static String actionStr;
    private static BigDecimal b1;
    private static BigDecimal b2;

    public CalculatorController(CalculatorFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String text = button.getText();
        if (text.equals("1")) {
            frame.setTextToField(frame.getTextFromField() + "1");
        }
        if (text.equals("2")) {
            frame.setTextToField(frame.getTextFromField() + "2");
        }
        if (text.equals("3")) {
            frame.setTextToField(frame.getTextFromField() + "3");
        }
        if (text.equals("4")) {
            frame.setTextToField(frame.getTextFromField() + "4");
        }
        if (text.equals("5")) {
            frame.setTextToField(frame.getTextFromField() + "5");
        }
        if (text.equals("6")) {
            frame.setTextToField(frame.getTextFromField() + "6");
        }
        if (text.equals("7")) {
            frame.setTextToField(frame.getTextFromField() + "7");
        }
        if (text.equals("8")) {
            frame.setTextToField(frame.getTextFromField() + "8");
        }
        if (text.equals("9")) {
            frame.setTextToField(frame.getTextFromField() + "9");
        }
        if (text.equals("0")) {
            frame.setTextToField(frame.getTextFromField() + "0");
        }
        if (text.equals(".")) {
            frame.setTextToField(frame.getTextFromField() + ".");
        }
        if (text.equals("CE")) {
            frame.setTextToField("");
            b1 = null;
            b2 = null;
        }
        if (text.equals("C")) {
            if (frame.getTextFromField().isEmpty()) {
                b1 = null;
                b2 = null;
                return;
            } else {
                numberStr1 = frame.getTextFromField();
                numberStr2 = numberStr1.substring(0, numberStr1.length() - 1);
                frame.setTextToField(numberStr2);
            }
        }
        if (text.equals("+")) {
            if (frame.getTextFromField().equals("-")) return;
            else {
                getSet();
                actionStr = "+";
            }
        }
        if (text.equals("-")) {
            if (frame.getTextFromField().equals("-")) return;
            else {
                if (frame.getTextFromField().isEmpty()) {
                    frame.setTextToField("-");
                } else {
                    getSet();
                    actionStr = "-";
                }
            }
        }
        if (text.equals("*")) {
            if (frame.getTextFromField().equals("-")) return;
            else {
                getSet();
                actionStr = "*";
            }
        }
        if (text.equals("/")) {
            if (frame.getTextFromField().equals("-")) return;
            else {
                getSet();
                actionStr = "/";
            }
        }
        if (text.equals("x^")) {
            if (frame.getTextFromField().equals("-")) return;
            else {
                getSet();
                actionStr = "k";
            }
        }
        if (text.equals("√")) {
            if (frame.getTextFromField().contains("-")) return;
            if (frame.getTextFromField().equals("-")) return;
            else {
                try {
                    b1 = BigDecimal.valueOf((Math.sqrt(Double.parseDouble(frame.getTextFromField()))));
                    double sQ =b1.doubleValue();
                    if (sQ%1==0){
                        int sQr = (int) sQ;
                        frame.setTextToField(String.valueOf(sQr));
                        b1 = null;
                        b2 = null;
                    }else{
                        frame.setTextToField(String.valueOf(b1));
                        b1 = null;
                        b2 = null;
                        actionStr = "l";
                    }
                } catch (NumberFormatException e1) {
                    frame.setTextToField("please enter the numbers");
                }
            }
        }
        if (text.equals("%")){
            if (frame.getTextFromField().equals("-")) return;
            else {
                getSet();
                actionStr = "%";
            }
        }
        if (text.equals("=")) {
            if (frame.getTextFromField().isEmpty() || actionStr == null
                    || frame.getTextFromField().equals("-"))
                return;
            else {
                try {
                    numberStr2 = frame.getTextFromField();
                    b2 = BigDecimal.valueOf(Double.parseDouble(numberStr2));
                    if (b1 == null || b2 == null) {
                        return;
                    }
                    if (actionStr == "/" && Double.parseDouble(numberStr2) == 0) {
                        frame.setTextToField("can not divide by zero");
                    } else {

                        if (actionStr == "+") {
                            b1 = b1.add(b2);
                        }
                        if (actionStr == "-") {
                            b1 = b1.subtract(b2);
                        }
                        if (actionStr == "*") {
                            b1 = b1.multiply(b2);
                        }

                        if (actionStr == "k") {
                            b1 = BigDecimal.valueOf(Math.pow(Double.valueOf(numberStr1), Double.parseDouble(numberStr2)));
                        }
                        if (actionStr == "/") {
                            b1 = b1.divide(b2, 5, BigDecimal.ROUND_HALF_UP);
                        }
                        if (actionStr == "l") {
                            frame.setTextToField("");
                        }
                        if(actionStr == "%"){
                            BigDecimal b3= BigDecimal.valueOf(100);
                            b1=b2.divide(b3).multiply(b1);
                        }

                        double result = b1.doubleValue();
                        if (result%1==0){
                            int resultInt = (int) result;
                            frame.setTextToField(String.valueOf(resultInt));
                            b1 = null;
                            b2 = null;
                        }else{
                            frame.setTextToField(String.valueOf(b1));
                            b1 = null;
                            b2 = null;
                        }
                    }
                } catch (NumberFormatException e1) {
                    frame.setTextToField("please enter the numbers");
                }
            }
        }
    }

    public void getSet() {
        try {
            numberStr1 = frame.getTextFromField();
            b1 = BigDecimal.valueOf(Double.parseDouble(numberStr1));
            frame.setTextToField("");
        } catch (NumberFormatException e) {
            frame.setTextToField("please enter the numbers");
        }
    }
}
