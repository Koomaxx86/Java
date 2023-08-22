package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

// Initializable 초기화. 기본 메소드 실행
public class Controller implements Initializable {

	@FXML
	private TableView<Board> boardTableView;
	@FXML
	private TableColumn<Board, Integer> colBoardNo;
	@FXML
	private TableColumn<Board, String> colRegDate;
	@FXML
	private TableColumn<Board, String> colTitle;
	@FXML
	private TableColumn<Board, String> colUpdDate;
	@FXML
	private TableColumn<Board, String> colWriter;


	// 게시판 글 내용
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Board board1 = new Board(1, "제목1", "작성자1", "내용1", "2023-08-18", "2023-08-18");
		Board board2 = new Board(2, "제목2", "작성자2", "내용2", "2023-08-18", "2023-08-18");
		Board board3 = new Board(3, "제목3", "작성자3", "내용3", "2023-08-18", "2023-08-18");
		ArrayList<Board> boardList = new ArrayList<Board>();
		boardList.add(board1);
		boardList.add(board2);
		boardList.add(board3);


		ObservableList<Board> list = FXCollections.observableArrayList(boardList);
		

		// TableColumn 에 열과 추가할 아이템 객체의 getter 이름 지정하기
		// - .setCellValueFactory : 셀의 값을 지정하는 메소드
		// - new PropertyValueFactory("게터이름")
		// * 게터이름 : get을 제외한 게터 메소드의 이름
		// ex) getBoardNO -> BoardNo
		// 테이블컬럼객체.셀의값지정메소드.게터이름
		// * module-info.java --> java.base 모듈 추가
		colBoardNo.setCellValueFactory(new PropertyValueFactory<>("BoardNo"));
		colTitle.setCellValueFactory(new PropertyValueFactory<>("Title"));
		colWriter.setCellValueFactory(new PropertyValueFactory<>("Writer"));
		colRegDate.setCellValueFactory(new PropertyValueFactory<>("RegDate"));
		colUpdDate.setCellValueFactory(new PropertyValueFactory<>("UpdDate"));

		// TableView 에 데이터 리스트를 지정
		// - 미리 매핑된 TableColumn에 리스트의 요소 객체의 변수값이 지정됨
		boardTableView.setItems(list);
	}
}
