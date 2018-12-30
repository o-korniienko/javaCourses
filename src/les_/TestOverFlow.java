package les_;

public class TestOverFlow {
    public static void main(String[] args) {
        // int overflow:

        int n = Integer.MAX_VALUE;
        System.out.println("before n=" + n);
        //n = n + 4;
        n++;
        System.out.println("after n=" + n);


        //long overflow

        // double overflow
        double d = Double.MAX_VALUE;
        System.out.println("before d = " + d);
        d = d + 1E308;
        System.out.println("after d = " + d);
        //end

        System.out.println(Double.MIN_VALUE); // 4.9E-324



    }
}
