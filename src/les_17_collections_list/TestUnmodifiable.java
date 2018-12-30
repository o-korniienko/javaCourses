package les_17_collections_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestUnmodifiable {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        //List<Integer> unModList = Collections.unmodifiableList(list);
        //unModList.add(3);//cannot!!!
        //list.set(0,23); //впливає на unModList
        //System.out.println("unModList: " + unModList);

        //одною строкою
        List<Integer> unModList1 = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(1, 2, 3)));
    }
}
