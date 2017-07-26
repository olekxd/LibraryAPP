package pl.bolszowski.fxmvc.app;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class For_Tests extends Application {

	public For_Tests() {
		System.out.println("Constructor");
	}
	@Override
	public void start(Stage primaryStage) {
		System.out.println("Start");
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void init() throws Exception {
		System.out.println("Init");
	}

	@Override
	public void stop() throws Exception {
		System.out.println("Stop");
	}

}
