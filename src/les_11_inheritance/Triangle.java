package les_11_inheritance;

import java.util.StringJoiner;

public class Triangle extends Shape {
    protected double a, b, c;

    public Triangle(String color, double a, double b, double c) {
        super(color); //виклик батьківського конструктора
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Triangle.class.getSimpleName() + "[", "]")
                .add("a=" + a)
                .add("b=" + b)
                .add("c=" + c)
                .add("color='" + color + "'")
                .toString();
    }
}
