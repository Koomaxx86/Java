package Day14.Board.DAO;

import java.util.*;
import Day14.Board.DTO.Text;

public interface DataService { 

	List<? extends Text> selectList();
	
	List<? extends Text> selectList(int No);
	
	Text select(int no);
	
	int insert(Text Text);
	
	int update(Text Text);
	
	int delete(int no);
	
}
