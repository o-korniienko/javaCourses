package les_17_collections_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        ArrayList<Integer> list1 = new ArrayList<>(list);
        System.out.println(list1);

        //list -> array

        // Integer[] array = list.toArray(new Integer[list.size()]);
        Integer[] array1 = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array1));

        //array -> list

        Integer[] myArray = {2, 3, 5, 7, 11, 13, 17};
        //present array as list:
        List<Integer> tmp = Arrays.asList(myArray); // лише обгортка!!!!!
        tmp.set(0,23);//впливає на List
        ArrayList<Integer> myList = new ArrayList<>(tmp);//копія!! те що потрібно
        System.out.println(myList);

        //ideal
       ArrayList<Integer> myList2 = new ArrayList<>(Arrays.asList(myArray));
    }
}
