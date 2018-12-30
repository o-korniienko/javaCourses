package les_5;

/**
 * Created by user on 29.11.18.
 */
public class Arrays2d {
    public static void main(String[] args) {
      /*  int[][]a={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(a[1][1]);
*/
        int[][] b= new int[4][5];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j]=i+j;
                System.out.print(b[i][j]+ " ");
            }
           // b[i]=new int[i];
            System.out.println();
        }
    }
}
