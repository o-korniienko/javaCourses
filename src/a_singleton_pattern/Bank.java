package a_singleton_pattern;

public class Bank {
    private static Bank ourInstance;

    static {
        ourInstance = new Bank();
    }

    public static Bank getInstance() {
        return ourInstance;
    }

    private Bank() {
    }

    public void m(){
        System.out.println("hello word");
    }
}
