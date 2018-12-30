package les_4;


import java.util.Arrays;

/**
 * Created by user on 28.11.18.
 */
public class Arrays2 {
    public static void main(String[] args) {

        //1
        int[] a = new int[5];
        //2
        int[] b = {1, 2, 3, 4, 5};
        //3
        int[] c;
        c = new int[]{1, 2, 3, 4, 5};


        // last element
        System.out.println(b[b.length - 1]);

        // last element
        System.out.println(b[1]);

        //print array
        System.out.print("b:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");

        }
        System.out.println();
        // write: 10,20,30,40,50 to array c

        for (int i = 0; i < c.length; i++) {
            c[i]= (i+1)*10;
        }
        System.out.println(Arrays.toString(c));

    }
}
