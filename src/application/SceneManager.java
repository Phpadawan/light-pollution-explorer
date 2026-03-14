package application;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {

    private Stage stage;

    public SceneManager(Stage stage) {
        this.stage = stage;
    }

    public void switchScene(Scene scene, String title) {
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }
}