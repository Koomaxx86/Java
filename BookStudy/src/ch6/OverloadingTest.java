package ch6;

// 오버로딩
// 매개변수의 갯수나 타입이 다르면 메소드의 이름을 동일하게 쓸수 있다.

public class OverloadingTest {
	public static void main(String[] args) {

		MyMath3 mm = new MyMath3(); // 객체생성
		System.out.println("mm.add(3, 3) 결과:" + mm.add(3, 3) + mm.add(3, 3L));
	}
}

class MyMath3 {
	
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a + b;
	}

	// 메소드 오버로딩
	// 매서드의 이름은 동일해야 된다.
	// 매개변수의 개수 또는 타입이 달라야 한다.
	long add(int a, long b) { // 매개변수의 타입이 다르다
		System.out.print("long add(int a, long b) - ");
		return a + b;
	}
}
