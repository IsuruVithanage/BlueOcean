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
import model.Meal;
import model.Room;
import view.tm.MealTM;
import view.tm.RoomTM;

import java.io.IOException;

import static controller.AddMealsController.mealList;
import static controller.AddRoomsController.roomList;

public class MealTableController {
    public TableColumn colName;
    public TableColumn colSize;
    public TableColumn colPrice;
    public TableColumn colMod;
    public TableColumn colDel;
    public TableView maeltbl;

    public void initialize(){
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colSize.setCellValueFactory(new PropertyValueFactory<>("size"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        colMod.setCellValueFactory(new PropertyValueFactory<>("mod"));
        colDel.setCellValueFactory(new PropertyValueFactory<>("del"));
    }


    public void loadData(){
        ObservableList<MealTM> tmObservableList = FXCollections.observableArrayList();
        for (Meal temp:mealList
        ) {
            Button mod = new Button("Mod");
            Button del = new Button("Delete");
            tmObservableList.add(new MealTM(temp.getName(),temp.getSize(),temp.getPrice(),mod,del));

            del.setOnAction((e)-> {
                mealList.remove(temp);
                loadData();
            });

            mod.setOnAction((e1)->{
                Parent load = null;
                try {
                    load = FXMLLoader.load(getClass().getResource("../view/AddMeals.fxml"));
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
        maeltbl.setItems(tmObservableList);

    }


}
