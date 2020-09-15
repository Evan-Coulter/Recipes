import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("/Templates/home_page.fxml"));
        primaryStage.setTitle("Recipes");
        primaryStage.setScene(new Scene(parent, 500, 350));
        primaryStage.show();
    }
}