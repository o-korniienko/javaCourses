package les_16_exception;

public class TestMainThrows {
    public static void main(String[] args) {
        try {
            method();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    private static void method() throws MyException {
            throw new MyException();

    }
}
