package lab;

import java.io.*;
import java.util.ArrayList;

public class House implements Serializable{
    private String street;
    private int oneRoomCount;
    private int twoRoomCount;
    private int threeRoomCount;
    private ArrayList<Apartment> apartments;
    private int index;

    public static House loadFromFile(String fileName) {
        House house = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            house = (House) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return house;
    }

    public House(String street, int oneRoomCount, int twoRoomCount, int threeRoomCount) {
        this.street = street;
        this.oneRoomCount = oneRoomCount;
        this.twoRoomCount = twoRoomCount;
        this.threeRoomCount = threeRoomCount;
        this.apartments = new ArrayList<>();
        this.index = 0;

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

    public ArrayList<Apartment> getApartments() {
        return apartments;
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
        apartment.setId(index +1);
        index++;
    }
    public void addAllApartment(){
        for (int i = 0; i < this.getOneRoomCount(); i++) {
            addApartment(new Apartment(1));
        }
        for (int i = 0; i < this.getTwoRoomCount(); i++) {
            addApartment(new Apartment(2));
        }

        for (int i = 0; i < this.getThreeRoomCount(); i++) {
            addApartment(new Apartment(3));
        }
    }
    public void saveToFile(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(this);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void findById(int id) {
        int f = 0;
        for (Apartment a : apartments) {
            if (a.getId() == id) {
                System.out.println(a);
                f++;
            }
        }
        if (f == 0) System.out.println("There is not apartment with that id: " + id);
    }

    public void delById(int id) {
        int ind = -1;
        for (Apartment a : apartments) {
            if (a.getId() == id) {
                ind = apartments.indexOf(a);

            }
        }
        if (ind < 0) System.out.println("There is not apartment with that id: " + id);
        else   apartments.remove(ind);
    }

    public void printAll() {
        System.out.println("HouseArray on " + street + ":");
        for (Apartment a : apartments) {
            System.out.println(a);
        }
    }

    public void printByRoomsCount(int roomsCount) {
        int f = 0;
        for (Apartment a : apartments) {
            if (a.getNumberOfRooms() == roomsCount) {
                System.out.println("ByRoomsCount: " + a);
                f++;
            }
        }
        if (f == 0) System.out.println("There are not apartments with that number of rooms : " + roomsCount);
    }

    public void printByRoomsAndFloor(int roomsCount, int firstFloor, int lastFloor) {
        int f = 0;
        for (Apartment a : apartments) {
            if (a.getNumberOfRooms() == roomsCount && (a.getFloor() >= firstFloor || a.getFloor() <= lastFloor)) {
                System.out.println("ByRoomsAndFloor: " + a);
                f++;
            }
        }
        if (f == 0)
            System.out.println("There are not apartments with that number of rooms (" + roomsCount + ")" +
                    " on those floors: from " + firstFloor + " to " + lastFloor);
    }

    public void printByArea(int area) {
        int f = 0;
        for (Apartment a : apartments) {
            if (a.getArea() > area) {
                System.out.println("ByArea: " + a);
                f++;
            }
        }
        if (f == 0) System.out.println("there are not apartments with this area: " + area);
    }
}
