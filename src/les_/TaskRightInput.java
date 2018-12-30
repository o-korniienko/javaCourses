package les_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskRightInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("a=");

        int a = 0;
        String s = "";
        boolean ok = false;

        while (!ok) {
            try {
                s = scanner.nextLine();
                a = Integer.parseInt(s);
                ok = true;
            } catch (NumberFormatException e) {
                System.out.println("try again!");
            }
        }


        System.out.println("a*a = " + a*a);


    }
}
