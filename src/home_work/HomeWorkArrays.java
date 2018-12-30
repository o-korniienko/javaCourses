package home_work;

import java.util.Scanner;

public class HomeWorkArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows:");

        int n = sc.nextInt();

        int[][] a = new int[n][];

        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i + 1];
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j == 0 || j == a[i].length - 1)
                    a[i][j] = 1;
                else a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
