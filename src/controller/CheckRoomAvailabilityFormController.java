package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.BookedRooms;

public class CheckRoomAvailabilityFormController {
    public AnchorPane checkRoomAvailabilityContext;
    public TableView<BookedRooms> tblBookedRooms;
    public JFXComboBox<String> cmbRoomType;
    public JFXTextField txtPrice;
    public JFXComboBox<String> cmbRoomNo;
    public TableColumn colRoomType;
    public TableColumn colRoomNo;
    public TableColumn colPrice;

    public void initialize(){
        cmbRoomType.getItems().add("Single");
        cmbRoomType.getItems().add("Double");
        cmbRoomType.getItems().add("Triple");
        cmbRoomType.getItems().add("Quad");
        cmbRoomNo.getItems().add("Room No.01(Single)");
        cmbRoomNo.getItems().add("Room No.02(Single)");
        cmbRoomNo.getItems().add("Room No.03(Single)");
        cmbRoomNo.getItems().add("Room No.04(Single)");
        cmbRoomNo.getItems().add("Room No.05(Single)");
        cmbRoomNo.getItems().add("Room No.06(Single)");

        cmbRoomNo.getItems().add("Room No.07(Double)");
        cmbRoomNo.getItems().add("Room No.08(Double)");
        cmbRoomNo.getItems().add("Room No.09(Double)");
        cmbRoomNo.getItems().add("Room No.10(Double)");
        cmbRoomNo.getItems().add("Room No.11(Double)");
        cmbRoomNo.getItems().add("Room No.12(Double)");
        cmbRoomNo.getItems().add("Room No.13(Double)");

        cmbRoomNo.getItems().add("Room No.14(Triple)");
        cmbRoomNo.getItems().add("Room No.15(Triple)");
        cmbRoomNo.getItems().add("Room No.16(Triple)");
        cmbRoomNo.getItems().add("Room No.17(Triple)");
        cmbRoomNo.getItems().add("Room No.18(Triple)");
        cmbRoomNo.getItems().add("Room No.19(Triple)");

        cmbRoomNo.getItems().add("Room No.20(Quad)");
        cmbRoomNo.getItems().add("Room No.21(Quad)");
        cmbRoomNo.getItems().add("Room No.22(Quad)");
        cmbRoomNo.getItems().add("Room No.23(Quad)");
        cmbRoomNo.getItems().add("Room No.24(Quad)");
        cmbRoomNo.getItems().add("Room No.25(Quad)");

        colRoomType.setCellValueFactory(new PropertyValueFactory("roomType"));
        colRoomNo.setCellValueFactory(new PropertyValueFactory("roomNo"));
        colPrice.setCellValueFactory(new PropertyValueFactory("price"));

        loadAllBookedRooms();
    }


    public void btnBookOnAction(ActionEvent actionEvent){
        BookedRooms b1=new BookedRooms(
                cmbRoomType.getValue(),
                cmbRoomNo.getValue(),
                txtPrice.getText()
        );
        Database.bookedRoomsTable.add(b1);
        loadAllBookedRooms();
    }
    private void loadAllBookedRooms() {
        ObservableList<BookedRooms> obList = FXCollections.observableArrayList();

        for (BookedRooms b: Database.bookedRoomsTable
        ) {
            BookedRooms tm= new BookedRooms(b.getRoomType(),b.getRoomNo(),b.getPrice());
            obList.add(tm);
        }
        tblBookedRooms.setItems(obList);
    }

    public void btnGetPriceOnAction(ActionEvent actionEvent) {
        if(cmbRoomType.getValue().equals("Single")){
            txtPrice.setText("LKS 17,500");
        }
        else if (cmbRoomType.getValue().equals("Double")){
            txtPrice.setText("LKS 18,500");
        }
        else if (cmbRoomType.getValue().equals("Triple")){
            txtPrice.setText("LKS 19,500");
        }
        else if (cmbRoomType.getValue().equals("Quad")){
            txtPrice.setText("LKS 20,500");
        }
    }
}
