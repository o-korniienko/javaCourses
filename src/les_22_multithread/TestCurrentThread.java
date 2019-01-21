package les_22_multithread;

public class TestCurrentThread {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println(main.getName());
        System.out.println(main.getState());
        System.out.println(main.getPriority());

    }
}
