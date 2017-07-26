package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class MainController implements Initializable {

    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button lowerCaseButton;
    //----------------------------------------------------------------------------------------
	//	Pierwsza metoda
    //    @Override
	//	public void initialize(URL location, ResourceBundle resources) {
	//		lowerCaseButton.setOnAction(new EventHandler<ActionEvent>() {
	//
	//			@Override
	//			public void handle(ActionEvent event) {
	//				System.out.println("Generate an event " + event.getEventType());
	//				String text = mainTextArea.getText();
	//				mainTextArea.setText(text.toLowerCase());
	//			}
	//		});
		//---------------------------------------------------------------------------------------------
		/*Druga metoda
		 *  EventHandler to interfejs funkcyjny dlatego mozna w javie 8 przekazac wyrazenie lambda
		 * @Override
		 * public void initialize(URL location, RecourceBundle resources){
		 * 		lowerCaseButton.setOnAction(x -> mainTextArea.setText(mainTextArea.getText().toLowerCase()));
		 * 	}
		 *
		 * */
    //------------------------------------------------------------------
    //Trzecia metoda

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		lowerCaseButton.addEventFilter(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("New event was generated " + event.getEventType());
				String text = mainTextArea.getText();
				mainTextArea.setText(text.toLowerCase());


			}
		});

		lowerCaseButton.addEventFilter(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				System.out.println("Mausclick incoming!");

			}
		});





	}



}
