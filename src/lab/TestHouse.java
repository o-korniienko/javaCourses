package lab;

public class TestHouse {
    public static void main(String[] args) {
       /* House house = new House("Shevchenko 10A",15,8,7);
        house.addAllApartment();*/


        House house = House.loadFromFile("house.dat");
        house.getApartments().sort(Apartment::compareTo);


        //house.delById(25);
        house.saveToFile("house.dat");
        house.printAll();
        System.out.println("----------------");
        house.findById(13);
        System.out.println("----------------");
        house.printByRoomsCount(1);
        System.out.println("----------------");
        house.printByRoomsAndFloor(2, 2, 5);
        System.out.println("----------------");
        house.printByArea(41);
    }
}
