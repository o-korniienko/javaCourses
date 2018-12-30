package les_;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(10);
        list.add(20);
        list.add(20);

        System.out.println(list);

        list.set(0,999);                  //list[0] = 999
        System.out.println(list.get(0)); // sout(list[0])

        list.remove(new Integer(20));
        System.out.println(list);

        System.out.println(list.contains(12));//true

        System.out.println("20 is on "+ list.indexOf(20)+" place");







    }
}
