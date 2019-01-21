package les_20_io_streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInput {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("test.txt");
            for (int i = 0; i < 26; i++) {
                System.out.print((char) fis.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            fis.close();
        }
    }
}
