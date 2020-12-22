package Controllers.UtilityControllers;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Abstract factory class for getting information
 * from a popup window.
 */
public abstract class PopUpBox {
    protected String title;

    public void drawWindow(String title, int width, int height){
        this.title = title;

        Stage stage = new Stage();
        stage.setTitle(title);

        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setSpacing(20);

        fillContent(layout, stage);

        stage.setScene(new Scene(layout, width, height));
        stage.showAndWait();
    }

    protected abstract void fillContent(VBox layout, Stage stage);
}
