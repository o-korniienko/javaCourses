package les_23_generic_intro;

import java.util.ArrayList;

public class PairList<T, E> {
    private ArrayList<Pair<T, E>> list;

    public PairList() {
        this.list = new ArrayList<>();
    }

    /*public void add(Pair<T, E> pair) {
        list.add(pair);
    }*/

    public void add(T s, E i) {
        list.add(new Pair<>(s, i));
    }

    public void printAll() {
        for (Pair<T, E> p : list) {
            System.out.println(p.keym + " - " + p.value);
        }
    }
}
