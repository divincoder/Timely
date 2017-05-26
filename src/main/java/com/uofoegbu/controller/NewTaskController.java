package com.uofoegbu.controller;

import com.uofoegbu.model.DatabaseUtil;
import com.uofoegbu.model.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.Date;


public class NewTaskController {
    @FXML
    public DatePicker datePicker;
    @FXML
    private TextField txtTitle;
    @FXML
    private TextArea txtDetails;

    @FXML
    private void saveCourse(ActionEvent actionEvent) {
        Task task = new Task(txtTitle.getText(), txtDetails.getText(), Date.valueOf(datePicker.getValue()));
        DatabaseUtil.saveTask(task);
    }

    @FXML
    private void cancel(ActionEvent actionEvent) {
    }
}
