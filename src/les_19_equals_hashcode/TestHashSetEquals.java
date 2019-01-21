package les_19_equals_hashcode;

import java.util.HashSet;
import java.util.Set;

public class TestHashSetEquals {
    public static void main(String[] args) {
        Car car1 = new Car("Porshe",2011); //@2344
        Car car2 = new Car("Porshe",2011); //@6767
        Set<Car>set = new HashSet<>();
        set.add(car1);
        set.add(car2);
        System.out.println(set);
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
    }
}
