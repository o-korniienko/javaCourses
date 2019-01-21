package varargs;

public class TestSumVar {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3,4,5,7,32));
    }

    static int sum(int a1, int a2) {
        return a1 + a2;
    }

    static int sum(int ... a){
        int s =0;
        for (int item : a) {
           s += item;
        }
        return s;
    }
}
