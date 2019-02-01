package les_26_lambda;

public class TestSumIf {
    public static void main(String[] args) {
        double[] numbers = {-5, 5, 25, -43, 65, -12};
        System.out.println(sumNegative(numbers));
        System.out.println(sumPositive(numbers));

        Filter negative = x -> x < 0;  // lambda!!!
        Filter positive = (double x) -> {
            return x > 0;
        };

        System.out.println(sumIf(numbers, negative));
        System.out.println(sumIf(numbers, x -> x > 0));
    }

    static double sumIf(double[] numbers, Filter filtr) {
        double sum = 0;
        for (Double a : numbers) {
            if (filtr.test(a)) sum += a;
        }
        return sum;
    }

    static double sumNegative(double[] numbers) {
        double sum = 0;
        for (Double a : numbers) {
            if (a < 0) sum += a;
        }
        return sum;
    }

    static double sumPositive(double[] numbers) {
        double sum = 0;
        for (Double a : numbers) {
            if (a > 0) sum += a;
        }
        return sum;
    }

}
