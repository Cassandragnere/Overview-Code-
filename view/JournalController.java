package view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.ModelInterface;

public class JournalController {

    private ModelInterface model;
    @FXML
    private TextField nameField;

    private ViewHandler viewHandler;

    public void init(ViewHandler viewHandler) {
        this.viewHandler = viewHandler;


    }
}
