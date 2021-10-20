package controller;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import model.Guest;

public class GuestDataSheetController {
    public Label name;
    public Label contact;
    public Label email;
    public Label address;
    public Label nic;
    public Label roomtype;
    public Label people;
    public Label indate;
    public Label outDate;



    public void loadData(Guest guest){
        name.setText(guest.getName());
        contact.setText(guest.getContact());
        email.setText(guest.getEmail());
        address.setText(guest.getAddress());
        roomtype.setText(guest.getRoomType());
        people.setText(guest.getPeople());
        indate.setText(guest.getInDate());
        outDate.setText(guest.getOutDate());
    }


}
