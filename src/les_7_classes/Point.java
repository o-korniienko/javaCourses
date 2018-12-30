package les_7_classes;

public class Point {
    private double x;
    private double y;

    static double distance(Point point1, Point point2) {  //static method - викликається з класа
        double dist;
        double x = point1.getX() - point2.getX();
        double y = point1.getY() - point2.getY();
        dist = Math.sqrt(x * x + y * y);
        return dist;
    }



    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distanceTo(Point other){  //NON-static method - викликається лише з елемента
        double x = this.x - other.x;
        double y = this.y - other.y;
        return Math.sqrt(x * x + y * y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
