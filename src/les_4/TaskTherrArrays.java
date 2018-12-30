package les_4;

import java.util.Arrays;

/**
 * Created by user on 29.11.18.
 */
public class TaskTherrArrays {
    public static void main(String[] args) {
        char[] input = {'A', 'W', '3', '@', '$', '?', '.', '2', '4', '5', 'S', 's', 'g', 'R', 'i', '^', '"', '}', '/', '8'};

        char[] digits = new char[input.length];
        int index1 = 0;
        for (int i = 0; i < input.length; i++) {

            if (Character.isDigit(input[i])) {
                digits[index1] = input[i];
                index1++;


            }
        }
        System.out.println("digits = " + Arrays.toString(digits));


        char[] Letter = new char[input.length];
        int index2 = 0;
        for (int i = 0; i < input.length; i++) {

            if (Character.isLetter(input[i])) {
                Letter[index2] = input[i];
                index2++;


            }
        }
        System.out.println("Letter = " + Arrays.toString(Letter));

        char[] other = new char[input.length];
        int index3 = 0;
        for (int i = 0; i < input.length; i++) {

            if (!Character.isDigit(input[i]) && !Character.isLetter(input[i])) {
                other[index3] = input[i];
                index3++;


            }
        }
        System.out.println("other = " + Arrays.toString(other));


    }
}
