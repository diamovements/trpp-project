package lib.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Building {

    @Id
    private int build_id;
    @NotEmpty
    private String title;
    @NotEmpty
    private String location;

    public Building(String title, String location) {
        this.title = title;
        this.location = location;
    }

    public Building() {

    }

    public int getBuild_id() {
        return build_id;
    }

    public void setBuild_id(int build_id) {
        this.build_id = build_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
