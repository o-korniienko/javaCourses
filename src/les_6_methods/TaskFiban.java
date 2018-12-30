package les_6_methods;

public class TaskFiban {

    public static void main(String[] args) {

        System.out.println(fibN(9));
    }

    public static int fibN(int n) {
        int a = 1;
        int b = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
}
