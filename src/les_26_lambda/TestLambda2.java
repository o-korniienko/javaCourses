package les_26_lambda;

public class TestLambda2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = doSomthWithStrings(s1, s2, (s, d) -> s + " " + d);
        String s4 = doSomthWithStrings(s1, s2, (s, d) -> (s + " " + d).toUpperCase());

        System.out.println(s3);
        System.out.println(s4);
    }

    static String doSomthWithStrings(String s1, String s2, Func2 f) {
        return f.apply(s1, s2);
    }
}
