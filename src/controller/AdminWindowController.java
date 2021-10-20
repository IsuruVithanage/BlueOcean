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

public class AdminWindowController {
    public AnchorPane contextAdmin;
    public Label lbusername;

    public void username(String name){
        lbusername.setText(name);
    }

    public void logout(ActionEvent actionEvent) throws IOException {
        loadeUi("LoginWindow");
    }

    public void openSettings(ActionEvent actionEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("../view/SettingsWindow.fxml"));
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        
    }

    public void openRooms(ActionEvent actionEvent) throws IOException {
        loadeUi("RoomsWindow");
    }

    void loadeUi(String filName) throws IOException {
        URL resource = getClass().getResource("../view/"+filName+".fxml");
        Parent load = FXMLLoader.load(resource);
        contextAdmin.getChildren().clear();
        contextAdmin.getChildren().add(load);
    }


    public void openIncomeWindow(ActionEvent actionEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("../view/IncomeWindow.fxml"));
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void openMeals(ActionEvent actionEvent) throws IOException {
        loadeUi("MealsWindow");
    }
}
