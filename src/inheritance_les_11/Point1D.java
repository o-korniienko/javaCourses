package inheritance_les_11;

public class Point1D extends Point {
    protected double x;

    public Point1D(String color, double x) {
        super(color);
        this.x = x;
    }

    @Override
    public void show() {
        System.out.println("point:" + x + ";");
    }
    //    public void show() {
//        System.out.println("point:" + x + ";");
//    }

    @Override
    public String toString() {
        return "Point1D{" +
                "x=" + x +
                ", color='" + color + '\'' +
                '}';
    }
}
