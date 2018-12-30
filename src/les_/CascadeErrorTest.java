package les_;

public class CascadeErrorTest {
    public static void main(String[] args) {
        m3();
    }

    public static void m3(){
        try {
            m2();
        } catch (Exception e) {
            System.out.print("error in ");
            System.out.println(e.getStackTrace()[0]);
        }
    }

    public static void m2(){
        m1();
    }

    public static void m1(){
        System.out.println(5/0);
    }
}
