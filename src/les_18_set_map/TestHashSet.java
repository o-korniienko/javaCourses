package les_18_set_map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(333);
        set.add(333);//no!
        set.add(222);
        set.add(222);//no!
        set.add(222);//no!
        System.out.println(set);

        System.out.println(set.contains(333));
        set.remove(222);
        System.out.println(set);

        //task: get unique elements:
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 20));
        }
        System.out.println("list: " + list);

        Set<Integer> set2 = new LinkedHashSet<>(list);
        System.out.println("set2: " + set2);
    }
}
