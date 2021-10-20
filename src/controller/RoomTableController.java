package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Room;
import model.User;
import view.tm.RoomTM;
import view.tm.UserTM;

import java.io.IOException;

import static controller.AddRoomsController.roomList;
import static controller.SignUpWindowController.userList;

public class RoomTableController {
    public TableView roomtbl;
    public TableColumn colType;
    public TableColumn colOccu;
    public TableColumn colPackage;
    public TableColumn colMod;
    public TableColumn colDelete;

    public void initialize(){
        colType.setCellValueFactory(new PropertyValueFactory<>("type"));
        colOccu.setCellValueFactory(new PropertyValueFactory<>("occup"));
        colPackage.setCellValueFactory(new PropertyValueFactory<>("packages"));
        colMod.setCellValueFactory(new PropertyValueFactory<>("mod"));
        colDelete.setCellValueFactory(new PropertyValueFactory<>("del"));
    }

    public void loadData(){
        ObservableList<RoomTM> tmObservableList = FXCollections.observableArrayList();
        for (Room temp:roomList
        ) {
            Button mod = new Button("Mod");
            Button del = new Button("Delete");
            tmObservableList.add(new RoomTM(temp.getType(),temp.getOccup(),temp.getPackages(),mod,del));

            del.setOnAction((e)-> {
                        roomList.remove(temp);
                        loadData();
                    });

            mod.setOnAction((e1)->{
                Parent load = null;
                try {
                    load = FXMLLoader.load(getClass().getResource("../view/AddRooms.fxml"));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                Scene scene = new Scene(load);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
                loadData();
            });
        }
        roomtbl.setItems(tmObservableList);

    }
}
