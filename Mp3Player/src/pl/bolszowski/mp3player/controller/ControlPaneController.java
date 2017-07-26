package pl.bolszowski.mp3player.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;

public class ControlPaneController implements Initializable {

    @FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider songSlider;

    @FXML
    private Button prevButton;

    @FXML
    private ToggleButton playButton;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		configureButtons();
		configureSliders();

	}

	private void configureSliders() {
		volumeSlider.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				System.out.println("Volume changed: " + newValue.doubleValue());
			}
		});

		songSlider.valueProperty().addListener(x -> System.out.println("Move track forward"));
	}

//	private void configureVolume() {
//		volumeSlider.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
//
//			@Override
//			public void handle(MouseEvent event) {
//				System.out.println("Volume slider pressed");
//
//			}
//		});
//	}

	private void configureButtons() {
		prevButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("Previous song");

			}
		});
		nextButton.setOnAction(x -> System.out.println("Next song"));
		playButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (playButton.isSelected()) {
					System.out.println("Play");
				} else {
					System.out.println("Stop");
				}

			}
		});
	}
}
