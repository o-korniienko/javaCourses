package animals;

public class Duck extends Bird {
    protected boolean isdomestick;

    public Duck(String name, double wingsize, boolean isdomestick) {
        super(name, wingsize);
        this.isdomestick = isdomestick;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void say() {
        System.out.println(name +": кря-кря");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "isdomestick=" + isdomestick +
                ", wingsize=" + wingsize +
                ", name='" + name + '\'' +
                '}';
    }
}
