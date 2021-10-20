package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RoomsWindowController {
    public AnchorPane contextRoom;

    public void back(ActionEvent actionEvent) throws IOException {
        loadeUi("AdminWindow");
    }

    void loadeUi(String filName) throws IOException {
        URL resource = getClass().getResource("../view/"+filName+".fxml");
        Parent load = FXMLLoader.load(resource);
        contextRoom.getChildren().clear();
        contextRoom.getChildren().add(load);
    }

    public void addNewRoom(ActionEvent actionEvent) throws IOException {
        loadeUi("AddRooms");
    }

    public void openAllRoom(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/RoomTable.fxml"));
        Parent parent = loader.load();
        RoomTableController controller = (RoomTableController) loader.getController();
        controller.loadData();
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void openRoomToDelete(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/RoomTable.fxml"));
        Parent parent = loader.load();
        RoomTableController controller = (RoomTableController) loader.getController();
        controller.loadData();
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
