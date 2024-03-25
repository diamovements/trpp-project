package lib.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Apartment {

    @Id
    private int ap_id;
    @NotEmpty
    private int area;
    @NotEmpty
    private int floor;
    @NotEmpty
    private String building;
    @NotEmpty
    private int price;

    public Apartment(int area, int floor, String building, int price) {
        this.area = area;
        this.floor = floor;
        this.building = building;
        this.price = price;
    }

    public Apartment() {

    }

    public int getAp_id() {
        return ap_id;
    }

    public void setAp_id(int ap_id) {
        this.ap_id = ap_id;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
