package les_19_equals_hashcode;

import java.util.StringJoiner;

public class Car {
    private String name;
    private int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

//    @Override
//    public boolean equals(Object obj) {
//        Car other = (Car) obj;
//        return this.name.equals(other.name) && this.year == other.year;
//    }
//
//    @Override
//    public int hashCode() {
//        return name.hashCode() + year;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        return name.equals(car.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("year=" + year)
                .toString();
    }
}
