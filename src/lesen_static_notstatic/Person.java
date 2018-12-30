package lesen_static_notstatic;

public class Person {
    private String name;
    private long id;

    private static long startId; //static поле

    public static long getStartId() {   // static method
        return startId;
    }
    static {     //static block - завантажується в момент завантаження КЛАСА!!!
        startId = 10000;
    }

    {           //non static block - виконується перед будь яким конструктором!!!
        startId++;
        this.id = startId;
    }

    public Person(String name) {
        this.name = name;

    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

