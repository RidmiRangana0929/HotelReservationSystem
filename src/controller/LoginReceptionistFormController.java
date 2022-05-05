package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginReceptionistFormController {
    public JFXPasswordField pwdPassword;
    public JFXTextField txtUsername;
    public AnchorPane loginReceptionistContext;

    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        String tempUsername = txtUsername.getText();
        String tempPassword = pwdPassword.getText();
        if(tempUsername.equals("def")&&tempPassword.equals("456")){
            setUi("HomePageReceptionistForm");
        }
        else {
            new Alert(Alert.AlertType.WARNING,"Login fail...! Check your username and password.").show();
            txtUsername.clear();
            pwdPassword.clear();
        }
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MainLoginForm");
    }
    private void setUi (String location) throws IOException {
        Stage stage = (Stage) loginReceptionistContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}
