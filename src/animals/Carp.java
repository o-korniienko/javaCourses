package animals;

public class Carp extends Fish {
    protected double length;

    public Carp(String name, boolean freshwater, double length) {
        super(name, freshwater);
        this.length = length;
    }

    @Override
    public void say() {
        System.out.println(name + ": cwwcwcwcwcwcwc");
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Carp{" +
                "length=" + length +
                ", freshwater=" + freshwater +
                ", name='" + name + '\'' +
                '}';
    }
}
