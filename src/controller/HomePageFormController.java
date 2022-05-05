package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class HomePageFormController {
    public AnchorPane homePageContext;

    public void continueOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MainLoginForm");
    }
    private void setUi (String location) throws IOException {
        Stage stage = (Stage) homePageContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}
