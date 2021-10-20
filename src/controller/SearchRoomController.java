package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Guest;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class SearchRoomController {
    public AnchorPane contextSearch;
    public TextField sreachType;
    public TextField searchPeople;
    public JFXDatePicker inDate;
    public JFXDatePicker outDate;

    static String[] searchData=new String[4];

    public void search(ActionEvent actionEvent) throws IOException {
        searchData[0]=sreachType.getText();
        searchData[1]=searchPeople.getText();
        searchData[2]=inDate.getValue().toString();
        searchData[3]=outDate.getValue().toString();


        URL resource = getClass().getResource("../view/GuestData.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)contextSearch.getScene().getWindow();
        window.setScene(new Scene(load));

    }
}
