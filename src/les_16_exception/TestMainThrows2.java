package les_16_exception;

public class TestMainThrows2 {
    public static void main(String[] args) throws MyException {
        int a;
        a = 2 + 2;
        methodOne(a);
    }

    private static void methodOne(int a) throws MyException {
        if (a == 4) {
            throw new MyException();
        }
    }
}
