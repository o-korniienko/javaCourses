package lab;

import java.io.Serializable;

public class Apartment implements Serializable, Comparable {
    private int id;
    private int apartmentNumber;
    private int area;
    private int floor;
    private int numberOfRooms;
    private int lifetime;
    private TypeOfBuilding type;

    public Apartment(int numberOfRooms) {
        this.apartmentNumber = (int) (Math.random() * 100);
        this.area = (int) (Math.random() * 31 + 15);
        this.floor = (int) (Math.random() * 9 + 1);
        this.numberOfRooms = numberOfRooms;
        this.lifetime = (int) (Math.random() * 51 + 100);
        if (lifetime == 150) type = TypeOfBuilding.ESPECIALLYCAPITAL;
        if (lifetime >= 120 && lifetime < 150) type = TypeOfBuilding.CAPITAL;
        if (lifetime < 120 && lifetime >= 100) type = TypeOfBuilding.LARGEPANEL;
    }

    public int getId() {
        return id;
    }

    public int getLifetime() {
        return lifetime;
    }

    public TypeOfBuilding getType() {
        return type;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }


    public double getArea() {
        return area;
    }

    public int getFloor() {
        return floor;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object other) {
        Apartment that = (Apartment) other;
        if (this.apartmentNumber==that.apartmentNumber){
            return this.id - that.id;
        }else{
            return this.apartmentNumber - that.apartmentNumber;
        }
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", apartmentNumber=" + apartmentNumber +
                ", area=" + area +
                ", floor=" + floor +
                ", numberOfRooms=" + numberOfRooms +
                ", lifetime=" + lifetime +
                ", type='" + type + '\'' +
                '}';
    }
}
