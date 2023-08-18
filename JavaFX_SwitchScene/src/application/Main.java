package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

	public Main() {
		System.out.println( Thread.currentThread().getName() + " - Main()" );
	}
	
	// JavaFX 애플리케이션이 화면UI 작업이 아닌 초기화 작업을 진행
	@Override
	public void init() throws Exception {
		super.init();
		System.out.println( Thread.currentThread().getName() + " - init()" );
	}

	@Override
	public void stop() throws Exception {
		super.stop();
		System.out.println( Thread.currentThread().getName() + " - stop()" );
	}

	// JavaFX 애플리케이션에 대한 화면UI를 생성하는 작업을 진행
	@Override
	public void start(Stage stage) {
		System.out.println( Thread.currentThread().getName() + " - start()" );
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println( Thread.currentThread().getName() + " - main()" );
		launch(args);
	}
}
