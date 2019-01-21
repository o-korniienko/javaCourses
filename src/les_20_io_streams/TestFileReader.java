package les_20_io_streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        try (FileReader fr = new FileReader("myText.txt")){
            int b = fr.read();
            while (b!=-1){
                s.append((char) b);
                b = fr.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(s);
    }
}
