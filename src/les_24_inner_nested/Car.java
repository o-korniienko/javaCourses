package les_24_inner_nested;

import java.util.Arrays;
import java.util.StringJoiner;

public class Car {
    private String name;
    protected Engine engine;

    public Car(String name, String nameE, int power) {
        this.name = name;
        this.engine = new Engine(nameE, power);
    }

    class Engine {  //inner class - внутрішній клас
                    //не існує доки не буде створено екземпляр Car!!!!
        String name;
        int power;

        public Engine(String name, int power) {
            this.name = name;
            this.power = power;
        }

        @Override
        public String toString() {
            //inner class can access fields of enclosing class!!!
            String nameOfCar = Car.this.name; //!!! name in class Car
            Engine e = engine;
            return "'" + name + ' ' + power + "hp" + "'";
        }
    }

    static class Info{  //nested class - внутрішній клас
                        // існує одразу при завнтаженні Car!!!!
        void printInfo(){ //reflexion!!
            System.out.println("name= "+Car.class.getName());
            System.out.println("fields= " + Arrays.toString(Car.class.getDeclaredFields()));
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("engine=" + engine)
                .toString();
    }

}
