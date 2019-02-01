package function_evolution;

import java.util.function.Function;

public class Graph {
    private int x1;
    private int x2;


    public Graph(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public void build(Formula f) {
        for (int x = x1; x <= x2; x++) {
            System.out.print(f.calculate(x) + " ");
        }
        System.out.println();
    }
    public void build(MyFunction f){
        for (int x = x1; x <= x2; x++) {
            System.out.print(f.calculate(x) + " ");
        }
        System.out.println();
    }
    public void build(Function<Integer,Integer> f){
        for (int x = x1; x <= x2; x++) {
            System.out.print(f.apply(x) + " ");
        }
        System.out.println();
    }


}
