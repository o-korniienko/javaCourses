package les_6_methods;

/**
 * Created by vshu on 003 03.12.18.
 */
public class MethodTest {
    public static void main(String[] args) {
        int []a = {100,-2,30,-4,15,-6};
        int []b = {123,-45,3,-56,70,-1};

        System.out.println("sumNegative a = " + sumNegative(a));
        System.out.println("sumNegative b = " + sumNegative(b));
    }
    static int sumNegative(int[] a){
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0)result +=a[i];
        }
        return result;
    }
}
