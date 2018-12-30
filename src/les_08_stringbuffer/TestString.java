package les_08_stringbuffer;

public class TestString {
    public static void main(String[] args) {
        String s = "";
        long before = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            s = s + "Hello!!";
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
