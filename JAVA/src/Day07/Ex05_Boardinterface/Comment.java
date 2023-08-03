package Day07.Ex05_Boardinterface;

public class Comment extends Text {

	private int commentNo;
	private int boardNo;
	
	public Comment() {
		this("글쓴이 없음", "내용없음");
	}
	
	public Comment(String writer, String content) {
		super(writer, content);
	}

	public int getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
		setNo(commentNo);
	}

	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	
}
