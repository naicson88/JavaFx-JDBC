package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Scene mainScene;
	
	@Override
	public void start(Stage stage) {
		try {
			ScrollPane parent = FXMLLoader.load(getClass().getResource("/gui/MainView.fxml"));
			
			parent.setFitToHeight(true);
			parent.setFitToWidth(true);
			
			mainScene = new Scene(parent);
			stage.setScene(mainScene);
			stage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Scene getMainScene() {
		return mainScene;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
