package les_4;

import java.util.Arrays;

/**
 * Created by user on 29.11.18.
 */
public class TaskAlfavit {
    public static void main(String[] args) {
        char[] a = new char[26];
        int start = 65;
        for (int i = start; i < start + 26; i++) {
            a[i-start] = (char) i;
        }
       /* for (int i = 0; i <  26; i++) {
            a[i] = (char) (i+start);
        }

        for (char i = 'A'; i < 'Z'; i++) {
            a[i-start] = i;
        }
       */
        System.out.println(Arrays.toString(a));
    }
}
