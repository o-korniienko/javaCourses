package home_work.home_work_for_test;

public class TaskArraysIndex1 {
    public static void main(String[] args) {
        int[] a = {3, 12, 5, 34, 56, 12, 29, 34, 41};
        int ch = 5;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == a[0] && (Math.abs(a[0] - a[1]) > ch)) {
                System.out.print("0; ");
            } else if (a[i] == a[a.length - 1] && (Math.abs(a[a.length - 1] - a[a.length - 2]) > ch)){
                System.out.print(a.length - 1 + "; ");
            } else if (Math.abs(a[i] - a[i + 1]) > ch && Math.abs (a[i] - a[i -1]) > ch ) {
                System.out.print(i + "; ");
            }
        }
    }
}
