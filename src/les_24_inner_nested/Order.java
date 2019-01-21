package les_24_inner_nested;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Order {
    private List<Entry> list;

    public Order() {
        this.list = new ArrayList<>();

    }

    public void add(String name, int price, int amount) {
        list.add(new Entry(new Item(name, price), amount));
    }

    int totalSum() {
        int sum = 0;
        for (Entry e : list) {
            sum += e.amount * e.item.getPrice();
        }
        return sum;
    }
    public void printAll(){
        for (Entry e : list) {
            System.out.println(e);
        }
    }

    class Entry {
        private Item item;
        private int amount;

        public Entry(Item item, int amount) {
            this.item = item;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "{item: " + item + " amount= " + amount+"}";
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Order.class.getSimpleName() + "[", "]")
                .add("" + list)
                .toString();
    }
}
