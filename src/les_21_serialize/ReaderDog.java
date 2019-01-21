package les_21_serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReaderDog {
    public static void main(String[] args) {
        Dog dog1 = null;
        Dog dog2 = null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dogs.dat"))) {
            dog1 = (Dog) ois.readObject();
            dog2 = (Dog) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(dog1);
        System.out.println(dog2);
    }
}
