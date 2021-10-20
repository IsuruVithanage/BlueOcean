package view.tm;

import javafx.scene.control.Button;

public class RoomTM {
    private String type;
    private String occup;
    private String packages;
    private Button mod;
    private Button del;

    public RoomTM() {
    }

    public RoomTM(String type, String occup, String packages, Button mod, Button del) {
        this.setType(type);
        this.setOccup(occup);
        this.setPackages(packages);
        this.setMod(mod);
        this.setDel(del);
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

    public Button getMod() {
        return mod;
    }

    public void setMod(Button mod) {
        this.mod = mod;
    }

    public Button getDel() {
        return del;
    }

    public void setDel(Button del) {
        this.del = del;
    }
}
