package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class HomePageReceptionistFormController {
    public AnchorPane homePageReceptionistContext;
    public AnchorPane homePageReceptionistMainContext;


    public void roomAvailabilityOnAction(ActionEvent actionEvent) throws IOException {
        homePageReceptionistContext.getChildren().clear();
        Parent parent=FXMLLoader.load(getClass().getResource("../view/CheckRoomAvailabilityForm.fxml"));
        homePageReceptionistContext.getChildren().add(parent);
    }

    public void mealPlansOnAction(ActionEvent actionEvent) throws IOException {
        homePageReceptionistContext.getChildren().clear();
        Parent parent=FXMLLoader.load(getClass().getResource("../view/SelectMealPlanForm.fxml"));
        homePageReceptionistContext.getChildren().add(parent);
    }

    public void guestDetailsOnAction(ActionEvent actionEvent) throws IOException {
        homePageReceptionistContext.getChildren().clear();
        Parent parent=FXMLLoader.load(getClass().getResource("../view/GuestDetailsForm.fxml"));
        homePageReceptionistContext.getChildren().add(parent);
    }
}
