package controller;

import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginWindowController {
    public AnchorPane contextLogin;
    public JFXTextField txtusername;
    public JFXPasswordField password;
    public StackPane stckPane;

    public void openAdminWindow(ActionEvent actionEvent) throws IOException {
        if (password.getText().equals("123")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/AdminWindow.fxml"));
            Parent parent = loader.load();
            AdminWindowController controller = (AdminWindowController) loader.getController();
            controller.username("MR. " + txtusername.getText());
            contextLogin.getChildren().clear();
            contextLogin.getChildren().add(parent);
        }else{
            JFXDialogLayout content= new JFXDialogLayout();
            content.setHeading(new Text("Loging Falied"));
            content.setBody(new Text("Incorrect Password"));
            JFXDialog dialog =new JFXDialog(stckPane, content, JFXDialog.DialogTransition.CENTER);
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
        }
    }

    void loadeUi(String filName) throws IOException {
        URL resource = getClass().getResource("../view/"+filName+".fxml");
        Parent load = FXMLLoader.load(resource);
        contextLogin.getChildren().clear();
        contextLogin.getChildren().add(load);
    }

    public void openReceptionWindow(ActionEvent actionEvent) throws IOException {
        if (password.getText().equals("123")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/ReceptionWindow.fxml"));
            Parent parent = loader.load();
            ReceptionWindowController controller = (ReceptionWindowController) loader.getController();
            controller.username("MR. " + txtusername.getText());
            contextLogin.getChildren().clear();
            contextLogin.getChildren().add(parent);
        }else{
            JFXDialogLayout content= new JFXDialogLayout();
            content.setHeading(new Text("Loging Falied"));
            content.setBody(new Text("Incorrect Password"));
            JFXDialog dialog =new JFXDialog(stckPane, content, JFXDialog.DialogTransition.CENTER);
            JFXButton button=new JFXButton("Okay");
            button.getStylesheets().add("button");
            JFXButton button2=new JFXButton("no");
            button2.getStylesheets().add("button");
            button.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event){
                    dialog.close();
                }

            });
            button2.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event){
                    dialog.close();
                }

            });
            content.setActions(button2);
            dialog.show();
        }
    }
}
