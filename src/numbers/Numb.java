package numbers;

public class Numb implements Addable<Numb>, Multipliable<Numb> {
    private double value;

    public Numb(double value) {
        this.value = value;
    }

    @Override
    public Numb plus(Numb that) {
        return new Numb(this.value + that.value);
    }

    @Override
    public Numb minus(Numb that) {
        return new Numb(this.value - that.value);
    }

    @Override
    public Numb multiply(Numb that) {
        return new Numb(this.value*that.value);
    }

    @Override
    public Numb divide(Numb that) {
        return new Numb(this.value/that.value);
    }

    @Override
    public String toString() {
        return value + "";
    }
}
