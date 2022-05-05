package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginAdminFormController {
    public AnchorPane loginAdminContext;
    public JFXTextField txtUsername;
    public Label lblerror;
    public JFXPasswordField pwdPassword;

    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        AdminLoginFormManage();
    }
    private void setUi (String location) throws IOException {
        Stage stage = (Stage) loginAdminContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }

    private void AdminLoginFormManage() throws IOException {
        String user = "abc";
        String password = "1234";
        if(txtUsername.getText().equals(user) && pwdPassword.getText().equals(password)){
            Stage window = (Stage) loginAdminContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HomePageAdminForm.fxml"))));
        }else{
            new Alert(Alert.AlertType.WARNING,"Login fail...! Check your username and password.").show();
            txtUsername.clear();
            pwdPassword.clear();
        }
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MainLoginForm");
    }
}
