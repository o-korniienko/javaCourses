package inheritance_les_11;

public abstract class Point {
    protected String color;

    public Point(String color) {
        this.color = color;
    }

    public abstract void show();
}
