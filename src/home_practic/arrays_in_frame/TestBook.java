package home_practic.arrays_in_frame;


public class TestBook {
    public static void main(String[] args) {
        BookFrame frame = new BookFrame();

        LIbrary lIbrary = new LIbrary(5);
        lIbrary.addBook(new Book("Хакинг: искусство эксплойта","Джон Эриксон",2018));
        lIbrary.addBook(new Book("Java. Полное руководство","Герберт Шилдт",2018));
        lIbrary.addBook(new Book("Комп'ютерна графіка","Пічугін М.Ф",2018));
        lIbrary.addBook(new Book("Sapiens. Краткая история человечества","Юваль Ной Харари",2017));
        lIbrary.addBook(new Book("От хорошего к великому","Джим Коллинз",2018));

        frame.setLibrary(lIbrary.toString());

    }

}
