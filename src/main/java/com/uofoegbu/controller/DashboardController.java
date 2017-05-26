package com.uofoegbu.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Seamfix Nig Ltd on 25-May-17.
 */
public class DashboardController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void addTask(ActionEvent actionEvent) throws IOException{

        Stage addCourseStage = new Stage();
        Parent root = new FXMLLoader().load(getClass().getResourceAsStream("/com/uofoegbu/gui/view/add_task.fxml"));
        addCourseStage.setScene(new Scene(root));
        addCourseStage.setTitle("TIMELY");
        addCourseStage.setResizable(false);
        addCourseStage.show();
    }
}
