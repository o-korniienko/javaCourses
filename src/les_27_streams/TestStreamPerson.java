package les_27_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestStreamPerson {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Zoe", 14));
        people.add(new Person("Alena", 25));
        people.add(new Person("Kate", 18));
        people.add(new Person("Oleh", 27));
        people.add(new Person("Tim", 18));
        people.add(new Person("Olga", 25));

        //Stream<Person> stream = people.stream();

        //1. print all: (no stream!!!)
        System.out.println("all: ");
        people.forEach(p -> System.out.println(p));

        //2. print age > 18:
        System.out.println("print age>18: ");
        people.stream().
                filter(p -> p.getAge() > 18).
                forEach(p -> System.out.println(p));

        //3.
        System.out.println("age>18 and 1st letter is 'O': ");
        people.stream().
                filter(p -> p.getAge() > 18 && p.getName().startsWith("O")).
                forEach(p -> System.out.println(p));

        //4.
        System.out.println("List of names contains 'E': ");
        List<String> names = people.stream().filter(p -> p.getName().contains("e")).map(p -> p.getName()).
                collect(Collectors.toList());
        System.out.println(names);

        //5.
        System.out.println("sum of ages: ");
        int sum = people.stream().map(p -> p.getAge()).reduce((p1, p2) -> p1 + p2).get();
        System.out.println(sum);

        //6.
        System.out.println("average age: ");
        double average = people.stream().mapToDouble(p -> p.getAge()).average().getAsDouble();
        System.out.println(average);

        //7.
        System.out.println("get first name where age = 18: ");
        String name = people.stream().filter(p -> p.getAge() == 18).findFirst().
                orElseGet(() -> new Person("no such person", 0)).getName();
        System.out.println(name);
        //8.

        //1:
        System.out.println("№1 get name of olders person: ");
        String name2 = people.stream().reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2).get().getName();
        System.out.println(name2);

        //2:
        System.out.println("№2 get name of olders person: ");
        int max = people.stream().mapToInt(p -> p.getAge()).max().getAsInt();
        String name3 = people.stream().filter(p -> p.getAge() == max).findFirst().get().getName();
        System.out.println(name3);

        //9.
        System.out.println("sorted by name list of drinkers (>21): ");
        List<Person> drinkers;
        drinkers = people.stream().filter(p -> p.getAge() >= 21).sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .collect(Collectors.toList());
        System.out.println(drinkers);

        //10.
        System.out.println("Map age= p1,p2,...");
        Map<Integer, String> persons1;
        persons1 = people.stream().collect(Collectors.toMap(
                p -> p.getAge() //how to make keys
                , p -> p.getName() // how to make values
                , (s1, s2) -> s1 + ',' + s2)); // how to marge them (values)
        System.out.println(persons1);

        //11. ALL SSTATISTICS!!!
        System.out.println("Map age= {p1,p2,...}");
        Map<Integer, List<Person>> persons2;
        persons2 = people.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println(persons2);


            // Streams + Arrays:
        //12.
        System.out.println("fill array: ");
        int[] a = new int[10];
        Arrays.setAll(a, o -> (int) (Math.random() * 100));
        System.out.println(Arrays.toString(a));

        //13.
        System.out.println("find max elem in array: ");
        int maxE1 = IntStream.of(a).max().getAsInt();
        System.out.println(maxE1);
    }
}
