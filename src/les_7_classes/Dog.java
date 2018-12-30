package les_7_classes;

public class Dog {
    static String name;
    static int age;

    public Dog(String name,int age){

    }

    public Dog(){

    }


    public String getName(String name) {
        return this.name = name;
    }

    public int getAge(int age) {
        return this.age = age;
    }

    public void say() {
        System.out.println("Гав -Гав!!!!");
    }

    public void getOlder(int x) {

         age += x;
    }
    public void print(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

}
