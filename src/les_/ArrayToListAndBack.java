package les_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListAndBack {
    public static void main(String[] args) {

        //constructor of copy:
     /*   List <String> list = new ArrayList<>();
        list.add("hello");
        list.add("privet!");

        List copy = new ArrayList<>(list); //  constructor of copy!!!
        System.out.println("list = " + list);
        System.out.println("copy = " + copy);*/

        // array -> list-------------------------------------------------
        // not RIGHT way:

        Integer[] arr = {1,2,3,4};
        List<Integer> list1 = Arrays.asList(arr); // not new list!!!
        list1.set(0,999); // -> arr
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("list1 = " + list1);
        System.out.println();
        // RIGHT! really new LIST!!!

        List<Integer> list2 = new ArrayList<>(Arrays.asList(arr)); //Ok!
        list2.set(1,777);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("list2 = " + list2);

        System.out.println();
        System.out.println();

        //list -> array-----------------------------------------------------
        ArrayList<Integer> numbers
                = new ArrayList<>(Arrays.asList(5,8,7,9,5,6,8,9));

        Integer [] arrayNumbers = numbers.toArray(new Integer[0]);
        //Integer [] arrayNumbers = numbers.toArray(new Integer[numbers.size()]);
        //Integer [] arrayNumbers = numbers.toArray(new Integer[numbers.size()+10]);

        System.out.println("numbers = " + numbers);
        System.out.println("arrayNumbers = " + Arrays.toString(arrayNumbers));




























    }
}
