package controller;

import com.jfoenix.controls.JFXTextField;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.MealPlans;
import view.tm.MealPlansTM;


public class MealPlansFormController {
    public AnchorPane mealPlansContext;
    public JFXTextField txtMealPlan;
    public JFXTextField txtPriceForADay;
    public TableView<MealPlansTM> tblMealPlans;
    public TableColumn colMealPlans;
    public TableColumn colPriceForADay;
    public TableColumn colOption;

    public void initialize(){
        colMealPlans.setCellValueFactory(new PropertyValueFactory("mealPlan"));
        colPriceForADay.setCellValueFactory(new PropertyValueFactory("priceForDay"));
        colOption.setCellValueFactory(new PropertyValueFactory("btn"));

        loadAllMealPlans();

    }

    private void loadAllMealPlans(){
        ObservableList<MealPlansTM> obList= FXCollections.observableArrayList();
        for (MealPlans m: Database.mealPlansTable
             ) {
            Button btn = new Button("Delete");
            MealPlansTM tm=new MealPlansTM(m.getMealPlan(),m.getPriceForDay(),btn);
            obList.add(tm);
            btn.setOnAction((e)->{
                Database.mealPlansTable.remove(m);
                obList.remove(tm);
            });
            txtMealPlan.clear();
            txtPriceForADay.clear();
        }
        tblMealPlans.setItems(obList);
    }

    public void btnAddOnAction(ActionEvent actionEvent) {
        MealPlans m1=new MealPlans(
              txtMealPlan.getText(),
              txtPriceForADay.getText()
        );
        Database.mealPlansTable.add(m1);
        loadAllMealPlans();
    }
}
