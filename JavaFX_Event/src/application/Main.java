package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


public class Main extends Application {
	
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			// 키보드 입력 시, 호출할 메소드 지정  (람다식)
			// scene.setOnKeyPressed((KeyEvent event) -> {
			//	KeyCode keyCode = event.getCode();
			//	System.out.println(keyCode);
			// });
			
			// 키보드 입력 시, 호출할 메소드 지정  (메소드 레퍼런스)
			scene.setOnKeyPressed( this::keyPress );
			
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void keyPress(KeyEvent event) {
		KeyCode keyCode = event.getCode();
		System.out.println(keyCode);
	}
}
