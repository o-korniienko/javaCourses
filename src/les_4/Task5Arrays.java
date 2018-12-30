package les_4;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.arraycopy;

/**
 * Created by user on 29.11.18.
 */
public class Task5Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mas = ");
        int mas[] = new int[10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(mas));
        Arrays.sort(mas);

        int[] b;
        b = Arrays.copyOfRange(mas, 0, mas.length / 2);
        Arrays.sort(b);
        System.out.println("b = " + Arrays.toString(b));
        int[] c;

        c = Arrays.copyOfRange(mas, mas.length / 2, mas.length);
        Arrays.sort(c);
        System.out.println("c = " + Arrays.toString(c));


    }


}
