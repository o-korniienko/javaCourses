package les_07_array_of_objects;

public class TestGarage {
    public static void main(String[] args) {
        Garage garage = new Garage(5);
        garage.addCar(new Car("Audi", 2001));
        garage.addCar(new Car("Mercedes", 1950));
        garage.addCar(new Car("BMW", 1999));
        garage.addCar(new Car("Tesla", 2015));
//        garage.addCar(new Car("Porshe", 1955));
//        garage.addCar(new Car("Ford", 1979));
//        garage.printCarsGreaterYear(2000);
        garage.delCarByName("BMW");
        //garage.printAll();
        garage.printCarsGreaterLetter("M");
    }
}