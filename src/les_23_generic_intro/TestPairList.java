package les_23_generic_intro;

public class TestPairList {
    public static void main(String[] args) {

        PairList<String, Integer> list = new PairList<>();

        list.add("bread", 12);
        list.add("butter", 40);
        list.add("milk", 25);
        list.add("banana", 34);
        list.add("orange", 47);
        list.add("apple", 23);
        list.printAll();
    }
}
