package les_24_inner_nested;

import java.util.Comparator;

public class TestAnonymous {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        //1. anonymous class base on interface:
        Comparator c = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c1.getName().compareTo(c2.getName());
            }
        };

        //2. anonymous class base on class:
        Car carInherited = new Car("Porshe", "GRA", 750) {
            @Override
            public String getName() {
                return super.getName()+"-)"+this.getClass().getName();
            }
        };

        System.out.println(carInherited.getName());
    }
}
