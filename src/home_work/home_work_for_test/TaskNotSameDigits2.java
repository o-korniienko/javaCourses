package home_work.home_work_for_test;

import java.util.Scanner;

public class TaskNotSameDigits2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number 1:");
        int n1 = sc.nextInt();
        String s1 = more(n1);
        System.out.println("Input number 2:");
        int n2 = sc.nextInt();
        String s2 = more(n2);
        System.out.println("Input number 3:");
        int n3 = sc.nextInt();
        String s3 = more(n3);
        System.out.println("Input number 4:");
        int n4 = sc.nextInt();
        String s4 = more(n4);
        System.out.println("Input number 5:");
        int n5 = sc.nextInt();
        String s5 = more(n5);
        print(s1);
        print(s2);
        print(s3);
        print(s4);
        print(s5);
    }

    static String more(int n) {
        String result = "   ";
        if (n > 99 && n < 1000) result = Integer.toString(n);
        return result;
    }

    static void print(String s) {
        boolean tf = true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    tf = false;
                    break;
                }
            }
        }
        if (tf == true) System.out.println(s + "; ");
    }
}
