package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller implements Initializable {
	
    @FXML
    private Label itemLabel;

    @FXML
    private ListView<String> listView;
    
    String[] menuList = {"아메리카노","카페라떼","헤이즐넛"};
    String selectedItem;
    
    Stage stage;
    Scene scene;
    Parent root;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// 데이터를 리스트뷰에 추가
		listView.getItems().addAll(menuList);
		
		// 마우스 클릭 이벤트
		listView.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				
				// 더블 클릭 이벤트
				if( event.getClickCount() == 2 ) {
					System.out.println("더블 클릭!!");
					
					selectedItem = listView.getSelectionModel().getSelectedItem();
					itemLabel.setText(selectedItem);
					
					System.out.println("선택한 아이템 : " + selectedItem);
					
					stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
					
					// 메뉴 아이템의 번호 넘기기
					// 아메리카노(0)
					// 카페라떼(1)
					// 헤이즐넛(2)
					int index = listView.getSelectionModel().getSelectedIndex();
					// Sub 씬을 가져오기
					FXMLLoader loader = new FXMLLoader(getClass().getResource("Sub.fxml"));
					
					try {
						root = loader.load();		// load() 메소드를 호출해야 loader 에 Sub 씬 인스턴스를 가져온다.
													// 호출해야 Controller 도 null 이 되지 않는다
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					// Sub.fxml 에 연결된 SubController 가져오기
					SubController subController =  loader.getController();
					
					if( subController != null) {
						// inputItemIndex 메소드 정의
						subController.inputItemIndex(index);
					}
					
					// 화면 이동
					switchScnene(stage, root, "Sub.fxml");
				}
				
				
			}
			
		});
		
		// 리스트뷰 아이템 선택 이벤트 
		listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				
				// 현재 선택한 아이템을 itemLabel 텍스트로 지정
				selectedItem = listView.getSelectionModel().getSelectedItem();
				itemLabel.setText(selectedItem);
				
			}
			
			
		});
		
		
	}
	
	
	// 화면 이동
	public void switchScnene(Stage stage, Parent root, String fxml) {
		
//		try {
//			FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
//			Parent root = loader.load();
			scene = new Scene(root);
			stage.setScene(scene); 				
			stage.show();
//		} catch (IOException e) {
//			System.err.println("화면 이동을 할 수 없습니다.");
//			e.printStackTrace();
//		}
	}
    

}










