package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SubController implements Initializable {
	
    @FXML 
    TextField textName;
    @FXML 
    TextField textPrice;
    @FXML 
    TextArea textDescription;
	
	List<Menu> menuList = new ArrayList<>();
	Menu selectedMenu;
	
	Stage stage;
	Scene scene;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		menuList.add(new Menu("아메리카노", 2000, "신맛 콜롬비아 원두 500ml"));
		menuList.add(new Menu("카페라떼", 4000, "맛있는 카페라떼"));
		menuList.add(new Menu("헤이즐넛", 3000, "Best 메뉴"));
	}

	// 상품 상세 정보 출력
	public void inputItemIndex(int index) {
		System.out.println("넘어온 index : " + index);
		selectedMenu = menuList.get(index);
		System.out.println(selectedMenu);
		
		String test = textName.getText();
		System.out.println(test);

		textName.setText("아메리카노");
		textPrice.setText( selectedMenu.getPrice() + "" );
		textDescription.setText( selectedMenu.getDescription() );
		
	}
	
	// 목록 버튼 클릭 
	public void clickList(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
		Parent root = loader.load();
		scene = new Scene(root);
		
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene); 				
		stage.show();
	}
	



}





