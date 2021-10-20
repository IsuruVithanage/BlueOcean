package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MealsWindowController {
    public AnchorPane contextMeal;

    void loadeUi(String filName) throws IOException {
        URL resource = getClass().getResource("../view/"+filName+".fxml");
        Parent load = FXMLLoader.load(resource);
        contextMeal.getChildren().clear();
        contextMeal.getChildren().add(load);
    }

    public void addNewMeal(ActionEvent actionEvent) throws IOException {
        loadeUi("AddMeals");
    }

    public void openAllMeal(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/MealTable.fxml"));
        Parent parent = loader.load();
        MealTableController controller = (MealTableController) loader.getController();
        controller.loadData();
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void openMealToDelete(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/MealTable.fxml"));
        Parent parent = loader.load();
        MealTableController controller = (MealTableController) loader.getController();
        controller.loadData();
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void back(ActionEvent actionEvent) throws IOException {
        loadeUi("AdminWindow");
    }
}
