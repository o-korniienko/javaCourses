package les_7_classes;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getName("Арчі");
        dog.getAge(6);
        dog.say();
        dog.getOlder(1);
        dog.print();

        Dog dog1 = new Dog("Арчі",7);
        dog1.say();
        dog1.print();
    }
}
