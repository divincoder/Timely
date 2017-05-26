package com.uofoegbu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {

        this.primaryStage = primaryStage;
        initialize();

    }

    private void initialize(){
        try{
            FXMLLoader loader = new FXMLLoader();
            Parent root = loader.load(App.class.getResourceAsStream("/com/uofoegbu/gui/view/login_screen.fxml"));
            primaryStage.setScene(new Scene(root));
            primaryStage.setTitle("ToDo");
            primaryStage.setResizable(false);
            primaryStage.show();

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String []args){
        launch(args);
    }
}
