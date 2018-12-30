package les_6_methods;

import java.util.Arrays;

/**
 * Created by vshu on 003 03.12.18.
 */
public class MethodDoesntChangeInput {
    public static void main(String[] args) {
        int[] original = {100, 2, 30, 4, 15, 6};
        int[] b = getSorted(original);
        System.out.println("original = " + Arrays.toString(original));
        System.out.println("b = " + Arrays.toString(b));

    }

    static int[] getSorted(int[] a) {
        int[] copy = Arrays.copyOfRange(a, 0, a.length);
        Arrays.sort(copy);
        return copy;
    }
}
