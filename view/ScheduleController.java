package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.ModelInterface;

import java.awt.Desktop;
import java.net.URI;

public class ScheduleController {
    private ViewHandler viewHandler;
    private ModelInterface model;

    @FXML
    private Button astrid;
    @FXML
    private Button adresse; // Button for opening the address in Google Maps

    public void init(ViewHandler viewHandler, ModelInterface model) {

        this.viewHandler = viewHandler;
        this.model=model;
    }

    @FXML
    public void handleAstridClick(ActionEvent event) {
        if (event.getSource() == astrid) {
            viewHandler.openPatientView(); // Navigate to the Patient view
        }
    }

    @FXML
    public void handleAdresseClick(ActionEvent event) {
        String address = "Ole Bulls gate 17, 4630 Kristiansand, Norge"; // Address to open
        String formattedAddress = address.replace(" ", "+"); // Format for Google Maps URL
        String googleMapsUrl = "https://www.google.com/maps/search/?api=1&query=" + formattedAddress;

        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(new URI(googleMapsUrl)); // Open URL in the default browser
                System.out.println("Opened Google Maps for address: " + address);
            } else {
                System.out.println("Desktop functionality not supported.");
            }
        } catch (Exception ex) {
            System.err.println("Error opening Google Maps: " + ex.getMessage());
        }
    }
}
