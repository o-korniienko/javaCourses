package animals;

public abstract class Fish extends Animal{
    protected boolean freshwater;

    public Fish(String name, boolean freshwater) {
        super(name);
        this.freshwater = freshwater;
    }

    public void swim(){
        System.out.println(name+ " is swiming");
    }
}
