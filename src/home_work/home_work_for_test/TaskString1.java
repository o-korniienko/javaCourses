package home_work.home_work_for_test;


public class TaskString1 {
    public static void main(String[] args) {
        String input = "3F987s0a9d8s";
        char[] a = input.toCharArray();
        char r;
        for (int i = 0; i < a.length / 2; i++) {
            r = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = r;
        }
        String output = String.copyValueOf(a);
        System.out.println(output);
    }
}
