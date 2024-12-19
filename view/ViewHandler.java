package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ModelInterface;

import java.io.IOException;

public class ViewHandler {

    private Stage primaryStage; // Main application stage
    private Scene loginScene;
    private Scene scheduleScene;
    private Scene patientScene;
    private Scene JournalScene;

    private ModelInterface model;
    public ViewHandler(Stage primaryStage, ModelInterface model) {
        this.primaryStage = primaryStage;
        this.model=model;
    }

    public ModelInterface getModel() {
        return model;
    }

    /**
     * Opens the Login view.
     *
     */
    public void openLoginView() {
        if (loginScene == null) {
            try {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/LogIn.fxml"));
                loginScene = new Scene(loader.load());


                LoginController loginController = loader.getController();
                loginController.init(this,model);

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Failed to load LoginView.fxml");
                return;
            }
        }
        primaryStage.setScene(loginScene);
        primaryStage.setTitle("Login");
        primaryStage.show();
    }

    /**
     * Opens the Schedule view.
     */
    public void openScheduleView() {
        if (scheduleScene == null) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Schedule.fxml"));
                scheduleScene = new Scene(loader.load());

                // Initialize controller
                ScheduleController controller = loader.getController();
                controller.init(this, model); // Pass the ViewHandler instance to the init method

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Failed to load Schedule.fxml");
                return;
            }
        }
        primaryStage.setScene(scheduleScene);
        primaryStage.setTitle("Schedule");
        primaryStage.show();
    }


    /**
     * Opens the Patient view.
     */
    public void openPatientView() { //openPatientView
        if (patientScene == null) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Patient.fxml"));//"Patient.fxml
                patientScene = new Scene(loader.load());//patientScene

                // Initialize controller
                PatientController controller = loader.getController();
                controller.init(this,model);

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Failed to load PatientView.fxml");
                return;
            }
        }
        primaryStage.setScene(patientScene);
        primaryStage.setTitle("Patients");
        primaryStage.show();
    }

    /**
     * Opens the Journal view.
     */
    public void openJournalView() {
        Scene journalScene;
        try {
            // Load the FXML file
            System.out.println("Loading Journal.fxml...");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Journal.fxml"));
            journalScene = new Scene(loader.load());

            // Retrieve and initialize the controller
            JournalController controller = loader.getController();
            System.out.println("Controller loaded: " + controller); // Debugging log
            if (controller == null) {
                throw new IllegalStateException("Failed to load JournalController. Check fx:controller in FXML.");
            }
            controller.init(this); // Initialize the controller with the ViewHandler instance

            // Set the scene to the primary stage
            primaryStage.setScene(journalScene);
            primaryStage.setTitle("Journal");
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to load Journal.fxml. Verify the file path and syntax.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("An unexpected error occurred while opening the Journal view.");
        }
    }


}
