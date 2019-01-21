package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskList1 {
    public static void main(String[] args) {
        String s = "Today is 3 of jan";
        String [] words = s.split(" ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
        System.out.println(list);

        List<String>list1 = new ArrayList<>();

        for (int i = list.size() - 1; i >=0 ; i--) {
            list1.add(list.get(i));
        }
        System.out.println(list1);
    }
}
