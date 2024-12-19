package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.ModelInterface;

public class PatientController {
    private ViewHandler viewHandler;
    private ModelInterface model;

    @FXML
    private Button avslutt;
    @FXML
    private Button journal; //

    public void init(ViewHandler viewHandler, ModelInterface model) {
        this.viewHandler = viewHandler;
        this.model=model;
    }

    @FXML
    public void handleAvsluttClick() {
        viewHandler.openScheduleView(); // Navigate back to the Schedule view
    }

    @FXML
    public void handleJournalClick() {
        viewHandler.openJournalView(); // Navigate to the Journal view
    }
}
