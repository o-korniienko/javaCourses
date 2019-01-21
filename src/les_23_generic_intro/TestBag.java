package les_23_generic_intro;

public class TestBag {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();
        bag.setValue("hello");

        // no casting
        String s = bag.getValue();

        // error signal at compile time
        //bag.setValue(123);
    }
}
