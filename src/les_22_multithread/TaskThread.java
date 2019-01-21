package les_22_multithread;

public class TaskThread {
    public static void main(String[] args) {
        CircleThread circle = new CircleThread();
        SquareThread square = new SquareThread();

        circle.start();
        square.start();
    }
}
