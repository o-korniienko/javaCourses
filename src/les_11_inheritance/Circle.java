package les_11_inheritance;

import java.util.StringJoiner;

public class Circle extends Shape {
    protected double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    @Override
    public double perimeter() {
        return r*Math.PI*2;
    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Circle.class.getSimpleName() + "[", "]")
                .add("r=" + r)
                .toString();
    }
}
