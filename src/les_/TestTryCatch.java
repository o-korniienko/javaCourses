package les_;

public class TestTryCatch {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        int c = 0;

        try {
            c = a / b;
        } catch (ArithmeticException e){
            System.out.println("div by zero!!!");
        }

        System.out.println(c);





    }
}
