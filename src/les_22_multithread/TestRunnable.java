package les_22_multithread;

public class TestRunnable {
    public static void main(String[] args) {
        Runnable task1 = new Task1();
        Runnable task2 = new Task2();
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        /*Thread t1 = new Thread(new Task1());
        Thread t2 = new Thread(new Task2());*/

        t1.start();
        t2.start();
    }
}
