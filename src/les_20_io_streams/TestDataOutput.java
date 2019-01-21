package les_20_io_streams;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutput {
    public static void main(String[] args) {
        int a = 16;//4
        boolean b = true;//1
        double c = 0;//8
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("da.dat"))) {
            dos.writeInt(a);
            dos.writeBoolean(b);
            dos.writeDouble(c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
