package les_4;

/**
 * Created by user on 29.11.18.
 */
public class TaskMax {
    public static void main(String[] args) {
        int[] a = {25, 34, 54, 56, 7, 23, 76, 8, 34};
        int indexMax = 0;
        int indexMin = 0;
        int max = a[indexMax];
        int min = a[indexMin];

        for (int i = 0; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
                indexMax = i;

            }
        }
        System.out.println("max= " + max);
        System.out.println("indexMax= " + indexMax);

        for (int i = 0; i < a.length; i++) {

            if (a[i] < min) {
                min = a[i];
                indexMin = i;
            }
        }
        System.out.println("min= " + min);
        System.out.println("indexMin= " + indexMin);

    }
}




