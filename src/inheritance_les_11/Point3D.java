package inheritance_les_11;

public class Point3D extends Point2D {
    protected double z;

    public Point3D(String color, double x, double y, double z) {
        super(color, x, y);
        this.z = z;
    }

    @Override
    public void show() {
        System.out.println("point:" + x + "," + y + "," + z + ";");
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", y=" + y +
                ", x=" + x +
                ", color='" + color + '\'' +
                '}';
    }
}
