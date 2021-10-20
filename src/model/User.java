package model;

public class User {
    private String name;
    private String email;
    private String password;
    private String contact;
    private String roll;

    public User() {
    }

    public User(String name, String email, String password, String contact) {
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
        this.setContact(contact);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
}
