package Tasks;

import java.util.*;

public class TaskHashMapInvert {
    private static Object K;
    private static Object M;
    private static Object V;
    private static Object N;

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("jan", 31);
        map.put("feb", 28);
        map.put("mar", 31);
        map.put("apr", 30);
        map.put("may", 31);
        map.put("jun", 30);
        map.put("jul", 31);
        map.put("aug", 31);
        map.put("sep", 30);
        map.put("okt", 31);
        map.put("nov", 30);
        map.put("dec", 31);

        System.out.println(map);
        System.out.println(mapInvert(map));
        System.out.println(map2Invert(map));
    }

    public static Map<Integer, ArrayList<String>> mapInvert(Map<String, Integer> map) {
        Map<Integer, ArrayList<String>> map1 = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer days = entry.getValue();
            if (!map1.containsKey(days)) {
                ArrayList<String> list = new ArrayList<>();
                list.add(entry.getKey());
                map1.put(days, list);
            } else {
                    map1.get(days).add(entry.getKey());
            }
        }
        return map1;
    }

    //generalized!!
    public static <I, S> Map<I, ArrayList<S>> map2Invert(Map<S, I> map) {
        Map<I, ArrayList<S>> map1 = new HashMap<>();
        for (Map.Entry<S, I> entry : map.entrySet()) {
            I value = entry.getValue();
            ArrayList<S> tmp;
            if (!map1.containsKey(value)) {
                tmp = new ArrayList<>();
                map1.put(value, tmp);
            } else {
                tmp = map1.get(value);
            }
            tmp.add(entry.getKey());
        }
        return map1;
    }

}
