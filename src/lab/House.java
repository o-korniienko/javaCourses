package lab;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringJoiner;

public class House implements Serializable {
    private String street;
    private int oneRoomCount;
    private int twoRoomCount;
    private int threeRoomCount;
    private ArrayList<Apartment> apartments;
    private int index;
    public static Comparator<Apartment> BY_APARTMENT_NUMBER;
    public static Comparator<Apartment> BY_ID;
    public static Comparator<Apartment> BY_FLOOR;
    public static Comparator<Apartment> BY_AREA;
    public static Comparator<Apartment> BY_NUMBER_OF_ROOMS;
    public static Comparator<Apartment> BY_LIFE_TIME;
    public static Comparator<Apartment> BY_TYPE_OF_BUILDING;

    static {
        BY_APARTMENT_NUMBER = new Comparator<Apartment>() {
            @Override
            public int compare(Apartment o1, Apartment o2) {
                return o1.getApartmentNumber() - o2.getApartmentNumber();
            }
        };
    }

    static {
        BY_ID = new Comparator<Apartment>() {
            @Override
            public int compare(Apartment o1, Apartment o2) {
                return o1.getId() - o2.getId();
            }
        };
    }

    static {
        BY_FLOOR = new Comparator<Apartment>() {
            @Override
            public int compare(Apartment o1, Apartment o2) {
                return o1.getFloor() - o2.getFloor();
            }
        };
    }

    static {
        BY_AREA = new Comparator<Apartment>() {
            @Override
            public int compare(Apartment o1, Apartment o2) {
                return (int) (o1.getArea() - o2.getArea());
            }
        };
    }

    static {
        BY_NUMBER_OF_ROOMS = new Comparator<Apartment>() {
            @Override
            public int compare(Apartment o1, Apartment o2) {
                return o1.getNumberOfRooms() - o2.getNumberOfRooms();
            }
        };
    }

    static {
        BY_LIFE_TIME=new Comparator<Apartment>() {
            @Override
            public int compare(Apartment o1, Apartment o2) {
                return o1.getLifetime()-o2.getLifetime();
            }
        };
    }

    static {
        BY_TYPE_OF_BUILDING = new Comparator<Apartment>() {
            @Override
            public int compare(Apartment o1, Apartment o2) {
                return o1.getType().compareTo(o2.getType());
            }
        };
    }


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

    public void sort(Comparator<Apartment> comparator) {
        Collections.sort(apartments, comparator);
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
        apartment.setId(index + 1);
        index++;
    }

    public void addAllApartment() {
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

    public void delById(int id) {
        int ind = -1;
        for (Apartment a : apartments) {
            if (a.getId() == id) {
                ind = apartments.indexOf(a);

            }
        }
        if (ind < 0) System.out.println("There is no apartment with this id: " + id);
        else apartments.remove(ind);
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

    public Apartment findById(int id) {
        Apartment apartment = null;
        try {
            for (Apartment a : apartments) {
                if (a.getId() == id) {
                    apartment = a;
                }
            }
            if (apartment == null) throw new Exception();
        } catch (Exception e) {
            System.out.println("There is no apartment with this id: " + id);
        }
        return apartment;
    }

    public ArrayList<Apartment> findByRoomsCount(int roomsCount) {
        ArrayList<Apartment> apar = new ArrayList<>();
        try {
            for (Apartment a : apartments) {
                if (a.getNumberOfRooms() == roomsCount) {
                    apar.add(a);
                }
            }
            if (apar.size() == 0) throw new Exception();
        } catch (Exception e) {
            System.out.println("There are no apartments with this number of rooms : " + roomsCount);
        }
        return apar;
    }

    public ArrayList<Apartment> findByRoomsAndFloor(int roomsCount, int firstFloor, int lastFloor) {
        ArrayList<Apartment> apar = new ArrayList<>();
        try {
            for (Apartment a : apartments) {
                if (a.getNumberOfRooms() == roomsCount && (a.getFloor() >= firstFloor && a.getFloor() <= lastFloor)) {
                    apar.add(a);
                }
            }
            if (apar.size()==0) throw  new Exception();
        } catch (Exception e) {
            System.out.println("There are no apartments with this number of rooms (" + roomsCount + ")" +
                    " on these floors: from " + firstFloor + " to " + lastFloor);
        }
        return apar;
    }

    public ArrayList<Apartment> findByAreaGreaterThan(int area) {
        ArrayList<Apartment> apar = new ArrayList<>();
        try {
            for (Apartment a : apartments) {
                if (a.getArea() > area) {
                    apar.add(a);
                }
            }
            if (apar.size()==0) throw new Exception();
        } catch (Exception e) {
            System.out.println("there are no apartments with this area: " + area);
        }
        return apar;
    }

    public void printAll() {
        System.out.println("House on " + street + ":");
        for (Apartment a : apartments) {
            System.out.println(a);
        }
    }
}
