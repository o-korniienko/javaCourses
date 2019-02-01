package les_26_lambda;

import java.util.function.Predicate;

public class TestSumIfPredicate {
    public static void main(String[] args) {
        double[] numbers = {-5, 5, 25, -43, 65, -7, 4, 7, -99};

        System.out.println(sumIf(numbers, x -> x < 0));
    }

    static double sumIf(double[] numbers, Predicate<Double> p) {
        double sum = 0;
        for (Double a : numbers) {
            if (p.test(a)) sum += a;
        }
        return sum;
    }
}
