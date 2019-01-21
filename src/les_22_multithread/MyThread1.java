package les_22_multithread;

public class MyThread1 extends Thread {
    //run обовязковий!!!
    //метод run викликається методом start!!!
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
