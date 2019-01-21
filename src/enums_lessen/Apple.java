package enums_lessen;

import java.util.StringJoiner;

public enum Apple {
    GOLDEN(20), RED(15), WINE(18);

    private int price;

    Apple(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Apple.class.getSimpleName() + "[","]")
                .add(this.name())
                .add("" + price)
                .toString();
    }
}
