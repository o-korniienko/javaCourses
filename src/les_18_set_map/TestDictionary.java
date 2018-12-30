package les_18_set_map;

public class TestDictionary {
    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        d.addWord("cat","кіт");
        d.addWord("dog","собака");
        d.addWord("street","вулиця");
        d.addWord("home","дім");
        d.addWord("car","автомобіль");
        d.translate("cat");
        d.translate("home");
        d.translate("dog");
    }
}
