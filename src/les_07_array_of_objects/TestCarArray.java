package les_07_array_of_objects;

public class TestCarArray {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car("Audi", 2001);
        cars[2] = new Car("Mercedes", 1950);
        cars[1] = new Car("BMW", 1999);
        cars[3] = new Car("Tesla", 2015);
        for (Car car : cars) {
            System.out.println("car = " + car);
        }
        printCarsGreaterYear(cars, 2000);
    }

    static void printCarsGreaterYear(Car[] cars, int year) {
        System.out.println();
        for (Car car : cars) {
            if (car.getYear() > year) System.out.println("car = " + car);
        }
    }
}
