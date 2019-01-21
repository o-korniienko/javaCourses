package enums_lessen;

import java.util.Arrays;
import java.util.Comparator;

public class TestApple {
    public static void main(String[] args) {
        Apple apple = Apple.GOLDEN;
        System.out.println(apple);
        Apple[] apples = Apple.values();
        System.out.println(Arrays.toString(apples));

        Comparator<Apple> byPrice=new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                return a1.getPrice()-a2.getPrice();
            }
        };

        Arrays.sort(apples,byPrice);
        System.out.println(Arrays.toString(apples));
    }
}
