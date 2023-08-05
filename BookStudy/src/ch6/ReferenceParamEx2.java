package ch6;

public class ReferenceParamEx2 {
	public static void main(String[] args) {

		int[] x = {10}; // int타입의 참조변수 x 선언 후 크기가 1인 배열에 10을 저장
		System.out.println("main() : x = " + x[0]); // 배열의 0번 index값 출력. 10

		change(x); // chang메소드 호출(static타입이라 객체생성 없음). 매개변수로 참조변수 x의 주소값을 전달한다
		System.out.println("After change(x)");
		System.out.println("main() : x = " + x[0]); // change메소드에서 참조변수를 통해 x의 값을 수정했기에 배열의 값이 수정되었다.
	}

	static void change(int[] x) {
		x[0] = 1000; // 넘겨받은 참조변수의 주소값의 배열의 0번 인덱스의 값을 1000으로 변경
		System.out.println("change() : x = " + x[0]); // 인덱스값 출력
	}
}