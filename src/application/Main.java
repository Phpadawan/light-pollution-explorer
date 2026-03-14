package application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	    try {
	        BorderPane root = new BorderPane();

	        Label label = new Label("JavaFX is working! 🎉");
	        Button button = new Button("Click me");

	        button.setOnAction(e -> {
	            label.setText("Button clicked!");
	        });

	        VBox box = new VBox(10);
	        box.getChildren().addAll(label, button);
	        box.setStyle("-fx-alignment: center; -fx-padding: 20;");

	        root.setCenter(box);

	        Scene scene = new Scene(root,400,400);
	        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

	        primaryStage.setScene(scene);
	        primaryStage.setTitle("JavaFX Test");
	        primaryStage.show();

	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void main(String[] args) {
		launch(args);
		
		
		
		
	}
}
