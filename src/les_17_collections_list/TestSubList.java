package les_17_collections_list;

import java.util.ArrayList;
import java.util.List;

public class TestSubList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);


        List<Integer> subList = list.subList(3, 6); //подсписок
        System.out.println(subList);
        subList.set(1, 23);
        System.out.println(subList);
        System.out.println(list);

        //for what?? for that:

        //print 3...6
        for (Integer a : list.subList(3, 6)) {
            System.out.print(a + " ");
        }
        System.out.println();

        //clear 3...6,
        list.subList(3, 6).clear();
        System.out.println("list: " + list);
    }
}
