package function_evolution;

import java.util.function.Function;

public class TestBuildGraph {
    public static void main(String[] args) {
        Graph graph = new Graph(-5, 5);
        Formula f1 = new Formula();
        Formula f2 = new Formula1();

        // by class:
        Formula f3 = new Formula() {
            @Override
            int calculate(int x) {
                return Math.abs(x);
            }
        };

        // by interface:
        MyFunction func1 = new MyFunction() {
            @Override
            public int calculate(int x) {
                return x*x*x*x;
            }
        };

        // by lambda function:
        MyFunction func2 = x -> (int) Math.exp(x);
        Function<Integer,Integer> function = x -> x*x+100;
        graph.build(f1);
        graph.build(f2);
        graph.build(f3);
        graph.build(func1);
        graph.build(func2);
        graph.build(function);

    }
}
