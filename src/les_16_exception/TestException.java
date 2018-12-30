package les_16_exception;

public class TestException {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        try{
            System.out.println(a);
            System.out.println(a/b);
            System.out.println(b);
        }
        catch (ArithmeticException e){
            System.out.println("Ділення на нуль");
        }
        finally {
            System.out.println("Але програма всерівно працює");
        }
        System.out.println("Кінець програми");
    }
}
