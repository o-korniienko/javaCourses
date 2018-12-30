package les_16_exception;

import java.util.Scanner;

public class CorectInput {
    public static void main(String[] args) {
        System.out.println("input number:");
        double a;
        a = corectInput();
        System.out.println(a * a);
    }
    public static double corectInput() {
        Scanner scanner = new Scanner(System.in);
        boolean ok = false;
        double a = 0;
        while (!ok) {
            try {
                a = Double.parseDouble(scanner.nextLine());
                ok = true;
            } catch (NumberFormatException e) {
                System.out.println("no number entered, try again");
            }
        }
        return a;
    }
}
