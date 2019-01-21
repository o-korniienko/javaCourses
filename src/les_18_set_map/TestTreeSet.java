package les_18_set_map;

import les_07_array_of_objects.Car;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        //anonymous class!!!:
        Comparator<Car> byYear;
        byYear = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c1.getYear() - c2.getYear();
            }
        };
        Comparator<Car> byName;
        byName = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c1.getName().compareTo(c2.getName()) ;
            }
        };
        TreeSet<Car> treeSet = new TreeSet<>(byYear.thenComparing(byName));

        treeSet.add(new Car("Tesla", 2008));
        treeSet.add(new Car("Porshe", 2011));
        treeSet.add(new Car("Ferrari", 2018));
        treeSet.add(new Car("KIA", 1999));
        treeSet.add(new Car("Audi", 2008));
        System.out.println(treeSet);
    }
}
