package practic_varargs;

public class City {
    String name;

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return ("City='" + name + "'");
    }
}
