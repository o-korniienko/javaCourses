package Tasks;

import java.util.HashMap;
import java.util.Map;

public class TaskPrintMap {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Audi", 1990);
        map1.put("Ford", 1956);
        map1.put("BMW", 2000);
        map1.put("Porshe", 2019);
        map1.put("VAZ", 1987);
        map1.put("KIA", 2003);
        map1.put("Lada", 1995);

        Map<Integer, String> map2 = new HashMap<>();
        map2.put((int) 'A', "A");
        map2.put((int) 'B', "B");
        map2.put((int) 'C', "C");

        printMap(map1);
        System.out.println("------------");
        printMap(map2);
        System.out.println("------------");
        print(map1);
        System.out.println("------------");
        print2(map2);
    }

    static <T, E> void printMap(Map<T, E> m) {
        for (Map.Entry<T, E> entry : m.entrySet()) {
            System.out.println(entry);
        }
    }

    static void print(Map m) {
        for (Object entry : m.entrySet()) {
            System.out.println(entry);
        }
    }

    static void print2(Map<?, ?> m) {
        for (Map.Entry<?, ?> entry : m.entrySet()) {
            System.out.println(entry);
        }
    }
}
