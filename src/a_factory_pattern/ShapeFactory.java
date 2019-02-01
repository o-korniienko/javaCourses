package a_factory_pattern;

import les_11_inheritance.Circle;
import les_11_inheritance.Rectangle;
import les_11_inheritance.Shape;
import les_11_inheritance.Triangle;

public class ShapeFactory {

    public static Shape getShape(double... a) {
        int len = a.length;
        if (len == 1) return new Circle("black", a[0]);
        if (len == 3) return new Triangle("red", a[0], a[1], a[2]);
        if (len == 2) return new Rectangle("red", a[0], a[1]);

        return null;
    }

}
