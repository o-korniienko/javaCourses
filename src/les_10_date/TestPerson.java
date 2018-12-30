package les_10_date;

import java.util.Date;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("john",new Date(653883223423L));

        System.out.println(person.getDate());

        Date tmp = person.getDate();
        tmp.setTime(1544448819798L);
        System.out.println(person.getDate());
    }
}
