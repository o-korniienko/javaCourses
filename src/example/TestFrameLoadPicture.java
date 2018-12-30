package example;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class TestFrameLoadPicture {
    static String URL = "http://www.google.ru/intl/en_com/images/logo_plain.png";

    public static void createGUI() {
        JFrame frame = new JFrame("Тестовое окно");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JLabel label = new JLabel();
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        frame.getContentPane().add(label, BorderLayout.CENTER);

        JButton button = new JButton("Загрузить логотип");
        button.setFocusable(false);
        button.setFont(new Font("Verdana", Font.PLAIN, 12));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Image img = loadImage();
                label.setIcon(new ImageIcon(img, "Google logo"));
            }
        });
        frame.getContentPane().add(button, BorderLayout.SOUTH);

        frame.setPreferredSize(new Dimension(285, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static Image loadImage() {
        try {
            String fileName = "google.png";
            BufferedImage img = ImageIO.read(new URL(URL));
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            ImageIO.write(img, "png", file);
            return img;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                createGUI();
            }
        });
    }
}
