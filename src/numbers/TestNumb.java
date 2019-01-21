package numbers;

public class TestNumb {
    public static void main(String[] args) {
        Numb n1 = new Numb(3);
        Numb n2 = new Numb(11);
        Numb m1 = new Numb(2);
        Numb m2 = new Numb(1.1);
        Numb n3 = n1.plus(n2).plus(n1).plus(m2).minus(m1);
        Numb m3 = m1.minus(m2);
        Numb e = n2.minus(n1).plus(m1.minus(m2));
        Numb m = n1.multiply(m2);
        Numb d = n2.divide(m1);
       /* System.out.println(n3);
        System.out.println(m3);
        System.out.println(e);
        System.out.println(m);
        System.out.println(d);*/
        System.out.println(sum(n1,n2,m1,m2,m3,n3,e,d));
        printAll(1,234324,234,123,123,213,"sdsad");
    }

    static Numb sum(Numb... array) {
        Numb s = new Numb(0);
        for (Numb n : array) {
            s = s.plus(n);
        }
        return s;
    }

    //generalized method:
    static <T> void printAll(T ... array){
        for (T t : array) {
            System.out.println(t);
        }
    }
}
