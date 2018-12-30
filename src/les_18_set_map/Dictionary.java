package les_18_set_map;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String,String>map;

    public Dictionary() {
        this.map = new HashMap<>();
    }
    public void addWord(String eng,String ukr){
        map.put(eng,ukr);
    }
    public  void translate(String word){
        System.out.println(map.get(word));

    }
}
