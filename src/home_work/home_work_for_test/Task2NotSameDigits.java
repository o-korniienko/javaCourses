package home_work.home_work_for_test;

import java.util.Scanner;

public class Task2NotSameDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number 1;");
        int n1 = sc.nextInt();
        String s1;
        char[] c1 = new char[3];
        System.out.println("Input number 2;");
        int n2 = sc.nextInt();
        String s2;
        char[] c2 = new char[3];
        System.out.println("Input number 3;");
        int n3 = sc.nextInt();
        String s3;
        char[] c3 = new char[3];
        System.out.println("Input number 4;");
        int n4 = sc.nextInt();
        String s4;
        char[] c4 = new char[3];
        System.out.println("Input number 5;");
        int n5 = sc.nextInt();
        String s5;
        char[] c5 = new char[3];
        boolean f1 = true;
        boolean f2 = true;
        boolean f3 = true;
        boolean f4 = true;
        boolean f5 = true;
        if (n1 > 99 && n1 < 1000) {
            s1 = Integer.toString(n1);
            c1 = s1.toCharArray();
        }
        if (n2 > 99 && n2 < 1000) {
            s2 = Integer.toString(n2);
            c2 = s2.toCharArray();

        }
        if (n3 > 99 && n3 < 1000) {
            s3 = Integer.toString(n3);
            c3 = s3.toCharArray();

        }
        if (n4 > 99 && n4 < 1000) {
            s4 = Integer.toString(n4);
            c4 = s4.toCharArray();

        }
        if (n5 > 99 && n5 < 1000) {
            s5 = Integer.toString(n5);
            c5 = s5.toCharArray();
        }
        for (int j = 0; j < c1.length; j++) {
            for (int k = j + 1; k < c1.length; k++) {
                if (c1[j] == c1[k]) {
                    f1 = false;
                    break;
                }
            }
        }
        for (int j = 0; j < c2.length; j++) {
            for (int k = j + 1; k < c2.length; k++) {
                if (c2[j] == c2[k]) {
                    f2 = false;
                    break;
                }
            }
        }
        for (int j = 0; j < c3.length; j++) {
            for (int k = j + 1; k < c3.length; k++) {
                if (c3[j] == c3[k]) {
                    f3 = false;
                    break;
                }
            }
        }
        for (int j = 0; j < c4.length; j++) {
            for (int k = j + 1; k < c4.length; k++) {
                if (c4[j] == c4[k]) {
                    f4 = false;
                    break;
                }
            }
        }
        for (int j = 0; j < c5.length; j++) {
            for (int k = j + 1; k < c5.length; k++) {
                if (c5[j] == c5[k]) {
                    f5 = false;
                    break;
                }
            }
        }
        String s01 = new String(c1);
        String s02 = new String(c2);
        String s03 = new String(c3);
        String s04 = new String(c4);
        String s05 = new String(c5);
        if (f1 == true) System.out.print(s01 + "; ");
        if (f2 == true) System.out.print(s02 + "; ");
        if (f3 == true) System.out.print(s03 + "; ");
        if (f4 == true) System.out.print(s04 + "; ");
        if (f5 == true) System.out.print(s05 + "; ");
    }
}

