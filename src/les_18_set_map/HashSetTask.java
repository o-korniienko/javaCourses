package les_18_set_map;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTask {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        while (set.size() < 10) {
            set.add((int) (Math.random() * 10));
           System.out.println(set);
        }
        Iterator<Integer> it = set.iterator();
        for (int i = 0; i < 3; i++) {
            System.out.println(it.next());
            System.out.println(it);
        }
        System.out.println(set);
    }
}
