package les_4;

import java.util.Arrays;

/**
 * Created by user on 28.11.18.
 */
public class SortArrayTest {
    public static void main(String[] args) {
        int[]a={44,3,1,100,5,99};
        Arrays.sort(a);
        System.out.println("a = " + Arrays.toString(a));

//fill array with 1
        int [] b = new int[5];
        Arrays.fill(b,1);
        System.out.println("b = " + Arrays.toString(b));
    }
}
