package controller;

import com.jfoenix.controls.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import model.User;
import view.tm.UserTM;

import java.util.ArrayList;

public class SignUpWindowController {
    public JFXTextField username;
    public JFXPasswordField password;
    public JFXTextField email;
    public JFXTextField contact;

    static ArrayList<User> userList = new ArrayList<>();
    public AnchorPane contextSign;
    public StackPane stackPane;

    public void newAdminOnAction() {
        User user=new User(username.getText(),email.getText(),password.getText(),contact.getText());
        user.setRoll("Admin");


        if (userList.add(user)){
            JFXDialogLayout content= new JFXDialogLayout();
            content.setHeading(new Text("Save"));
            content.setBody(new Text("Saving data"));
            JFXDialog dialog =new JFXDialog(stackPane, content, JFXDialog.DialogTransition.CENTER);
            JFXButton button=new JFXButton("Okay");
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
            JFXDialog dialog =new JFXDialog(stackPane, content1, JFXDialog.DialogTransition.CENTER);
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


    public void newReceptionistOnAction(ActionEvent actionEvent) {
        User user1=new User(username.getText(),email.getText(),password.getText(),contact.getText());
        user1.setRoll("Receptionist");

        if (userList.add(user1)){
            JFXDialogLayout content= new JFXDialogLayout();
            content.setHeading(new Text("Save"));
            content.setBody(new Text("Saving data"));
            JFXDialog dialog =new JFXDialog(stackPane, content, JFXDialog.DialogTransition.CENTER);
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
            JFXDialog dialog =new JFXDialog(stackPane, content1, JFXDialog.DialogTransition.CENTER);
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
