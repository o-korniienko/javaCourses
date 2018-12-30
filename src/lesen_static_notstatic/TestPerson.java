package lesen_static_notstatic;

public class TestPerson {
    public static void main(String[] args) {
        System.out.println(Person.getStartId());
        Person person = new Person("Tom");
        System.out.println(Person.getStartId());

        Person person1 = new Person("Jack");
        System.out.println(Person.getStartId());
//        Person.startId = 0;
//        System.out.println(Person.startId);
        Person person2 = new Person();
        System.out.println(Person.getStartId());
        System.out.println(person.toString());
        System.out.println(person1.toString());
    }
}
