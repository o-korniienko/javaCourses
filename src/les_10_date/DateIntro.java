package les_10_date;

import java.util.Date;

public class DateIntro {
    public static void main(String[] args) {
        Date date = new Date(); //current date
        System.out.println(date);
        System.out.println(date.getTime());

        date.setTime(Long.MAX_VALUE);   ///!!!!!!!!!
        System.out.println(date);

    }
}
