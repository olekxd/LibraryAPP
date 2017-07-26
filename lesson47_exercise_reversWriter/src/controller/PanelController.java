package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class PanelController implements Initializable{


    @FXML
    private TextArea inputArea;

    @FXML
    private Button clearButton;

    @FXML
    private TextArea outputArea;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
			inputArea.addEventFilter(KeyEvent.KEY_RELEASED, x -> outputArea
					.setText(new StringBuilder(inputArea.getText()).reverse().toString()));

			outputArea.addEventFilter(KeyEvent.KEY_RELEASED, x -> inputArea
					.setText(new StringBuilder(outputArea.getText()).reverse().toString()));
			clearButton.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					inputArea.clear();
					outputArea.clear();

				}
			});
	}

}
