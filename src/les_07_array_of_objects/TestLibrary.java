package les_07_array_of_objects;

public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library(3);
        library.addBook(new Book("Java. Полное руководство", "Герберт Шилдт", 2018));
        library.addBook(new Book("Код да Винчи", "Дэн Браун", 2014));
        library.addBook(new Book("Фантастические твари и где они обитают", "Роулинг", 2017));
        library.delBookByYear(2017);
        library.addBook(new Book("Последнее королевство. Бледный всадник", "Бернард Корнуэлл", 2016));
        library.addBook(new Book("Великий енциклопедичний ілюстрований словник", "Степура Анатолий Владимирович", 2014));
        library.printAll();
    }
}
