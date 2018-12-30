package les_08_stringbuffer;

public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb  = new StringBuffer("");
        long before = System.currentTimeMillis();
        for (int i = 0; i < 40000; i++) {
            sb.append("Hello!!!");
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
