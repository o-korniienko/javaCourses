package les_18_set_map;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("jan", 31);
        map.put("feb", 28);
        map.put("mar", 31);
        map.put("apr", 30);
        map.put("may", 31);

        System.out.println(map.get("feb"));
        System.out.println(map);

        //1. keys:
        System.out.println(map.keySet());

        //2.values:
        System.out.println(map.values());

        //key-values:
        System.out.println(map.entrySet());

        System.out.println(map.containsValue(28));//true

        System.out.println(map.containsKey("jun"));//false

        //print all months with 31 days:

      /*  Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> item : set) {
            if (item.getValue() == 31) System.out.println(item);
        }
        System.out.println("-----------------------");
        //print all months name contains "a"
        Set<Map.Entry<String, Integer>> set2 = map.entrySet();
        for (Map.Entry<String, Integer> item : set2) {
            if (item.getKey().contains("a")) System.out.println(item);
        }*/

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 31) System.out.println(entry);
        }
        System.out.println("-------------------------");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().contains("a")) System.out.println(entry);
        }
    }
}
