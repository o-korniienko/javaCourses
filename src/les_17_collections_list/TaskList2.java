package les_17_collections_list;

import java.util.ArrayList;

public class TaskList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random()*100));
        }
        System.out.println(list);
        list.sort(null);
        System.out.println(list);
    }
}
