package lab;

public class TestHouse {
    public static void main(String[] args) {
        /*House house = new House("Shevchenko 10A", 15, 8, 7);
        house.addAllApartment();*/


        House house = House.loadFromFile("house.dat");


        house.sort(House.BY_APARTMENT_NUMBER.thenComparing(House.BY_ID));
        house.delById(25);
        //house.saveToFile("house.dat");
        //house.printAll();
        System.out.println("----------------");
        System.out.println("By id: " + house.findById(12));
        System.out.println("----------------");
        System.out.println("By rooms count: " + house.findByRoomsCount(1));
        System.out.println("----------------");
        System.out.println("By rooms count and floor: " + house.findByRoomsAndFloor(2, 2, 5));
        System.out.println("----------------");
        System.out.println("By area: " + house.findByAreaGreaterThan(41));
    }
}
