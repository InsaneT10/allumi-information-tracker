package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class ControllerForSignIn {

    @FXML
    private TextField User_name;

    @FXML
    private TextField Password;

    @FXML
    private Button Clear_data;

    @FXML
    private Button SignIn;

    @FXML
    private Button SignUp;

    @FXML
    void handleCleearButton(ActionEvent event) {


    }

    @FXML
    void handleSignInButton(ActionEvent event) {
        String user_name = this.User_name.getText();
        String password  = this.Password.getText();
    }
    @FXML
    void handleSignUpButton(ActionEvent event) {

    }

}