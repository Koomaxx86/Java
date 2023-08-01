package Day04.Ex04_ObjectArry;

import java.util.Scanner;

/**
   책제목, 저자명을 갖는 Book 클래스를 정의하고,
   Book 클래스타입의 객체 배열을 생성하여
   사용자로부터 책 3권을 입력받아 출력하는 프로그램을 작성하시오
 */

class Book {
	String title, author; // 책제목, 저자명
	
	public Book() { // 기본 생성자
		this("제목없음", "작자미상");
	}
	
	public Book(String title, String author) { //생성자
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {  // 최상위 클래스 Object 상속
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
}
public class BookArry {
public static void main(String[] args) {
	
	// Book 타입의 객체 배열 선언 및 생성
	Book[] bookArray = new Book[3]; // ㅁㅁㅁ 객체를 담을 배열 3개 생성(참조형)
	Scanner sc = new Scanner(System.in); // 스캐너 호출
	
	//사용자 입력
	for(int i = 0; i < bookArray.length; i++) {
		System.out.println("제목 : ");
		String title = sc.nextLine(); // 사용자로 부터 입력받은 문자열을 TITLE저장
		
		System.out.println("저자 : ");
		String author = sc.nextLine(); // 사용자로 부터 입력받은 문자열을 AUTHOR에 저장
		
		// Book 객체를 생성하여 bookArry 배열 요소에 삽입
		bookArray[i] = new Book(title, author); //??
	}
	
	//출력
	for (Book book : bookArray) {
		System.out.println(book);
	}
	sc.close();
}
}
