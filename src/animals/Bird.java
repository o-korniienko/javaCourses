package animals;

public abstract class Bird extends Animal {
    protected double wingsize;

    public Bird(String name, double wingsize) {
        super(name);
        this.wingsize = wingsize;
    }

    public  void fly(){
        System.out.println(name + " is flying");
    }
}
