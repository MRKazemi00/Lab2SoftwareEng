package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    Label balance;

    @FXML
    Button LogIn;

    @FXML
    TextField username;

    @FXML
    PasswordField password;

    private void checkBalance(){
        if (username.getText() == /*username from database*/ && password.getText() == /*password from DB*/){
            balance.setText(/*balance from DB*/);
            LogIn.setVisible(false);
            username.setVisible(false);
            password.setVisible(false);
        }
    }


}
