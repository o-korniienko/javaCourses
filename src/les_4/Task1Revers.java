package les_4;

import java.util.Arrays;

/**
 * Created by user on 28.11.18.
 */
public class Task1Revers {
    public static void main(String[] args) {
        //         0    1   2   3   4
        int[] a = {10, 20, 30, 40, 50};
        int tmp;
        for (int i = 0; i < a.length/2; i++) {

         tmp = a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]= tmp;


        }

        System.out.println(Arrays.toString(a));
    }
}
