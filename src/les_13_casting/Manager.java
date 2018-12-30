package les_13_casting;

import java.util.StringJoiner;

public class Manager extends Worker {
    protected double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Manager.class.getSimpleName() + "[", "]")
                .add("name = '" + super.getName() + "'")
                .add("salary = " + getSalary() + "(" + super.getSalary() + " + " + bonus + ")")
                .add("bonus = " + bonus)
                .toString();
    }
}
