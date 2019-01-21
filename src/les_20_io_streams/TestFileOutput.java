package les_20_io_streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutput {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        try {
             fos = new FileOutputStream("test.txt");
            for (int i = 0; i < 26; i++) {
                fos.write(i + 65);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            fos.close();
        }
    }
}
