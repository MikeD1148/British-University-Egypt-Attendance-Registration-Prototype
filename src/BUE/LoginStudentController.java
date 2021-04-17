package BUE;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginStudentController {

    @FXML
    private Button cancelButton;
    @FXML
    private Label errorMessage;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordTextField;


    public void cancelButtonOnAction (ActionEvent event){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void loginButtonOnAction (ActionEvent event)  {
        boolean errorCondition = true;
        if (errorCondition == true){
            errorMessage.setText("Invalid login, please try again");
        }
    }

    public void main (String args[]){

    }
}
