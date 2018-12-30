package les_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedErrors {
    public static void main(String[] args) {

        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader("Test.txt"));
            String s = br.readLine();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    static void m() throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("rf.u"));
    }
    static void m1() throws FileNotFoundException {
        m();
    }
    static void m2() throws FileNotFoundException {
        m1();
    }
}
