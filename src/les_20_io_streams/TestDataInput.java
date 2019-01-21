package les_20_io_streams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestDataInput {
    public static void main(String[] args) {
        int a;
        boolean b;
        double c;
        try (DataInputStream dis =
                new DataInputStream(new FileInputStream("da.dat"))){
            a = dis.readInt();
            b = dis.readBoolean();
            c = dis.readDouble();
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
