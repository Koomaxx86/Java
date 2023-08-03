package Day07.Ex05_Boardinterface;

public interface DataService { // 인터페이스

	Text[] selectList();
	
	Text[] selectList(int boardNo);
	
	Text select(int no);
	
	int insert(Text Text);
	
	int update(Text Text);
	
	int delete(int no);
	
}
