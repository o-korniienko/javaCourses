package les_6_methods;


/**
 * Created by vshu on 003 03.12.18.
 */
public class TaskFib {
    public static void main(String[] args) {
        int n = 9;
        int a = 1;
        int b = 0;
        int sum;

        for (int i = 0; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println("b" + i + " = " + b);
        }
    }
}
