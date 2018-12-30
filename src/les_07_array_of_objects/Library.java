package les_07_array_of_objects;

public class Library {
    private Book[] books;
    private int index;

    public Library(int size) {
        this.books = new Book[size];
        this.index = -1;
    }

    public void addBook(Book book) {
        if (index >= books.length - 1) {
            System.out.println("Error, not place for " + book);
            return;
        }
        books[++index] = book;
    }

    public void delBookByYear(int year) {
        int ind = getIndex(year);
        if (ind < 0) {
            System.out.println("There is not  books with this year " + year);
            return;
        }
        books[ind] = books[index];
        books[index] = null;
        index--;
    }

    public int getIndex(int year) {
        for (int i = 0; i <= index; i++) {
            if (books[i].getYear() == year) return i;
        }
        return -1;
    }

    public void printAll() {
        System.out.println("Books:");
        for (int i = 0; i <= index; i++) {
            System.out.println(books[i]);
        }
    }
}
