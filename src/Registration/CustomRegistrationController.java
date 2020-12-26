package Registration;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class CustomRegistrationController extends BorderPane {
    public CustomRegistrationController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "customRegistration.fxml"));
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
        System.out.println("Register");
    }
}
