package a_singleton_pattern;

public class Test {
    public static void main(String[] args) {
        //Bank bank = new Bank();  //error!!!

        Bank bank = Bank.getInstance();
        bank.m();
        Bank.getInstance().m();
    }
}
