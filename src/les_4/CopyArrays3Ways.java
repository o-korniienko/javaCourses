package les_4;

import java.util.Arrays;

/**
 * Created by user on 28.11.18.
 */
public class CopyArrays3Ways {
    public static void main(String[] args) {
        int[] original = {3, 5, 7, 9, 11};

        //1
        int[] copy1 = new int[original.length];
        System.arraycopy(original, 0, copy1, 0, original.length);
        System.out.println("copy1 = " + Arrays.toString(copy1));


        //2
        int[] copy2;
        copy2 = Arrays.copyOfRange(original, 0, original.length);
        System.out.println("copy2 = " + Arrays.toString(copy2));

        //3
        int[] copy3;
        copy3 = Arrays.copyOf(original, 20);
        System.out.println("copy3 = " + Arrays.toString(copy3));

        //test copy

        copy1[0] = 999;
        copy2[0] = 999;
        copy3[0] = 999;
        copy3[18] = 111;
        System.out.println("copy3 = " + Arrays.toString(copy3));
        System.out.println("original = " + Arrays.toString(original));

    }
}
