package les_7_classes;

public class TriangleTest {
    public static void main(String[] args) {
//        Triangle triangle = new Triangle();
//        triangle.setName("Triangle№1");
//        triangle.setSite1(8);
//        triangle.setSite2(9);
//        triangle.setSite3(10);
//        triangle.print();
//        System.out.println("Square = " + triangle.square());
//
//        Triangle triangle1 = new Triangle("Triangle№2", 4, 3, 5);
//        triangle1.print();
//        System.out.println("Square = " + triangle1.square());

        Triangle1 triangle11 = new Triangle1(4,4,8);
        System.out.println("triangle11 = " + triangle11.toString());
        System.out.println("triangle11 = " + triangle11.getPerimeter());
        System.out.println("triangle11 isRivnobedren = " + triangle11.isRivnobedren());
        System.out.println("triangle11 isRivnostor = " + triangle11.isRivnostor());
        System.out.println("triangle11 isPryamokut = " + triangle11.isPryamokut());

    }
}
