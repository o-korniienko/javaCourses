package les_07_array_of_objects;

public class Garage {
    private Car[] cars;
    private int index;

    public Garage(int size) {
        this.cars = new Car[size];
        this.index = -1;
    }

    public void addCar(Car car) {
        if (index >= cars.length - 1) {
            System.out.println("Error no place for" + car);
            return;
        }
        cars[++index] = car;
    }

    public void delCarByName(String name) {
        int ind = getIndex(name);
        if (ind < 0) {
            System.out.println("There is not this car: " + name);
            return;
        }
        cars[ind] = cars[index];
        cars[index] = null;
        index--;
    }

    private int getIndex(String name) {
        for (int i = 0; i < index; i++) {
            if (cars[i].getName().equals(name)) return i;
        }
        return -1;
    }

    public void printCarsGreaterYear(int year) {
        System.out.println();
        for (int i = 0; i <= index; i++) {
            if (cars[i].getYear() > year) System.out.println("car = " + cars[i]);
        }

    }

    public void printCarsGreaterLetter(String letter) {
        System.out.println();
        for (int i = 0; i <= index; i++) {
            String let = cars[i].getName().substring(0, 1);
            if (let.compareTo(letter) >= 0) System.out.println(cars[i]);
        }

    }

    public void printAll() {
        System.out.println("Garage:");
        for (int i = 0; i <= index; i++) {
            System.out.println(cars[i]);

        }
    }
}
