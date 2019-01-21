package les_22_multithread;

public class MyCounterThread extends Thread {
    private MyCounter c;

    public MyCounterThread(MyCounter c) {
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.valuePlus();
        }
    }
}
