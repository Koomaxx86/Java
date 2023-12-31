package Ex04.DAO;

import java.util.List;

import Ex04.DTO.Text;

public interface DataService {
	
	List<? extends Text> selectList();
	
	List<? extends Text> selectList(int no);
	
	Text select(int no);
	
	int insert(Text text);
	
	int update(Text text);
	
	int delete(int no);

}
