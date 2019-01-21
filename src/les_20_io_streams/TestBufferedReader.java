package les_20_io_streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestBufferedReader {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bf =
                     new BufferedReader(new FileReader("myText.txt"))){
//            String s = bf.readLine();
//            while (s!=null){
//                list.add(s);
//                s = bf.readLine();
//            }
            String s;
            while ((s = bf.readLine())!=null){
                list.add(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("list = " + list);
    }
}
