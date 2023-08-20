package Ex02;

import java.util.ArrayList;
import java.util.List;

public class Library {
public static void main(String[] args) {
	
	List<Book> book = new ArrayList<Book>();
	book.add(new Book("123123", "이게 자바냐", "감자바", "자바 감자바 ", 33000));
	book.add(new Book("112112", "정보처리기사", "김휴먼", "국가기술자격 ", 45000));
	book.add(new Book("001001", "실무 DB  ", "박디비", "디비디비딥  ", 60000));
	
	System.out.println("########## 휴먼 스터디 도서관 ##########");
	for (Book print : book) {
		System.out.println(print);
	}
}
}
