package controller;

import com.jfoenix.controls.JFXTextField;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.MealPlans;
import model.Rooms;
import view.tm.MealPlansTM;
import view.tm.RoomsTM;

public class RoomsFormController {
    public JFXTextField txtRoomType;
    public JFXTextField txtRoomNo;
    public TableView<RoomsTM> tblRooms;
    public TableColumn colRoomType;
    public TableColumn colRoomNo;
    public TableColumn colOption;


    public void initialize(){
        colRoomType.setCellValueFactory(new PropertyValueFactory("roomType"));
        colRoomNo.setCellValueFactory(new PropertyValueFactory("roomNo"));
        colOption.setCellValueFactory(new PropertyValueFactory("btn"));

        loadAllRooms();

    }

    private void loadAllRooms(){
        ObservableList<RoomsTM> obList= FXCollections.observableArrayList();
        for (Rooms r: Database.roomsTable
        ) {
            Button btn = new Button("Delete");
            RoomsTM tm=new RoomsTM(r.getRoomType(),r.getRoomNo(),btn);
            obList.add(tm);
            btn.setOnAction((e)->{
                Database.roomsTable.remove(r);
                obList.remove(tm);
            });
            txtRoomType.clear();
            txtRoomNo.clear();
        }
        tblRooms.setItems(obList);
    }

    public void btnAddOnAction(ActionEvent actionEvent) {
        Rooms r1=new Rooms(
                txtRoomType.getText(),
                txtRoomNo.getText()
        );
        Database.roomsTable.add(r1);
        loadAllRooms();
    }
}
