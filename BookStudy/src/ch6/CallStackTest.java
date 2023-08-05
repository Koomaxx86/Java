package ch6;

// 호출스택의 순서

public class CallStackTest {
	public static void main(String[] args) {

		firstMethod(); // static 메소드라서 객체 생성없이 호출가능
	}

	static void firstMethod() { // 다시 secondMethod를 호출
		secondMethod();
	}

	static void secondMethod() { // 출력문을 출력 후 호출스택에서 삭제
		System.out.println("seconMethod()");
	}
}
