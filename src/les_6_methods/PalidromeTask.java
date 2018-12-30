package les_6_methods;

/**
 * Created by vshu on 003 03.12.18.
 */
public class PalidromeTask {
    public static void main(String[] args) {
        System.out.println(ispalidrom(121));

    }
    static boolean ispalidrom(int n){
        String s = Integer.toString(n);
        boolean result = true;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
