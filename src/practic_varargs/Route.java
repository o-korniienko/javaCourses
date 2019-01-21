package practic_varargs;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Route {
    List<City> list;

    public Route(City... c) {
        this.list = Arrays.asList(c);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Route.class.getSimpleName() + "[", "]")
                .add("list=" + list)
                .toString();
    }
}
