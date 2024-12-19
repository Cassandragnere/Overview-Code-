package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.ModelInterface;

public class LoginController {
    private ViewHandler viewHandler;
    private ModelInterface model; // Reference to the model
    @FXML Button login;
    @FXML private TextField username;
    @FXML private TextField password;


    public void init(ViewHandler viewHandler, ModelInterface model) {
        this.viewHandler = viewHandler;
        this.model=model;
    }
    public void handleLogin(ActionEvent event) {

        if (viewHandler.getModel().login(username.getText().trim(), password.getText().trim())) {
            viewHandler.openScheduleView();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Failed");
            alert.setHeaderText(null);
            alert.setContentText("Invalid username or password. Please try again.");
            alert.showAndWait();
    }

}}
