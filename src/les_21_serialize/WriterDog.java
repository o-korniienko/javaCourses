package les_21_serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriterDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Archi",7);
        Dog dog2 = new Dog("Barbos",3);

       try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dogs.dat"))){
           oos.writeObject(dog1);
           oos.writeObject(dog2);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
