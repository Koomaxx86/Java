package ch6;

// 생성자와 정적변수를 이용한 자동 이름 입력
class Document {
	static int count = 0; // 정적변수. 최초 1회 초기화
	String name;

	Document() { // 생성자
		this("제목없음" + ++count); // 문자열과 변수(count)의 값을 합처서 새로운 문자열 생성
	}

	Document(String name) { // 기본 생성자에서 전달받은 새로운 문자열을 출력
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
}

public class DocumentTest {
	public static void main(String[] args) {

		Document d1 = new Document(); // Document 객체생성
		Document d2 = new Document("자바.txt"); // 매개변수가 있는 생성자를 넘겨주기에 Document의 count의 값을 증가시키지 않는다.
		Document d3 = new Document();
		Document d4 = new Document();
	}
}
