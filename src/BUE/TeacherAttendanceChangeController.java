package BUE;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TeacherAttendanceChangeController {

    @FXML
    private Button ButtonBack;
    @FXML
    private Button ButtonSubmit;


    public void TeacherBackOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("TeacherAttendance.fxml"));
            Stage stage = (Stage) ButtonBack.getScene().getWindow();
            stage.setScene(new Scene(root, 660, 469));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void ButtonSubmitOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("TeacherAttendanceAfterChange.fxml"));
            Stage stage = (Stage) ButtonBack.getScene().getWindow();
            stage.setScene(new Scene(root, 660, 469));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

}
