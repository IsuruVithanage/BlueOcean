package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import model.Meal;
import model.Room;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class AddMealsController {
    public JFXTextField mealname;
    public JFXTextField size;
    public JFXTextField price;
    public AnchorPane contextAddMeals;
    static ArrayList<Meal> mealList = new ArrayList<>();
    public StackPane mealPane;

    public void addNewMeal(ActionEvent actionEvent) {
        Meal meal=new Meal(mealname.getText(),size.getText(),price.getText());


        if (mealList.add(meal)){
            JFXDialogLayout content= new JFXDialogLayout();
            content.setHeading(new Text("Save"));
            content.setBody(new Text("Saving data"));
            JFXDialog dialog =new JFXDialog(mealPane, content, JFXDialog.DialogTransition.CENTER);
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
            JFXDialog dialog =new JFXDialog(mealPane, content1, JFXDialog.DialogTransition.CENTER);
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

    public void back(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealsWindow.fxml");
        Parent load = FXMLLoader.load(resource);
        contextAddMeals.getChildren().clear();
        contextAddMeals.getChildren().add(load);
    }
}
