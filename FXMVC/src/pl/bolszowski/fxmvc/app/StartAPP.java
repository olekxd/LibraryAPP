package pl.bolszowski.fxmvc.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartAPP extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/pl/bolszowski/fxmvc/view/For_Tests.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Login Page");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}



}
