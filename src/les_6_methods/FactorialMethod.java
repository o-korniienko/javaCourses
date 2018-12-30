package les_6_methods;

/**
 * Created by vshu on 003 03.12.18.
 */
public class FactorialMethod {
    public static void main(String[] args) {
        int n = 7;

        System.out.println(factorial(n));
    }

    static long factorial(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
