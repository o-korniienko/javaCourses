package les_14_interfaces1;

import java.util.StringJoiner;

public class Movie implements Comparable {
    private String name;
    private String director;
    private int year;

    public Movie(String name, String director, int year) {
        this.name = name;
        this.director = director;
        this.year = year;
    }

    @Override
    public int compareTo(Object other) {
        Movie that = (Movie) other;
       return this.name.compareTo(that.name);
    }
    
    //    public int compareTo(Object other) {
//        Movie that = (Movie) other;
//        //return this.year - that.year;
//        if (this.year > that.year) return 1;
//        if (this.year < that.year) return -1;
//        return 0;
//    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Movie.class.getSimpleName() + "[", "]")
                .add("name = '" + name + "'")
                .add("director = '" + director + "'")
                .add("year = " + year)
                .toString();
    }
}
