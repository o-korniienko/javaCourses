package les_22_multithread;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        System.out.println(t1.getState()); // status NEW
        t1.start();
        System.out.println(t1.getState()); // status RUNNABLE
        t2.start();

        Thread.sleep(8000);
        System.out.println(t1.getState()); // status TIMED WAITING


        Thread.sleep(10000);
        System.out.println(t1.getState()); // status TERMINATED


    }
}
