package ch6;

public class ReturnTest {
	public static void main(String[] args) {
		ReturnTest r = new ReturnTest(); // ReturnTest타입의 참조변수 r에 객체 생성 후 주소값 저장

		int result = r.add(3, 5); // 참조변수 r을 통해 ReturnTest 객체의 add메세지 호출. 인자값으로 3, 5 전달 후 리턴값을 result에 저장
		System.out.println(result);

		int[] result2 = { 0 }; // int타입의 참조변수 result2 선언 후 길이가 1인 배열 생성. 0번 index의 요소로 0을 입력
		r.add(3, 5, result2); // 오버로딩된 add메소드에 인자값 전달
		System.out.println(result2[0]); // 오버로딩된 add메소드에서 참조형매개변수로 result2의 값을 수정했으므로 0번 index는 수정된 값이 출력된다.
	}

	int add(int a, int b) {
		return a + b;
	}

	void add(int a, int b, int[] result) { // 기본형(int)매개변수 a, b 와 참조형 매개변수 result를 전달받는다.
		result[0] = a + b; // 기본형 매개변수 a,b의 합을 참조형 매개변수 result의 0번 인덱스에 저장한다.
	}
}
