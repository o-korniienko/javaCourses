package practic_varargs;

public class TectRoute {
    public static void main(String[] args) {
        Route r = new Route(new City("Kyiv"), new City("Odessa"), new City("Zhytomyr"), new City("Lviv"));

        System.out.println(r);
    }
}
