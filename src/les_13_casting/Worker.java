package les_13_casting;

import java.util.StringJoiner;

public class Worker {
    private String name;
    private double salary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Worker.class.getSimpleName() + "[", "]")
                .add("name = '" + name + "'")
                .add("salary = " + salary)
                .toString();
    }
}
