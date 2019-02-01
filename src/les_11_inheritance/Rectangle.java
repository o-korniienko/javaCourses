package les_11_inheritance;

import java.util.StringJoiner;

public class Rectangle extends Shape {
    private double x;
    private double y;

    public Rectangle(String color, double x, double y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    @Override
    public double perimeter() {
        return x + y;
    }

    @Override
    public double area() {
        return x * y;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Rectangle.class.getSimpleName() + "[", "]")
                .add("x=" + x)
                .add("y=" + y)
                .add("color='" + color + "'")
                .toString();
    }
}
