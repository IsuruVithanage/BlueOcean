package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.User;
import view.tm.UserTM;

import static controller.SignUpWindowController.userList;

public class UserTableController {
    public TableView<UserTM> usertbl;
    public TableColumn coluserName;
    public TableColumn colemail;
    public TableColumn colpassword;
    public TableColumn colcontact;
    public TableColumn colroll;
    public TableColumn coldelete;


    public void initialize(){
        coluserName.setCellValueFactory(new PropertyValueFactory<>("username"));
        colemail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colpassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        colcontact.setCellValueFactory(new PropertyValueFactory<>("contact"));
        colroll.setCellValueFactory(new PropertyValueFactory<>("roll"));
        coldelete.setCellValueFactory(new PropertyValueFactory<>("btn"));
    }

    public void loadData(){
        ObservableList<UserTM> tmObservableList = FXCollections.observableArrayList();
        for (User temp:userList
        ) {
            Button btn = new Button("Delete");
            tmObservableList.add(new UserTM(temp.getName(),temp.getEmail(),temp.getPassword(),temp.getContact(),temp.getRoll(),btn));

            btn.setOnAction((e)->{
                userList.remove(temp);
                loadData();
            });
        }
        usertbl.setItems(tmObservableList);

    }

}
