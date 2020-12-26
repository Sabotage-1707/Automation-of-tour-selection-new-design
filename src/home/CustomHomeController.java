package home;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class CustomHomeController extends BorderPane {
    public CustomHomeController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "customHome.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
    @FXML
    public void OnButtonClick(){
        System.out.println("You clicked me!");
    }
}
