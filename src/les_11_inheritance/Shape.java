package les_11_inheritance;

public class Shape {
    protected String color; //- доступ лише послідовникам

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double perimeter(){
        return 0;
    }
    public double area(){
        return 0;
    }
}
