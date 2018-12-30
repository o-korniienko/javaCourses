package les_7_classes;

public class TestFibo {
    public static void main(String[] args) {
        Fibo fibo = new Fibo();

        System.out.println(fibo.next());
        System.out.println(fibo.next());
        System.out.println(fibo.next());
        System.out.println(fibo.next());
        System.out.println(fibo.next());
        System.out.println(fibo.next());
        System.out.println(fibo.next());
        fibo.reset();
        System.out.println(fibo.next());
        System.out.println(fibo.next());
        System.out.println(fibo.next());
        System.out.println(fibo.next());
        System.out.println(fibo.next());
        System.out.println(fibo.next());
        System.out.println(fibo.next());
    }
}
