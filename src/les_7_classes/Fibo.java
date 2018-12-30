package les_7_classes;

public class Fibo {
    private int a1;
    private int a2;

    public Fibo() {
      setStart();
    }

    public int next() {
        int sum = a1 + a2;
        a1 = a2;
        a2 = sum;
        return sum;
    }

    public void reset() {
        setStart();
    }
    private void setStart(){
        this.a1 = 1;
        this.a2 = 0;
    }
}
