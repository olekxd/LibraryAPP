package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartPanel extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent parent = (Parent)FXMLLoader.load(getClass().getResource("/view/MainPanel.fxml"));
		Scene scene = new Scene(parent);
//		scene.addEventFilter(KeyEvent.KEY_PRESSED, x -> System.out.println("Wcisnieto przycisk"));
//		scene.addEventFilter(KeyEvent.KEY_RELEASED, x -> System.out.println("Zwolniony przycisk"));
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main (String[] args){
		launch(args);
	}


}
