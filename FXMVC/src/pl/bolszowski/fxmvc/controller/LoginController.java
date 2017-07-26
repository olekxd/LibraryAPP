package pl.bolszowski.fxmvc.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

	public class LoginController implements Initializable{

	    @FXML
	    private AnchorPane loginAnchorPane;

	    @FXML
	    private TextField loginButton;

	    @FXML
	    private Button usernameLabel;

	    @FXML
	    private Label usernameTextField;

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			System.out.println(usernameLabel.getText());
			usernameTextField.setText("Write here your name");

		}




}
