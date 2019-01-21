package les_17_collections_list;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(15);
        list.add(0, 2323);
        list.add(232);
        list.add(3);
        list.add(23);
        list.add(23233434);
        list.add(15);
        System.out.println(list);

        list.remove(2); //by index
        System.out.println(list);
        list.remove((Integer) 15);//by value!!!
//        list.remove( Integer.valueOf(15));//by value!!!
//        list.remove(new Integer(15)); //by value!!!
        System.out.println(list);
        System.out.println(list.get(3));//a[3];
        list.set(0, 555);//a[o] = 555
        System.out.println(list);
        System.out.println(list.indexOf(15));
        System.out.println("size = " + list.size());
        //list.sort(Integer::compareTo);
        list.sort(null);
        System.out.println(list);
    }
}
