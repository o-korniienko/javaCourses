package inheritance_les_11;

public class TestPoint {
    public static void main(String[] args) {
        Point[] points = new Point[3];
        points[0] = new Point1D("black",1);
        points[1] = new Point2D("green",1,2);
        points[2] = new Point3D("red",1,3,5);
        for (Point p : points) {
            System.out.println(p.toString());
        }
        for (Point p : points) {
            p.show();
        }
    }
}
