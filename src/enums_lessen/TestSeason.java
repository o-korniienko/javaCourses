package enums_lessen;

import java.util.Arrays;

public class TestSeason {
    public static void main(String[] args) {
        Season s1 = Season.WINTER;
        Season s2 = Season.SUMMER;

        // enum -> String;
        System.out.println(s1 + " or " + s2 + "?");

        // String -> enum;
        String s = "SPRING";
        Season s3 = Season.valueOf(s);

        //get array of all seasons;
        Season[] seasons = Season.values();
        System.out.println("all season: ");
        for (Season se : seasons) {
            System.out.println(se);
        }
        System.out.println(Arrays.toString(seasons));

        //index -> enum;
        int index = 2;
        System.out.println(Arrays.toString(Season.values()));
        System.out.println(Season.values()[index]);

        //enum -> index;
        Season leto = Season.SUMMER;
        System.out.println(leto.ordinal());

        //equales;
        System.out.println(leto.equals(s2));
        System.out.println(leto == s2);

        //sort;
        Season[] seasons1 = new Season[3];
        seasons1[0] = Season.AUTUMN;
        seasons1[1] = Season.SUMMER;
        seasons1[2] = Season.WINTER;
        Arrays.sort(seasons1);
        System.out.println(Arrays.toString(seasons1));
    }
}
