package a_factory_pattern;

import les_11_inheritance.Circle;
import les_11_inheritance.Rectangle;
import les_11_inheritance.Triangle;

public class TestFactory {
    public static void main(String[] args) {
        Circle c = (Circle) ShapeFactory.getShape(5);
        Triangle t = (Triangle) ShapeFactory.getShape(4,5,6);
        Rectangle r = (Rectangle) ShapeFactory.getShape(7,9);

    }
}
