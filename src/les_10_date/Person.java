package les_10_date;

import java.util.Date;
import java.util.StringJoiner;

public class Person {
    private String name;
    private Date date;

    public Person(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        //return date;  ///dangerous
        return new Date(date.getTime());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("date=" + date)
                .toString();
    }
}
