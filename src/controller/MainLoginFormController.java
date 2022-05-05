package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class MainLoginFormController {
    public AnchorPane mainLoginContext;

    public void adminOnAction(ActionEvent actionEvent) throws IOException {
        setUi("LoginAdminForm");

    }

    public void receptionistOnAction(ActionEvent actionEvent) throws IOException {
        setUi("LoginReceptionistForm");
    }
    public void setUi (String location) throws IOException {
        Stage stage = (Stage) mainLoginContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}
