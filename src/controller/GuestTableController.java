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
import model.Guest;
import view.tm.GuestTM;

import java.io.IOException;

import static controller.GuestDataController.guestList;


public class GuestTableController {
    public TableColumn colNo;
    public TableColumn colName;
    public TableColumn colContact;
    public TableColumn colEmail;
    public TableColumn colAddress;
    public TableColumn colNic;
    public TableColumn colType;
    public TableColumn colPeople;
    public TableColumn colIndate;
    public TableColumn colOutdate;
    public TableView<GuestTM> guesttbl;
    public TableColumn colDelete;
    public TableColumn colMain;
    public int number = 0;
    

    public void initialize(){
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("contact"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colDelete.setCellValueFactory(new PropertyValueFactory<>("del"));
        colIndate.setCellValueFactory(new PropertyValueFactory<>("inDate"));
        colOutdate.setCellValueFactory(new PropertyValueFactory<>("outDate"));
        colPeople.setCellValueFactory(new PropertyValueFactory<>("people"));
        colType.setCellValueFactory(new PropertyValueFactory<>("roomType"));
        colMain.setCellValueFactory(new PropertyValueFactory<>("maintainance"));
        colNo.setCellValueFactory(new PropertyValueFactory<>("roomNo"));

    }

    public void loadData(){
        ObservableList<GuestTM> tmObservableList = FXCollections.observableArrayList();
        for (Guest temp:guestList
        ) {
            Button btn = new Button("Delete");
            Button maintain = new Button("Maintain");
            number++;
            tmObservableList.add(new GuestTM(temp.getName(),temp.getContact(),temp.getEmail(),temp.getAddress(),temp.getNic(),temp.getRoomType(),temp.getPeople(),temp.getInDate(),temp.getOutDate(),btn,maintain,Integer.toString(number)));


            btn.setOnAction((e)->{
                guestList.remove(temp);
                loadData();
            });
            maintain.setOnAction((e)->{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/MaintainTable.fxml"));
                Parent parent = null;
                try {
                    parent = loader.load();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                MaintainTableController controller = (MaintainTableController) loader.getController();
                controller.loadData();
                Scene scene = new Scene(parent);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
                guestList.remove(temp);
            });
        }

        guesttbl.setItems(tmObservableList);

    }
}
