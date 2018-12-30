package les_16_exception;

public class TestEx3 {
    public static void main(String[] args) {
        try {
            method();
        } catch (ArithmeticException e) {
            System.out.println("Перехват сгенерованного винятку");
        } finally {
            System.out.println("finally");
        }
        System.out.println("Кінець програми");
    }
    private static void method() throws ArithmeticException {
        for (int i = 0; i < 10; i++) {
            if (i == 5) throw new ArithmeticException();
        }
    }

}
