package BUE;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainPageController {

    @FXML
    private Button ButtonTeacher;
    @FXML
    private Button ButtonStudent;

    public void ButtonTeacherOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LoginTeacher.fxml"));
            Stage stage = (Stage) ButtonTeacher.getScene().getWindow();
            stage.setScene(new Scene(root, 660, 469));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void ButtonStudentOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LoginStudent.fxml"));
            Stage stage = (Stage) ButtonStudent.getScene().getWindow();
            stage.setScene(new Scene(root, 660, 469));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }



}
