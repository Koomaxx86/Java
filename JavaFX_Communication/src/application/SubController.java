package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class SubController {
	
	@FXML
	TextArea areaName;
	
	public void printName(String name) {
		areaName.setText(name);
	}

}
