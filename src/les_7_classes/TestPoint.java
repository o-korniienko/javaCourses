package les_7_classes;

public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point(3, 0);
        Point point2 = new Point(0, 4);
        System.out.println(Point.distance(point1, point2));
        System.out.println();
        System.out.println(point1.distanceTo(point2));
    }
}
