package application;
	
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			
			Group root = new Group();
			Scene scene = new Scene(root, Color.BLACK);
			stage.setTitle("프로그램 제목");
			stage.setWidth(420);
			stage.setHeight(420);
			// stage.setX(100);
			// stage.setY(100);
			
			// 프로그램 아이콘 지정하기
			Image icon = new Image("icon.png");
			stage.getIcons().add(icon);
			
			// 리사이징 여부 지정하기
			stage.setResizable(false);
			
			// 전체화면 여부 지정하기
			stage.setFullScreen(true);
			// 전체화면 종료 키 설정
			stage.setFullScreenExitHint("전체 화면 종료 : (X 키를 누르세요)");
			stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("X"));

			// 스테이지에 set메소드를 이용해서 scene를 저장
			stage.setScene(scene);
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
