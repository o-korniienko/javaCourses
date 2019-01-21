package les_24_inner_nested;

public class TestOrder {
    public static void main(String[] args) {
      Order order = new Order();
        order.add("orange",50,4);
        order.add("milk",25,1);
        order.add("fish",25,3);
        order.add("bread",10,2);
        order.add("meat",120,5);

        order.printAll();
        System.out.println(order.totalSum());

    }
}
