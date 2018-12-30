package les_5;

/* Created by user on 30.11.2018. */
public class Zadacha {
    public static void main(String[] args) {
        int positSum = 0;
        int positMin = 0;
        int negatSum = 0;
        int[] a = {4, -2, -4, 6, -11, 3, 5, -7};
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) positSum += a[i];
            if (a[i] < 0) negatSum += a[i];

        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                positMin = a[i];
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {

            if (a[i] > 0 && a[i] < positMin) {
                positMin = a[i];
            }
        }
        System.out.println("positSum = " + positSum);
        System.out.println("negatSum = " + negatSum);
        System.out.println("positMin = " + positMin);
    }
}
