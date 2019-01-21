package les_22_multithread;

public class TestJoinMethod {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();


        t1.join(); // main буде чекати закінчення t1
        t2.join(); // main буде чекати закінчення t2

        System.out.println(t1.getState()); // status TERMINATED
        System.out.println(t2.getState()); // status TERMINATED

        System.out.println("end of main");
    }
}
