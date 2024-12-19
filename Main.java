import javafx.application.Application;
import javafx.stage.Stage;
import model.ModelInterface;
import model.ModelManager;
import view.ViewHandler;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Initialize the model
        ModelInterface model = generateModel();

        // Initialize the view handler and show the initial Login view
        ViewHandler viewHandler = new ViewHandler(primaryStage, model);
        viewHandler.openLoginView();
    }

    public static void main(String[] args) {
        Application.launch(Main.class); // Launch the JavaFX application
    }

    private ModelInterface generateModel() {
        // Create and populate the model
        ModelManager model = new ModelManager();
        model.createUser(0, "Flemming", "1234", "Good guy");
        return model;
    }
}
