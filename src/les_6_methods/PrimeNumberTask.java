package les_6_methods;

/**
 * Created by vshu on 003 03.12.18.
 */
public class PrimeNumberTask {
    public static void main(String[] args) {
        System.out.println(isPrime(101));

    }

    static boolean isPrime(int n) {
        int k = 0;
        int k1 = (int) Math.sqrt(n);
        if (n % 2 == 0) return false;
        for (int i = 3; i <= k1; i += 2) { //3,5,7,9,11,..;
            k++;
            if (n % i == 0)
                return false;
        }
        System.out.println("k = " + k);
        return true;
    }
}
