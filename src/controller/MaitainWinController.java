package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MaitainWinController {

    public void addmaintan(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/GuestTable.fxml"));
        Parent parent = loader.load();
        GuestTableController controller = (GuestTableController) loader.getController();
        controller.loadData();
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

    public void openmaintance(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/MaintainTable.fxml"));
        Parent parent = loader.load();
        MaintainTableController controller = (MaintainTableController) loader.getController();
        controller.loadData();
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
