package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Guest;
import view.tm.GuestTM;

import static controller.GuestDataController.guestList;

public class MaintainTableController {
    public TableView<GuestTM> maintaintbl;
    public TableColumn colNo;
    public TableColumn colName;
    public TableColumn colContact;
    public TableColumn colEmail;
    public TableColumn colDelet;

    public void initialize(){
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("contact"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colDelet.setCellValueFactory(new PropertyValueFactory<>("del"));
        colNo.setCellValueFactory(new PropertyValueFactory<>("roomNo"));

    }

    public void loadData(){
        ObservableList<GuestTM> tmObservableList = FXCollections.observableArrayList();
        for (Guest temp:guestList
        ) {
            Button btn = new Button("Delete");
            Button maintain = new Button("Maintain");
            tmObservableList.add(new GuestTM(temp.getName(),temp.getContact(),temp.getEmail(),temp.getAddress(),temp.getNic(),temp.getRoomType(),temp.getPeople(),temp.getInDate(),temp.getOutDate(),btn,maintain,Integer.toString(1)));


            btn.setOnAction((e)->{
                guestList.remove(temp);
                loadData();
            });
        }

        maintaintbl.setItems(tmObservableList);

    }
}
