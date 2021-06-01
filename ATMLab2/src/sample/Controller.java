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
    Button logIn;

    @FXML
    TextField username;

    @FXML
    PasswordField password;

    @FXML
    private void checkBalance(){
        DBHandler dbHandler = new DBHandler();

        if (dbHandler.logIn(username.getText(),password.getText())){
            System.out.println("inmethod");
            balance.setText("Your balance: " + dbHandler.checkBalance(username.getText()) + " kr" );
            logIn.setVisible(false);
            username.setVisible(false);
            password.setVisible(false);
        }
    }


}
