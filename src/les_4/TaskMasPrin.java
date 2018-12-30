package les_4;

import java.util.Arrays;

/**
 * Created by user on 29.11.18.
 */
public class TaskMasPrin {
    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 1, 2, 8};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                System.out.println("a = " + a[i]);
        }
        System.out.println("-------");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0)
                System.out.println("a = " + a[i]);
        }
    }
}
