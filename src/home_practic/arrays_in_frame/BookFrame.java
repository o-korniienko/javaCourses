package home_practic.arrays_in_frame;

import javax.swing.*;
import java.awt.*;

public class BookFrame extends JFrame {

    public void setLibrary(String s) {
       // JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Tes Frame");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JTextArea area = new JTextArea();
//        area.setLineWrap(true);    перенос рядка
//        area.setWrapStyleWord(true); стиль переносу(без розривання слів)
        area.setCaretPosition(0);
        area.setText(s);
        JScrollPane pane = new JScrollPane(area);
        panel.add(pane, BorderLayout.CENTER);
        frame.getContentPane().add(panel);
        frame.setPreferredSize(new Dimension(450, 300));
        frame.pack();
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
