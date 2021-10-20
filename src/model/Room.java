package model;

import javafx.scene.control.Button;

public class Room {
    private String type;
    private String occup;
    private String packages;

    public Room() {
    }

    public Room(String type, String occup) {
        this.setType(type);
        this.setOccup(occup);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOccup() {
        return occup;
    }

    public void setOccup(String occup) {
        this.occup = occup;
    }

    public String getPackages() {
        return packages;
    }

    public void setPackages(String packages) {
        this.packages = packages;
    }

}
