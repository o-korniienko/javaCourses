package inheritance_les_11;

public class Point2D extends Point1D {
    protected double y;

    public Point2D(String color, double x, double y) {
        super(color, x);
        this.y = y;
    }


    @Override
    public void show() {
        System.out.println("point:" + x + "," + y + ";");
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "y=" + y +
                ", x=" + x +
                ", color='" + color + '\'' +
                '}';
    }
}
