package les_6_methods;
// HOME TASK:

// написати методи
// чи є трикутник:
// 1 рівносторонній - isRight()
// 2 рівнобедренний - ...
// 3 прямокутний - ...

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean proverka () {
        return  (c<a+b && b<a+c && a<b+c);
    }

    public boolean proverkaPryamCover () {
        double k=2;
        double a1=Math.pow(a,k);
        double b1=Math.pow(b,k);
        double c1=Math.pow(c,k);
        return  (c1==a1+b1 || b1==a1+c1 || a1==b1+c1);
    }

    public boolean ravnoBedr(){

        return (a==b && b!=c && a!=c );
    }

    public boolean ravStoron(){

        return (a==b && b==c && c==a);
    }
    public double perimeter() { //периметр трикутника
        return a + b + c;
    }

    //площа трикутника
    public double area(){

        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    //метод, що порівнює два трикутника (точніше,
    // "себе" з тим, що прийшов в метод
    // (порівнюємо площі)

    public boolean isGreater( Triangle other){
        double s1 = this.area();
        double s2 = other.area();
        return  s1 > s2;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
