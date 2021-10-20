package view.tm;

import javafx.scene.control.Button;

public class MealTM {
    private String name;
    private String size;
    private String price;
    private Button mod;
    private Button del;

    public MealTM() {
    }

    public MealTM(String name, String size, String price, Button mod, Button del) {
        this.setName(name);
        this.setSize(size);
        this.setPrice(price);
        this.setMod(mod);
        this.setDel(del);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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
