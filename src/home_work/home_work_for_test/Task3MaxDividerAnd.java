package home_work.home_work_for_test;

import java.util.Scanner;

public class Task3MaxDividerAnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number 1;");
        int n1 = sc.nextInt();
        System.out.println("Input number 2;");
        int n2 = sc.nextInt();
        System.out.println("Input number 3;");
        int n3 = sc.nextInt();
        int minNumber = Integer.MAX_VALUE - 1;
        int maxDivider = 0;
        int maxNk = n1 * n2 * n3;
        int maxNumber = 0;
        int minKratne = n1 * n2 * n3;

        int[] a = {n1, n2, n3};
        int[] c = new int[maxNk];

        // Максимальний дільник
        for (int i = 0; i < a.length; i++) {
            if (a[i] < minNumber) minNumber = a[i];
        }
        int[] b = new int[minNumber + 1];
        for (int i = 1; i < b.length; i++) {
            if (n1 % i == 0 && n2 % i == 0 && n3 % i == 0) b[i] = i;
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] > maxDivider) maxDivider = b[i];
        }

        // Мінімальне кратне
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxNumber) maxNumber = a[i];
        }
        for (int i = maxNumber; i < c.length; i++) {
            if (i % n1 == 0 && i % n2 == 0 && i % n3 == 0) c[i] = i;
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] < minKratne && c[i] > 0) minKratne = c[i];
        }

        System.out.println("Максимальний загальний дільник:" + maxDivider);
        System.out.println("Мінімальне кратне:" + minKratne);
    }
}
