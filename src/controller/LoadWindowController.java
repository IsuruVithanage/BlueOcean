package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoadWindowController implements Initializable {

    public AnchorPane rootPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //new LoadWin().start();

    }


    public void openLogin(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginWindow.fxml");
        Parent load = FXMLLoader.load(resource);
        rootPane.getChildren().clear();
        rootPane.getChildren().add(load);
    }
}
