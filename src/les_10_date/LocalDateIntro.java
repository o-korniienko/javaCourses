package les_10_date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class LocalDateIntro {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2018, 12, 10);
        System.out.println(d.getDayOfMonth() + "." + d.getMonth().getValue() + "." + d.getYear());

        //after 3 years 2 month 1 day

        LocalDate d2 = d.plusYears(3).plusMonths(2).plusDays(19);
        System.out.println(d2.getDayOfMonth() + "." + d2.getMonth().getValue() + "." + d2.getYear());

        //різниця дат:
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2020, 1, 31);
        Period period = date1.until(date2);

        System.out.print(period.getYears() + "years" + " ");
        System.out.print(period.getMonths() + "monhts" + " ");
        System.out.println(period.getDays() + "days");

        //LocalTime

        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(18, 50);
        //time1 = time1.plusMinutes(9);
        long timeH = time1.until(time2, ChronoUnit.HOURS);
        long timeM = time1.plusHours(timeH).until(time2, ChronoUnit.MINUTES);
        System.out.println("left:" + timeH + " hours " + timeM + " minutes");
    }
}
