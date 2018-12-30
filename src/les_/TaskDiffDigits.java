package les_;

public class TaskDiffDigits {
    public static void main(String[] args) {

        int n = 87253; //true
        boolean diffDigits = true;

        String str = Integer.toString(n); //"87253"
        // String -> array
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length-1; i++) {
            for (int j = i+1; j < c.length; j++) {
                if(c[i]==c[j]) {
                    diffDigits=false; break;
                }
            }
        }
        System.out.println(diffDigits);



    }
}
