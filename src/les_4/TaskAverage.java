package les_4;

/**
 * Created by user on 29.11.18.
 */
public class TaskAverage {
    public static void main(String[] args) {

        int[] a= {23,45,34,65,45,65,45,65};
        int sum=0;
        int averaga;
        for (int i = 0; i < a.length; i++) {

            sum+=a[i];
        }
        averaga=sum/a.length;
        System.out.println("averaga = " + averaga);

    }
}
