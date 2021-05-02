package BUE;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TeacherQRGenerateController {

    @FXML
    private Button ButtonFinish;

    public void ButtonFinishOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("TeacherLecture.fxml"));
            Stage stage = (Stage) ButtonFinish.getScene().getWindow();
            stage.setScene(new Scene(root, 660, 469));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}
