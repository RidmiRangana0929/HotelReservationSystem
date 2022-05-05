package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HomePageAdminFormController {
    public AnchorPane homePageAdminContext;
    public AnchorPane homePageAdminMainContext;

    public void roomsOnAction(ActionEvent actionEvent) throws IOException {
        homePageAdminContext.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../view/RoomsForm.fxml"));
        homePageAdminContext.getChildren().add(parent);
    }

    public void mealPlansOnAction(ActionEvent actionEvent) throws IOException {
        homePageAdminContext.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../view/MealPlansForm.fxml"));
        homePageAdminContext.getChildren().add(parent);
    }

    public void incomeReportOnAction(ActionEvent actionEvent) throws IOException {
        homePageAdminContext.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../view/IncomeReportsForm.fxml"));
        homePageAdminContext.getChildren().add(parent);
    }
}
