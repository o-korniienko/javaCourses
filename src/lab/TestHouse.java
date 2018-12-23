package lab;

public class TestHouse {
    public static void main(String[] args) {
        House house = new House("Shevchenko 7A", 15, 8, 7);
        house.findById(7);
        System.out.println("---------");
        house.delByid(28);
        house.printAll();
        System.out.println("---------");
        house.printByRoomsCount(2);
        System.out.println("---------");
        house.printByRoomsAndFloor(1, 2, 6);
        System.out.println("---------");
        house.printByArea(42);

    }
}
