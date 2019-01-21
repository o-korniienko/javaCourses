package les_24_inner_nested;

import java.util.StringJoiner;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return ("name= " + name + ", " + "price= " + price+",");
    }
}
