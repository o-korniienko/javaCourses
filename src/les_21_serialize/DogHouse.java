package les_21_serialize;

import java.io.*;
import java.util.ArrayList;

public class DogHouse implements Serializable {
    private ArrayList<Dog> dogs;

    public static DogHouse loadFromFile(String fileName) {
        DogHouse dh = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            dh = (DogHouse) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return dh;
    }

    public DogHouse() {
        this.dogs = new ArrayList<>();
    }

    public boolean add(Dog dog) {
        return dogs.add(dog);
    }

    public void saveToFile(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(this);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void delAll(){
        for (Dog d : dogs) {
            dogs.remove(d);
        }
    }

    public void printAll() {
        System.out.println("All dogs");
        for (Dog d : dogs) {
            System.out.println(d);
        }
    }

}
