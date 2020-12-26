package sample;

import Login.customLoginController;
import Registration.CustomRegistrationController;
import home.CustomHomeController;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class CustomController extends BorderPane {

    @FXML
    private CustomController manePane;

    @FXML
    private TextField searchBox;

    public CustomController()
    {
        try
        {
            FXMLLoader loader = new  FXMLLoader( getClass().getResource("customMain.fxml"));

            loader.setRoot( this );
            loader.setController( this );

            loader.load();

        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    @FXML
    protected void OnButtonClick(){
        System.out.println("You clicked me!");
    }


    @FXML
    protected void goLogin() {
        manePane.setCenter(new customLoginController());
    }
    @FXML
    protected void doSomething() {
        manePane.setCenter(new HBox());
    }
    @FXML
    protected void goHome() {
        manePane.setCenter(new CustomHomeController());
    }
    @FXML
    protected void goRegister() {
        manePane.setCenter(new CustomRegistrationController());
    }

}
