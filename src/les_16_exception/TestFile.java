package les_16_exception;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFile {
    public static void main(String[] args) {
        File file = new File("a.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file.getAbsoluteFile());
            try {
                for (int i = 0; i < 12; i++) {
                    pw.println("Hello!!! " + i);
                }
            } finally {
                pw.close();
                System.out.println("finally відпрацював");
            }
        } catch (IOException e) {
            System.out.println("ERROR");
        } finally {
            System.out.println("finally2 відпрацював");
        }
    }
}
