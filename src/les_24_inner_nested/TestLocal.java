package les_24_inner_nested;

public class TestLocal {
    public static void main(String[] args) {
        System.out.println(distance(34, 23, 12, 67));

    }


    //local class = class inside method!!!
    static double distance(double x1, double y1, double x2, double y2) {

        class Point { //local class
            double x, y;

            public Point(double x, double y) {
                this.x = x;
                this.y = y;
            }
            void hello(){
                System.out.println("hello");
            }
        }

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        double x = p1.x - p2.x;
        double y = p1.y - p2.y;
        new Point(0,0).hello(); //we can call method
        return Math.sqrt(x*x+y*y);
    }
}
