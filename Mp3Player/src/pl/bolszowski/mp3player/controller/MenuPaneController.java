package pl.bolszowski.mp3player.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

public class MenuPaneController implements Initializable {


    @FXML
    private MenuItem aboutMenuItem;

    @FXML
    private MenuItem fileMenuItem;

    @FXML
    private MenuItem closeMenuItem;

    @FXML
    private MenuItem dirMenuItem;


    @FXML
    private Menu fileMenu;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
}
