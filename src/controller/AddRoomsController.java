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
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Room;
import model.User;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class AddRoomsController {
    public AnchorPane contextAddRoom;
    static ArrayList<Room> roomList = new ArrayList<>();
    public JFXTextField type;
    public JFXTextField occupants;
    public StackPane addPane;

    public void back(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomsWindow.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAddRoom.getChildren().clear();
        contextAddRoom.getChildren().add(load);

    }

    public void openPackages(ActionEvent actionEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("../view/RoomPackages.fxml"));
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void addNewRoom(ActionEvent actionEvent) {
        Room room=new Room(type.getText(),occupants.getText());
        room.setPackages("All");


        if (roomList.add(room)){
            JFXDialogLayout content= new JFXDialogLayout();
            content.setHeading(new Text("Save"));
            content.setBody(new Text("Saving data"));
            JFXDialog dialog =new JFXDialog(addPane, content, JFXDialog.DialogTransition.CENTER);
            JFXButton button=new JFXButton("Okay");
            //button.getStylesheets().add("../style/style.css/dialog-button");
            button.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event){
                    dialog.close();
                }

            });
            content.setActions(button);
            dialog.show();
        }else {
            JFXDialogLayout content1= new JFXDialogLayout();
            content1.setHeading(new Text("Error"));
            content1.setBody(new Text("No data"));
            JFXDialog dialog =new JFXDialog(addPane, content1, JFXDialog.DialogTransition.CENTER);
            JFXButton button=new JFXButton("Close");
            //button.getStylesheets().add("../style/style.css/dialog-button");
            button.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event){
                    dialog.close();
                }

            });
            content1.setActions(button);
            dialog.show();
        }

    }
}
