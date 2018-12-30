package les_7_classes;

public class Car {

    private String name;
    private double weight;
    private int year;
    private double velosity = 0;

    public Car(){

    }

    public Car(String name, int year){
        this.name = name;
        this.year = year;
        this.velosity = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYear(int y) {
        year = y;
    }

    public int getYear() {
        return year;
    }

    public void beep() {
        System.out.println("BEEP-BEEP!!!");
    }

    public void acceleration(double a) {
        velosity = velosity + a;
    }

    public void deceleration(double b) {
        if (velosity - b > 0) velosity = velosity - b;
    }

    public void print() {
        System.out.println("name = " + name);
        System.out.println("weught = " + weight);
        System.out.println("Year car = " + year);
        System.out.println("velosity = " + velosity);
    }
}

