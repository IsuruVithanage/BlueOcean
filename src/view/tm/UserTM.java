package view.tm;

import javafx.scene.control.Button;

public class UserTM {
    private String username;
    private String email;
    private String password;
    private String contact;
    private String roll;
    private Button btn;

    public UserTM() {
    }

    public UserTM(String username, String email, String password, String contact, String roll, Button btn) {
        this.setUsername(username);
        this.setEmail(email);
        this.setPassword(password);
        this.setContact(contact);
        this.setRoll(roll);
        this.setBtn(btn);
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
