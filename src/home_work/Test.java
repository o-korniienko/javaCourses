package home_work;
import static java.lang.System.out;
public class Test {
    public static void main(String[] args) {
        for (int n = 0; ; n++) {
            int a = 1;
            System.out.print(a);
            for (int k = 1; k <= n ; k++) {

                a *= (n - k + 1);
                a /= k;
                System.out.print(" ");
                System.out.print(a);
            }
            System.out.println();
        }

    }
}
