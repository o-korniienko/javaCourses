package les_7_classes;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Tesla");  //car.name = "Tesla";
        car.setYear(2015); //car.year = 2015;
        car.beep();
        car.print();
        Car car1 = new Car("BMW",1996);
        car1.beep();
        car1.print();
    }
}
