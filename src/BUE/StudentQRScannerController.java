package BUE;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StudentQRScannerController {

    @FXML
    private Button BackButton;

    @FXML
    private Button EnterButton;

    public void BackButton (ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("StudentMain.fxml"));
            Stage stage = (Stage) BackButton.getScene().getWindow();
            stage.setScene(new Scene(root, 660, 469));
            stage.show();
        } catch (Exception e) {
            System.out.println("Fail");
        }
    }

    public void EnterButton (ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("StudentQRSuccess.fxml"));
            Stage stage = (Stage) EnterButton.getScene().getWindow();
            stage.setScene(new Scene(root, 660, 469));
            stage.show();
        } catch (Exception e) {
            System.out.println("Fail");
        }
    }
}
