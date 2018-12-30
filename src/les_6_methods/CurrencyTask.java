package les_6_methods;

/**
 * Created by vshu on 003 03.12.18.
 */
public class CurrencyTask {
    public static void main(String[] args) {
        System.out.println(convert(100,"usd","uah"));
        System.out.println(convert(2800,"uah","usd"));

    }

    static double convert(double money, String from, String to) {
        double result = 0;
        if (from.equalsIgnoreCase("usd") && to.equalsIgnoreCase("uah")) result = money * 27;
        if (from.equalsIgnoreCase("uah") && to.equalsIgnoreCase("usd")) result = money / 28;
        return result;
    }
}
