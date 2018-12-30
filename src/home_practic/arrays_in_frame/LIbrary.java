package home_practic.arrays_in_frame;

import java.util.Arrays;

public class LIbrary {
    public Book[] books;
    private int index;

    public LIbrary(int size) {
        this.books = new Book[size];
        this.index = -1;

    }

    public Book[] getBooks() {
        return books;
    }

    public void addBook(Book book) {
        if (index >= books.length - 1) {
            System.out.println("not place for this book: " + book);
            return;
        }
        books[++index] = book;
    }

    public void delBookByName(String name) {
        int ind = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(name)) ind = i;
        }
        if (ind < 0) {
            System.out.println("There is not this book " + name);
            return;
        }
        books[ind] = books[index];
        books[index] = null;
        index--;
    }

    public void delBookByYear(int year) {
        int ind = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYear() == year) ind = i;
        }
        if (ind < 0) {
            System.out.println("There is not books with this year:" + year);
            return;
        }
        books[ind] = books[index];
        books[index] = null;
        index--;
    }

    public void delBookByAutor(String autor) {
        int ind = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAutor().equals(autor)) ind = i;
        }
        if (ind < 0) {
            System.out.println("There are not books with this autor: " + autor);
        }
        books[ind] = books[index];
        books[index] = null;
        index--;
    }

    public void printAll() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    @Override
    public String toString() {
        return "Books: " + "\n" + Arrays.toString(books);
    }
}
