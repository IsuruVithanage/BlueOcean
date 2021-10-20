package view.tm;

import javafx.scene.control.Button;

public class GuestTM {
    private String name;
    private String contact;
    private String email;
    private String address;
    private String nic;
    private String roomType;
    private String people;
    private String inDate;
    private String outDate;
    private Button del;
    private Button maintainance;
    private String roomNo;

    public GuestTM() {
    }

    public GuestTM(String name, String contact, String email, String address, String nic, String roomType, String people, String inDate, String outDate, Button del, Button maintainance , String roomNo) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.address = address;
        this.nic = nic;
        this.roomType = roomType;
        this.people = people;
        this.inDate = inDate;
        this.outDate = outDate;
        this.del = del;
        this.maintainance = maintainance;
        this.roomNo=roomNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    public Button getDel() {
        return del;
    }

    public void setDel(Button del) {
        this.del = del;
    }

    public Button getMaintainance() {
        return maintainance;
    }

    public void setMaintainance(Button maintainance) {
        this.maintainance = maintainance;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }
}
