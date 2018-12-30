package les_;

import java.util.ArrayList;
import java.util.Arrays;

public class GoodExample {
    public static void main(String[] args) {

        String [] words = {"hello", "today", "cat", "mouse"};
        String[] oWords = getWordsWithLetter(words, "o");
        System.out.println(Arrays.toString(oWords));
    }
    static String[] getWordsWithLetter(String [] strings, String letter){

        ArrayList <String> tmp = new ArrayList<>();
        for (String element : strings) {
            if (element.contains(letter)) tmp.add(element);
        }
        /*String [] result = tmp.toArray(new String[0]);
        return result;*/
        return tmp.toArray(new String[0]);
    }
}
