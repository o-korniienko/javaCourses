package les_22_multithread;

public class MyCounter {
    private long value;

    public synchronized void valuePlus(){
        value++;
    }

    public long getValue() {
        return value;
    }
}
