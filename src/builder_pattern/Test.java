package builder_pattern;

public class Test {
    public static void main(String[] args) {
        Person p = Person.builder().setB(6.8).setE('D').setD(true).build();
        Person p1 = Person.builder().setA("name").build();
        Person p2 = Person.builder().setD(true).build();
        Person p3 = Person.builder().setE('r').build();

        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
