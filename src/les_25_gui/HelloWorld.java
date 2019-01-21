package les_25_gui;

import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JFrame {
    public HelloWorld() throws HeadlessException {
       this.setSize(400,300);
       this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       this.setTitle("Hello World!!!");
       this.setLocationRelativeTo(null);
       this.setVisible(true);
       this.setLayout(null);
       JButton button = new JButton("Click me");
       button.setBounds(140,100,120,20);
       this.add(button);

    }

    public static void main(String[] args) {
        new HelloWorld();
    }
}
