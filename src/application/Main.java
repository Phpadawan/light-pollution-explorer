package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            SceneManager sceneManager = new SceneManager(primaryStage);

            // --- Data + controls ---
            ArrayList<City> cities = CityData.getCities();
            ComboBox<City> cityDropdown = new ComboBox<>();
            cityDropdown.getItems().addAll(cities);

            // --- Home layout ---
            VBox homeBox = new VBox(10);
            homeBox.setStyle("-fx-alignment: center; -fx-padding: 20;");

            Label selectLabel = new Label("Select a city to see its sky quality:");
            Button exploreButton = new Button("Explore");

            homeBox.getChildren().addAll(cityDropdown, exploreButton, selectLabel);

            Scene homeScene = new Scene(homeBox, 400, 400);

            // --- Explore button action ---
            exploreButton.setOnAction(e -> {
                City selectedCity = cityDropdown.getValue();
                if (selectedCity != null) {

                    VBox resultsBox = new VBox(10);
                    resultsBox.setStyle("-fx-alignment: center; -fx-padding: 20;");

                    Label cityLabel = new Label(selectedCity.getName());
                    cityLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 16px;");

                    Label bortleLabel = new Label("Bortle Level: " + selectedCity.getBortleLevel());

                    // Star visualization: lower Bortle = more stars
                    int stars = Math.max(6 - selectedCity.getBortleLevel(), 0);
                    Label starsLabel = new Label("⭐".repeat(stars));

                    Label descriptionLabel = new Label(selectedCity.getDescription());
                    descriptionLabel.setWrapText(true);
                    descriptionLabel.setMaxWidth(300);

                    Button backButton = new Button("Back");
                    backButton.setOnAction(ev -> sceneManager.switchScene(homeScene, "Light Pollution Explorer"));

                    resultsBox.getChildren().addAll(cityLabel, bortleLabel, starsLabel, descriptionLabel, backButton);

                    Scene resultsScene = new Scene(resultsBox, 400, 400);
                    sceneManager.switchScene(resultsScene, "Results");
                    
                    
                 // Home labels/buttons
                    selectLabel.getStyleClass().add("label");
                    exploreButton.getStyleClass().add("button");

                    // Results labels/buttons
                    cityLabel.getStyleClass().add("label");
                    bortleLabel.getStyleClass().add("label");
                    starsLabel.getStyleClass().add("result");
                    descriptionLabel.getStyleClass().add("label");
                    backButton.getStyleClass().add("button");
                    
                    
                    
                }
            });

            // --- Show home scene ---
            sceneManager.switchScene(homeScene, "Light Pollution Explorer");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}