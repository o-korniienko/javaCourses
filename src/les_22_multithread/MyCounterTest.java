package les_22_multithread;

public class MyCounterTest {
    public static void main(String[] args) throws InterruptedException {
        MyCounter counter = new MyCounter();

        for (int i = 0; i < 400; i++) {
            new MyCounterThread(counter).start();
        }

        Thread.sleep(10000);
        System.out.println(counter.getValue());
    }
}
