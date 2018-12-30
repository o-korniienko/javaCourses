package les_5;

import java.util.Arrays;

/* Created by user on 30.11.2018. */
public class PascalTriangle {
    public static void main(String[] args) {
        int n = 12;
        int[][] a = new int[n][];
        //1.Виділяємо пам.ятью
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i + 1];
            // заповняємо масів

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j == 0 || j == a[i].length - 1) a[i][j] = 1; //заповняємо боковушки
                else a[i][j] = a[i - 1][j - 1] + a[i - 1][j];

            }
        }
        //3 печатаєм масив
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
