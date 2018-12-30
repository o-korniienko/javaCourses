package les_18_set_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringJoiner;

public class Loto {
    private ArrayList<Integer>list;

    public Loto(int count) {
        this.list = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        shuffleList();
    }
    private void shuffleList(){
        for (int i = 0; i < list.size(); i++) {
            int rnd = (int) (Math.random()*list.size());
            Integer tmpElement = list.get(i);
            list.set(i,list.get(rnd));
            list.set(rnd,tmpElement);
        }
        //Collections.shuffle(list);
    }

    public Integer getNextBall(){
        int rnd = (int) (Math.random() * list.size());
       return list.remove(rnd);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Loto.class.getSimpleName() + "[", "]")
                .add("list = " + list)
                .toString();
    }
}
