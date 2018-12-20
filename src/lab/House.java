package lab;

public class House {
    private String street;
    private int oneRoomCount;
    private int twoRoomCount;
    private int threeRoomCount;
    private Apartment[] apartments;
    private int index;


    public House(String street, int oneRoomCount, int twoRoomCount, int threeRoomCount) {
        this.apartments = new Apartment[oneRoomCount + twoRoomCount + threeRoomCount + 1];
        this.street = street;
        this.oneRoomCount = oneRoomCount;
        this.twoRoomCount = twoRoomCount;
        this.threeRoomCount = threeRoomCount;
        this.index = -1;
        for (int i = 0; i < oneRoomCount; i++) {
            addApartment(new Apartment(1));
        }
        for (int i = 0; i < twoRoomCount; i++) {
            addApartment(new Apartment(2));
        }
        for (int i = 0; i < twoRoomCount; i++) {
            addApartment(new Apartment(3));
        }

    }

    public String getStreet() {
        return street;
    }

    public int getOneRoomCount() {
        return oneRoomCount;
    }

    public int getTwoRoomCount() {
        return twoRoomCount;
    }

    public int getThreeRoomCount() {
        return threeRoomCount;
    }

    public void addApartment(Apartment apart) {
        if (index >= apartments.length - 1) {
            System.out.println("ERROR, no place for " + apart);
            return;
        }
        apartments[++index] = apart;
    }

    public void delByid(int id) {
        int ind = getIndex(id);
        if (ind < 0) {
            System.out.println("There is not apartment with that id: " + id);
            return;
        }
        apartments[ind] = apartments[index];
        apartments[index] = null;
        index--;
    }

    public int getIndex(int id) {
        for (int i = 0; i < index; i++) {
            if (apartments[i].getId() == id) return i;
        }
        return -1;
    }

    public void findById(int id) {
        int f = 0;
        for (int i = 0; i < index; i++) {
            if (apartments[i].getId() == id) {
                System.out.println(apartments[i]);
                f++;
            }
        }
        if (f == 0) System.out.println("There is not apartment with that id: " + id);
    }


    public void printAll() {
        System.out.println("House on " + street + ":");
        for (int i = 0; i < index; i++) {
            System.out.println(apartments[i]);
        }
    }

    public void printByRoomsCount(int rooms) {
        int f = 0;
        for (int i = 0; i < index; i++) {
            if (apartments[i].getNumberOfRooms() == rooms) {
                System.out.println("ByRoomsCount: " + apartments[i]);
                f++;
            }
        }
        if (f == 0) System.out.println("There are not those apartments");
    }

    public void printByRoomsAndFloor(int rooms, int startfloor, int lastfloor) {
        int f = 0;
        for (int i = 0; i < index; i++) {
            if (apartments[i].getNumberOfRooms() == rooms && (apartments[i].getFloor() >= startfloor && apartments[i].getFloor() <= lastfloor)) {
                System.out.println("ByRoomsAndFloor: " + apartments[i]);
                f++;
            }
        }
        if (f == 0) System.out.println("There are not those apartments");
    }

    public void printByArea(double area) {
        int f = 0;
        for (int i = 0; i < index; i++) {
            if (apartments[i].getArea() > area) {
                System.out.println("ByArea: " + apartments[i]);
                f++;
            }
        }
        if (f == 0) System.out.println("there are not those apartments");
    }
}
