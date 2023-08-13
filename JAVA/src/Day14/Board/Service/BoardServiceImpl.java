package Day14.Board.Service;

import java.util.List;

import Day14.Board.DAO.BoardDAO;
import Day14.Board.DTO.Board;

// BoardService의 구현 클래스
// DAO의 메소드 요청 후 반환된 값을 다시 main으로 반환
public class BoardServiceImpl implements BoardService { // BoardService 인터페이스 구현
	
	private BoardDAO boardDAO = new BoardDAO();

	@Override
	public List<Board> list() {
		List<Board> boardList = (List<Board>)boardDAO.selectList(); // boardDAO.selectList호출. 
		// 비즈닛스 로직 구현
		// ...
		return boardList; // boardDAO.selectList에서 반환된 리스트를 반환
	}

	@Override
	public Board select(int boardNo) {
		Board board = (Board) boardDAO.select(boardNo);
		return board;
	}

	@Override
	public int insert(Board board) {
		int result = boardDAO.insert(board);
		return result;
	}

	@Override 
	public int update(Board board) {
		int result = boardDAO.update(board);
		return result;
	}

	@Override
	public int delete(int boardNo) {
		int result = boardDAO.delete(boardNo);
		return result;
	}

}
