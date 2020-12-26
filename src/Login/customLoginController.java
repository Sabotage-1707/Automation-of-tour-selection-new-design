package Login;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class customLoginController extends VBox {
    public customLoginController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "customLogin.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
