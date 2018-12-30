package les_;

public class TestTryCatch2 {
    public static void main(String[] args) {

        int t = (int) System.currentTimeMillis() % 2;

        int[] a = {1};

        try {
            int b = a[t]/t;
        } catch (ArithmeticException e) {
            System.out.println("div by 0");
        } catch (IndexOutOfBoundsException e){
            System.out.print("index out ! ");
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("other error");
        }


    }
}
