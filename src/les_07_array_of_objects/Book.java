package les_07_array_of_objects;

public class Book {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name = '" + name + '\'' +
                ", author = '" + author + '\'' +
                ", year = " + year +
                '}';
    }
}
