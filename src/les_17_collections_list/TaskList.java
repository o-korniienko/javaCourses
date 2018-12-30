package les_17_collections_list;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("https://www.google.com.ua/");
        strings.add("https://elementy.ru/");
        strings.add("http://santi.ua/");
        strings.add("https://rozetka.com.ua/");
        strings.add("https://top100.rambler.ru/");
        strings.add("https://www.i.ua/");
        strings.add("https://auto.ru/");
        strings.add("https://football.ua/");
//        System.out.println(strings);
//        System.out.println("------------------");
        printByUa(strings);
        delByRu(strings);
        System.out.println("------------------");
        System.out.println(strings);
    }

    static void printByUa(ArrayList<String> a) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).contains(".ua")) System.out.println(a.get(i));
        }
    }

    static void delByRu(ArrayList<String> a) {
        Iterator<String> it = a.iterator();
        while (it.hasNext()){
            if (it.next().contains(".ru"))
                it.remove();
        }
    }
}
