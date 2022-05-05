package controller;

import com.jfoenix.controls.JFXTextField;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Guest;
import view.tm.GuestTM;

public class GuestDetailsFormController {
    public TableView <GuestTM>tblGuestDetails;
    public JFXTextField txtGuestName;
    public JFXTextField txtNic;
    public JFXTextField txtTelNo;
    public JFXTextField txtEmail;
    public JFXTextField txtAddress;
    public TableColumn colName;
    public TableColumn colNic;
    public TableColumn colTelNo;
    public TableColumn colEmail;
    public TableColumn colAddress;

    public void initialize(){

        colName.setCellValueFactory(new PropertyValueFactory("name"));
        colNic.setCellValueFactory(new PropertyValueFactory("nic"));
        colTelNo.setCellValueFactory(new PropertyValueFactory("telNo"));
        colEmail.setCellValueFactory(new PropertyValueFactory("email"));
        colAddress.setCellValueFactory(new PropertyValueFactory("address"));

        loadAllGuests();
    }

    private void loadAllGuests() {
        ObservableList<GuestTM> obList = FXCollections.observableArrayList();

        for (Guest g: Database.guestTable
             ) {
            GuestTM tm=new GuestTM(g.getName(),g.getNic(),g.getTelNo(),g.getEmail(),g.getAddress());
            obList.add(tm);
        }
        tblGuestDetails.setItems(obList);
    }


    public void btnSubmitOnAction(ActionEvent actionEvent) {
        Guest g1 =new Guest(
               txtGuestName.getText(),
               txtNic.getText(),
               txtTelNo.getText(),
               txtEmail.getText(),
               txtAddress.getText()
        );
        Database.guestTable.add(g1);
        loadAllGuests();
    }
}
