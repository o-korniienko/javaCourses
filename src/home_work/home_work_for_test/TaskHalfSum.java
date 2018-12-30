package home_work.home_work_for_test;

import java.util.Scanner;

public class TaskHalfSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number 1;");
        int n1 = sc.nextInt();
        System.out.println("Input number 2;");
        int n2 = sc.nextInt();
        System.out.println("Input number 3;");
        int n3 = sc.nextInt();
        System.out.println("Input number 4;");
        int n4 = sc.nextInt();
        System.out.println("Input number 5;");
        int n5 = sc.nextInt();
        System.out.println("Input number 6;");
        int n6 = sc.nextInt();
        System.out.println("Input number 7;");
        int n7 = sc.nextInt();
        int[] a = {n1, n2, n3, n4, n5, n6, n7};

        for (int i = 1; i < a.length -1; i++) {
            if (a[i] == (a[i - 1] + a[i + 1]) / 2) {
                System.out.print(a[i] + ";");
            }

        }

    }
}
