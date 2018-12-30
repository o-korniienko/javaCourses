package animals;

public class Eagle extends Bird{
    protected boolean iswild;

    public Eagle(String name, double wingsize, boolean iswild) {
        super(name, wingsize);
        this.iswild = iswild;
    }

    @Override
    public void say() {
        System.out.println(name + ": safsadsad");
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "iswild=" + iswild +
                ", wingsize=" + wingsize +
                ", name='" + name + '\'' +
                '}';
    }
}
