package les_14_interfaces1;

import java.util.Arrays;

public class TestMovieArray {
    public static void main(String[] args) {
        Movie[] movies = new Movie[4];
        movies[0] = new Movie("Terminator","Cameron",1984);
        movies[2] = new Movie("Avatar","Cameron",2009);
        movies[1] = new Movie("Matrix","Vachovsky",1999);
        movies[3] = new Movie("Seuls two","Quentin Dupeux",2008);

        Arrays.sort(movies);
        for (Movie m : movies) {
            System.out.println(m);
        }

    }
}
