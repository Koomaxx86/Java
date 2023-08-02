package Day07.Ex05_Boardinterface;

public interface DataService {

	Text[] selectList();
	
	Text select(int no);
	
	int insert(Text Text);
	
	int update(Text Text);
	
	int delete(int no);
	
}
