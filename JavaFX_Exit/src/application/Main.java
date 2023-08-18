package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
			
			// 닫기 버튼 X 클릭 시, exit() 메소드 호출되도록 지정
			stage.setOnCloseRequest( event -> {
				event.consume();		// 기존 이벤트(프로그램 종료)를 제거. consume "소멸시키다"
				exit(stage);
			});
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void exit(Stage stage) {
		// 경고창
		Alert alert =new Alert(AlertType.CONFIRMATION);
		alert.setTitle("프로그램 종료");
		alert.setHeaderText("정말로 종료하시겠습니까?");
		alert.setContentText("프로그램이 종료됩니다.");
		
		// [확인] 클릭 시
		if( alert.showAndWait().get() == ButtonType.OK ) {
			System.out.println("프로그램을 종료합니다.");
			stage.close();
//			System.exit(0);
		}
	}
}











