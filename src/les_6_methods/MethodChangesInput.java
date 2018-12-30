package les_6_methods;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by vshu on 003 03.12.18.
 */
public class MethodChangesInput {
    public static void main(String[] args) {
        int []original = {100,2,30,15,6,4};
        sort(original);
        System.out.println("original = " + Arrays.toString(original));

    }
    static void sort(int[]a){

        Arrays.sort(a);
    }

}
