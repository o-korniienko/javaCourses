package les_11_inheritance;

import java.util.StringJoiner;

public class Square extends Shape {
    protected double d;

    public Square(String color, double d) {
        super(color);
        this.d = d;
    }

    @Override
    public double perimeter() {
        return d + d + d + d;
    }

    @Override
    public double area() {
        return d*d;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Square.class.getSimpleName() + "[", "]")
                .add("d=" + d)
                .toString();
    }
}
