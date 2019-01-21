package les_24_inner_nested;

public class TestInnerNested {
    public static void main(String[] args) {
        Car car = new Car("Lada","ERG",50);
        Car car1 = new Car("Porshe","GRA",750);
        System.out.println(car);
        System.out.println(car1);

        //Car.Engine e = new Car.Engine("sda",23); //cannot!!! Engine is inner class!!!
        Car.Info info = new Car.Info();
        info.printInfo();
    }
}
