package les_;

public class ScopeTest {
    public static void main(String[] args) {
        {
            int a;

            {
                int y;
                //int a; //error! already defined!
            }
            //y = 5; // error "cannot...
        }
        {
            int a; //ok
        }
        int a; //ok!


    }

}
