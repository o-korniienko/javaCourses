package les_6_methods;

public class TestTriangle {
    public static void main(String[] args) {


        Triangle triangle = new Triangle(6,6,4);
        Triangle triangle2 = new Triangle(8,8,8);

        System.out.println(triangle);

        System.out.println("Это треугольник? =" + triangle.proverka());
        System.out.println("Прямоугольный? =" + triangle.proverkaPryamCover());
        System.out.println("Периметр =" + triangle.perimeter());
        System.out.println("Площадь" + triangle.area());
        System.out.println("равнобедренный=" + triangle.ravnoBedr ());

        System.out.println(triangle2);
        System.out.println("Периметр =" + triangle2.perimeter());
        System.out.println("Площадь" + triangle2.area());
        System.out.println(triangle.isGreater(triangle2));
        System.out.println("равноcторонний=" + triangle2.ravStoron());
        System.out.println("равнобедренный=" + triangle2.ravnoBedr ());


    }



}
