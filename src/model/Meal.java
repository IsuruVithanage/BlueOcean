package model;

public class Meal {
    private String name;
    private String size;
    private String price;

    public Meal() {
    }

    public Meal(String name, String size, String price) {
        this.setName(name);
        this.setSize(size);
        this.setPrice(price);
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
}
