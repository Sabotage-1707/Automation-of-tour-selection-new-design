package Tours;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class customToursController extends BorderPane {

    public customToursController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "customTours.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
