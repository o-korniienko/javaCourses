package animals;

public class Shark  extends Fish {
    protected double theescount;

    public Shark(String name, boolean freshwater, double theescount) {
        super(name, freshwater);
        this.theescount = theescount;
    }

    @Override
    public void eat() {
        super.eat();
    }


    @Override
    public void swim() {
        super.swim();
    }
    @Override
    public void say() {
        System.out.println(name+": cwwocowocwocow");
    }

    @Override
    public String toString() {
        return "Shark{" +
                "theescount=" + theescount +
                ", freshwater=" + freshwater +
                ", name='" + name + '\'' +
                '}';
    }
}
