package home_work;

public class HomeWorkFactorial {
    public static void main(String[] args) {
        int n = 4;
        long f = 1;
        for (int i = 2; i <= n; i++) {
            f = f * i;
        }
        System.out.println(f);
    }
}
