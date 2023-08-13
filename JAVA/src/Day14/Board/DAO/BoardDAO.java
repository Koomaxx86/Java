package Day14.Board.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Day14.Board.DTO.Board;
import Day14.Board.DTO.Text;

public class BoardDAO extends JDBConnection implements DataService {
	
	// 데이터 목록 조회
	public List<? extends Text> selectList() {
		
		List<Board> boardList = new ArrayList<Board>(); // ArrayList생성
		
		// SQL
		String sql = " SELECT * " // board테이블의 모든 데이터를 조회
				   + " FROM board "; 
		
		try { // jdbc에서 getConnection 을 통해 생성된 객체를 상속받아서 con을 사용가능하다.
			stmt = con.createStatement();		// 쿼리 실행 객체 생성 후 stmt에 대입
			rs = stmt.executeQuery(sql);		// 쿼리 실행 - 결과-->rs (ResultSet). 조회 후 결과를 rs에 저장
			
			
			// 조회 결과를 리스트에 추가
			// 다음 데이터를 계속 조회해서 추가
			while( rs.next() ) {				// next() : 실행 결과의 다음 데이터로 이동
				Board board = new Board(); // 반복문으로 다음 데이터가 있으면 계속 신규 보드 객체 생성
				
				// 결과 데이터 가져오기
				// rs.getXXX(자료형)("컬럼명") --> 해당 컬럼의 데이터를 가져온다
				//  - 실행 결과에서, "컴럼명"의 값을 특정 타입으로 반환
				board.setBoardNo( rs.getInt("board_no") );
				board.setTitle( rs.getString("title") );
				board.setWriter( rs.getString("writer") );
				board.setContent( rs.getString("content") );
				board.setRegDate( rs.getTimestamp("reg_date") );
				board.setUpdDate( rs.getTimestamp("upd_date") );
				// 조회된 모든 데이터를 setter메소드를 이욯해서 보드 객체에 저장
				
				boardList.add(board); // 저장된 객체를 전부 arraylist에 저장
			}
			
		} catch (SQLException e) {
			System.err.println("게시글 목록 조회 시, 에러 발생");
			e.printStackTrace();
		}		
		return boardList; // 반환. BoardServiceImpl
	}
	
	// 데이터 조회
	public Text select(int no) {
		Board board = new Board();
		String sql = " SELECT * "
				   + " FROM board "
				   + " WHERE board_no = ? ";
		
		try {
			psmt = con.prepareStatement(sql);		// 쿼리 실행 객체 생성 (prepareStatement)객체 반환
			// psmt.setXXX( 순서번호, 매핑할 값 );
			psmt.setInt(1, no);				// ?(1) <-- boardNo(글번호)
			// setXXX(index순서, 값)	: SQL 의 지정한 순서(?)에 있는 파라미터에 값을 매핑
			// - 여기서는, "1번 ?에 글번호 no 값을 매핑한다."
			rs = psmt.executeQuery();				// 쿼리 실행
			// executeQuery()
			// : SQL (SELECT)을 실행하고 결과를 ResultSet 객체로 반환

			// 조회 결과 가져오기
			if( rs.next() ) {
				board.setBoardNo( rs.getInt("board_no") );
				board.setTitle( rs.getString("title") );
				board.setWriter( rs.getString("writer") );
				board.setContent( rs.getString("content") );
				board.setRegDate( rs.getTimestamp("reg_date") );
				board.setUpdDate( rs.getTimestamp("upd_date") );
			}
			
		} catch (SQLException e) {
			System.err.println("게시글 조회 시, 에러 발생");
			e.printStackTrace();
		}
		return board;
	}
	
	// 데이터 등록
	public int insert(Text text) {
		int result = 0;
		
		String sql = " INSERT INTO board( title, writer, content ) "
				   + " VALUES( ?, ?, ? ) ";
	
		try {
			psmt = con.prepareStatement(sql);			// 쿼리 실행 객체 생성
			psmt.setString(1, text.getTitle());			// 1번 ? 에 제목을 매핑
			psmt.setString(2, text.getWriter());		// 2번 ? 에 작성자을 매핑
			psmt.setString(3, text.getContent());		// 3번 ? 에 내용을 매핑
			
			result = psmt.executeUpdate();				// SQL 실행 요청, 적용된 데이터 개수를 받아옴
														// 게시글 1개 쓰기 성공 시, result : 1
														// 				실패 시, result : 0
			// executeUpdate()
			// : SQL (INSERT, UPDATE, DELETE)을 실행하고 적용된 데이터 개수를 int 타입으로 반환
		} catch (SQLException e) {
			System.err.println("게시글 등록 시, 에러 발생");
			e.printStackTrace();
		}		
		return result;
	}
	
	// 데이터 수정
	public int update(Text text) {
		
		int result = 0;
		
		String sql = " UPDATE board "
				   + "   SET title = ? "
				   + "   	,writer = ? "
				   + "   	,content = ? "
				   + "   	,upd_date = now() "
				   + " WHERE board_no = ? "
				   ;
		// - now() : 현재 날짜/시간을 반환하는 MySQL 함수

		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, text.getTitle());		// 1번 ? 에 제목을 매핑
			psmt.setString(2, text.getWriter());		// 2번 ? 에 작성자을 매핑
			psmt.setString(3, text.getContent());		// 3번 ? 에 내용을 매핑
			psmt.setInt(4, text.getNo());			// 4번 ? 에 게시글 번호를 매핑
			
			result = psmt.executeUpdate();				// SQL 실행 요청, 적용된 데이터 개수를 받아옴
														// 게시글 1개 수정 성공 시, result : 1
														// 				실패 시, result : 0
		} catch (SQLException e) {
			System.err.println("게시글 수정 시, 에러 발생");
			e.printStackTrace();
		}
		return result;
	}

	// 데이터 삭제
	public int delete(int no) {
		int result = 0;
		
		String sql = " DELETE FROM board "
				   + " WHERE board_no = ? ";
		
		try {
			psmt = con.prepareStatement(sql);	// 쿼리 실행 객체 생성
			psmt.setInt(1, no);			// 1번 ? 에 글번호를 매핑
			
			result = psmt.executeUpdate();		// SQL 실행 요청
		} catch (SQLException e) {
			System.err.println("게시글 삭제 시, 에러 발생");
			e.printStackTrace();
		}  		
		return result;
	}

	@Override
	public List<? extends Text> selectList(int boardNo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

















