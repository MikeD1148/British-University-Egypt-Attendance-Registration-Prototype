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
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import javax.swing.*;
import java.io.File;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.Scanner;

public class TeacherMainController {


    @FXML
    private Button ButtonTeacherMainLogout;

    public void ButtonTeacherMainLogoutOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LoginTeacher.fxml"));
            Stage stage = (Stage) ButtonTeacherMainLogout.getScene().getWindow();
            stage.setTitle("Hello World");
            stage.setScene(new Scene(root, 600, 400));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}
