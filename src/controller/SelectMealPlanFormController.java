package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.SelectedMealPlans;
import view.tm.SelectedMealPlansTM;

public class SelectMealPlanFormController {
    public JFXComboBox<String> cmbMealPlan;
    public JFXTextField txtLunches;
    public JFXTextField txtDinners;
    public JFXTextField txtPrice;
    public TableView tblSelectedMealPlans;
    public TableColumn colMealPlan;
    public TableColumn colBreakfasts;
    public TableColumn colLunches;
    public TableColumn colDinners;
    public TableColumn colPrice;
    public JFXTextField txtBreakfasts;

    private void loadAllSelectedMealPlans() {
        ObservableList<SelectedMealPlansTM> obList = FXCollections.observableArrayList();

        for (SelectedMealPlans m: Database.selectedMealPlans
        ) {
            SelectedMealPlansTM tm=new SelectedMealPlansTM(m.getMealPlan(),m.getBreakfasts(),m.getLunches(),m.getDinners(),m.getPrice());
            obList.add(tm);
        }
        tblSelectedMealPlans.setItems(obList);
    }

    public void initialize(){
        cmbMealPlan.getItems().add("Local Meals");
        cmbMealPlan.getItems().add("Chinese Meals");
        cmbMealPlan.getItems().add("French Meals");


        loadAllSelectedMealPlans();
    }

    public void btnSelectOnAction(ActionEvent actionEvent) {

    }

    public void getPriceOnAction(ActionEvent actionEvent) {

    }
}
