package les_19_equals_hashcode;

public class Number {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Number number = (Number) o;

        return value == number.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
