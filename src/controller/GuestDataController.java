package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Guest;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class GuestDataController {
    public AnchorPane contextGuest;
    public JFXTextField txtName;
    public JFXTextField txtContact;
    public JFXTextField txtEmail;
    public JFXTextField txtAddress;
    public JFXTextField txtNic;

    static ArrayList<Guest> guestList = new ArrayList<>();

    public void reserve(ActionEvent actionEvent) throws IOException {
        Guest guest=new Guest(txtName.getText(),txtContact.getText(),txtEmail.getText(),txtAddress.getText(),txtNic.getText());
        guest.setRoomType(SearchRoomController.searchData[0]);
        guest.setPeople(SearchRoomController.searchData[1]);
        guest.setInDate(SearchRoomController.searchData[2]);
        guest.setOutDate(SearchRoomController.searchData[3]);
        guestList.add(guest);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/GuestDataSheet.fxml"));
        Parent parent = loader.load();
        GuestDataSheetController controller = (GuestDataSheetController) loader.getController();
        controller.loadData(guest);
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void back(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/SearchRoom.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)contextGuest.getScene().getWindow();
        window.setScene(new Scene(load));
    }

}
