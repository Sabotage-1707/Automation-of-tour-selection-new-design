package sample;

import home.CustomHomeController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.awt.event.ActionEvent;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        CustomController customControl = new CustomController();
        CustomHomeController home = new CustomHomeController();
        customControl.setCenter(home);
        primaryStage.setScene(new Scene(customControl));
        primaryStage.setMaximized(true);
        primaryStage.setTitle("Main");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
