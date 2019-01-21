package les_23_generic_intro;

public class TestBox {
    public static void main(String[] args) {

        Box box = new Box();
        box.setValue("hello");

        // :( casting everywhere
        String value = (String) box.getValue();

        //no error signal at compilation time;
        box.setValue(123);
        String value2 = (String) box.getValue();
    }
}
