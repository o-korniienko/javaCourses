package les_19_equals_hashcode;

import java.util.ArrayList;
import java.util.List;

public class TaskNumber {
    public static void main(String[] args) {
        List<Number> list1 = new ArrayList<>();
        List<Number> list2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list1.add(new Number((int) (Math.random()*20)));
            list2.add(new Number((int) (Math.random()*20)));
        }
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        list1.retainAll(list2);

        System.out.println("list1 = " + list1);

    }
}
