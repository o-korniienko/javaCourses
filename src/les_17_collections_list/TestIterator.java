package les_17_collections_list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //System.out.println(it.next());//error! need new iterator!

        it = list.iterator();
        while (it.hasNext()) {
            if (it.next()==3)it.remove();
        }
        System.out.println(list);
    }
}
