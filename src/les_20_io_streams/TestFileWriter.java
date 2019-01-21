package les_20_io_streams;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main(String[] args) {
        String s = "We are all made of stars!!!";
        String s1 = "Stars within us!";
        String s2 = "I like stars!";
        try (FileWriter fw = new FileWriter("myText.txt")) {
            fw.write(s + '\n');
            fw.write(s1 + '\n');
            fw.write(s2 + '\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
