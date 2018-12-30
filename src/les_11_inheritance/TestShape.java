package les_11_inheritance;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape("green");
        Triangle tr1 = new Triangle("red",3,4,5);
        Circle circle = new Circle("black",5);
        Square square = new Square("blue",7);
        System.out.println(shape.perimeter());
        System.out.println(tr1.perimeter());
        System.out.println(tr1.area());
        System.out.println(circle.perimeter());
        System.out.println(circle.area());
        System.out.println(square.perimeter());
        System.out.println(square.area());

    }
}
