package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
	
	@FXML
	private AnchorPane scenePane;
	
	@FXML
	private Button exitButton;
	
	Stage stage;
	
	
	public void exit(ActionEvent event) {
		System.out.println("종료 버튼 클릭...");
		
		// 경고창
		Alert alert =new Alert(AlertType.CONFIRMATION);
		alert.setTitle("프로그램 종료");
		alert.setHeaderText("정말로 종료하시겠습니까?");
		alert.setContentText("프로그램이 종료됩니다.");
		
		// [확인] 클릭 시
		if( alert.showAndWait().get() == ButtonType.OK ) {
			System.out.println("프로그램을 종료합니다.");
			stage = (Stage) scenePane.getScene().getWindow();
			stage.close();
//			System.exit(0);
		}
		
	}
	

}
