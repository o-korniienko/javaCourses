package les_;

import java.util.Arrays;

public class PrintArray2D {
    public static void main(String[] args) {
        int [][] a = new int[5][8];

        //1:
        System.out.println(Arrays.deepToString(a));

        //2:
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
        //3:
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


    }
}
