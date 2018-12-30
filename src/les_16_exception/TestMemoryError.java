package les_16_exception;

public class TestMemoryError {
    public static void main(String[] args) {
        String s = "ER";
        long b = s.length();
        for (int i = 0; i < 100; i++) {
            s += s;
            b += b;
            System.out.println(i + ", " + b + ", " + b / (1024*1024) + " MB");
        }
    }
}
