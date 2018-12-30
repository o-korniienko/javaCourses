package les_08_stringbuffer;

public class TaskStringBufferDelAllDots {
    public static void main(String[] args) {
        System.out.println(delDots1("..Today ..is... fine... day..."));
        System.out.println(delDots("..Today ..is... fine... day..."));
    }

    static String delDots1(String s) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length()-1; i++) {
            if (sb.charAt(i) == '.') {
                sb.deleteCharAt(i);
                i--;
            }

        }

        return sb.toString();
    }

    static String delDots(String s) {
        StringBuffer sb = new StringBuffer(s);

        while (sb.indexOf(".") >= 0 && sb.indexOf(".") != sb.length() - 1) sb.deleteCharAt(sb.indexOf("."));

        return sb.toString();
    }
}
