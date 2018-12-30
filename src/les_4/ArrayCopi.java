package les_4;


import java.util.Arrays;

/**
 * Created by user on 28.11.18.
 */
public class ArrayCopi {
    public static void main(String[] args) {

        int[] mas={3,5,7,11,13,17,19,23,29,31};
        int [] b= new int[10];
        for (int i = 0; i < mas.length; i++) {
            b[i]=mas[i];
            System.out.print(b[i]);
        }
        System.out.println();
        System.out.print("mas = " + Arrays.toString(mas));
    }

}
