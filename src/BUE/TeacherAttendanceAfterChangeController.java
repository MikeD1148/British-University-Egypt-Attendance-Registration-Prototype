package BUE;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TeacherAttendanceAfterChangeController {

    @FXML
    private Button ButtonTeacherExportPDF;
    @FXML
    private Button ButtonTeacherBack;

    public void TeacherBackOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("TeacherLecture.fxml"));
            Stage stage = (Stage) ButtonTeacherBack.getScene().getWindow();
            stage.setTitle("Hello World");
            stage.setScene(new Scene(root, 660, 469));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }


    public void TeacherExportOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("TeacherExport.fxml"));
            Stage stage = (Stage) ButtonTeacherExportPDF.getScene().getWindow();
            stage.setTitle("Hello World");
            stage.setScene(new Scene(root, 660, 469));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }



}
