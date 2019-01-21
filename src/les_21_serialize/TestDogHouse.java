package les_21_serialize;

import java.util.Scanner;

public class TestDogHouse {
    public static void main(String[] args) {
        DogHouse dogHouse = DogHouse.loadFromFile("doghouse.dat");
        /*dogHouse.add(new Dog("Archi",7));
        dogHouse.add(new Dog("Barbos",3));
        dogHouse.add(new Dog("Junya",17));
        dogHouse.add(new Dog("Afina",8));*/
        Scanner sc = new Scanner(System.in);
        System.out.println("input name");
        String name = sc.nextLine();
        System.out.println("input year");
        int year = sc.nextInt();
        dogHouse.add(new Dog(name, year));
        dogHouse.saveToFile("doghouse.dat");
        dogHouse.printAll();
    }
}
