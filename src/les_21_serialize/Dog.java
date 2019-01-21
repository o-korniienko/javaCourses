package les_21_serialize;

import java.io.Serializable;

public class Dog implements Serializable {
    private String name;
    //private transient int age;//not serialized!!!
    private  int age; //serialized!!!

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
