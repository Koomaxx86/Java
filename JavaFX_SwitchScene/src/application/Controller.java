package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
	
	private Stage stage;
	private Scene scene;

	// 로그인 화면으로 가기
	public void switchToLogin(ActionEvent event) throws IOException {
//		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
//		scene = new Scene(root);
//		
//		// event 로 부터 씬을 가져오고, 씬으로 부터 스테이지 가져온다.
//		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//		stage.setScene(scene); 				// 로그인 씬로 지정
//		stage.show();						// 화면 출력
		switchScnene(event, "Login.fxml");
	}
	
	// 메인 화면으로 가기
	public void switchToMain(ActionEvent event) throws IOException {
//		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
//		scene = new Scene(root);
//		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//		stage.setScene(scene); 				// 메인 씬로 지정
//		stage.show();
		switchScnene(event, "main.fxml");
		
	}
	
	// 화면 이동
	public void switchScnene(ActionEvent event, String fxml) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource(fxml));
		scene = new Scene(root);
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene); 				
		stage.show();
}
}





