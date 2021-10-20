package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ReceptionWindowController {
    public AnchorPane contextReception;
    public Label lbusername;

    public void username(String name){
        lbusername.setText(name);
    }


    public void openRoomRecervatioin(ActionEvent actionEvent) throws IOException {
        loadeUi("ReservationWin");

    }

    public void logout(ActionEvent actionEvent) throws IOException {
        loadeUi("LoginWindow");
    }

    void loadeUi(String filName) throws IOException {
        URL resource = getClass().getResource("../view/"+filName+".fxml");
        Parent load = FXMLLoader.load(resource);
        contextReception.getChildren().clear();
        contextReception.getChildren().add(load);
    }

    public void openMaintanance(ActionEvent actionEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("../view/MaitainWin.fxml"));
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
