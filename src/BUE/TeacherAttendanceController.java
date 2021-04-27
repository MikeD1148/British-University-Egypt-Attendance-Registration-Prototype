package BUE;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import javax.swing.*;
import java.io.File;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.Scanner;

public class TeacherAttendanceController {

    @FXML
    private Button ButtonTeacherExportPDF;
    @FXML
    private Button ButtonTeacherBack;
    @FXML
    private Button ButtonChange;
    @FXML
    private Button ButtonChange1;
    @FXML
    private Button ButtonChange2;
    @FXML
    private Button ButtonChange3;
    @FXML
    private Button ButtonChange4;
    @FXML
    private Button ButtonChange5;
    @FXML
    private Button ButtonChange6;
    @FXML
    private Button ButtonChange7;



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

    public void ButtonChangeOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("TeacherAttendanceChange.fxml"));
            Stage stage = (Stage) ButtonChange.getScene().getWindow();
            stage.setTitle("Hello World");
            stage.setScene(new Scene(root, 660, 469));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }








}
