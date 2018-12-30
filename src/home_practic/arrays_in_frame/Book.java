package home_practic.arrays_in_frame;

public class Book {
    private String name;
    private String autor;
    private int year;

    public Book(String name, String autor, int year) {
        this.name = name;
        this.autor = autor;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Name = " + name +
                ", autor = " + autor +
                ", year = " + year +
                '.'+"\n";
    }
}
