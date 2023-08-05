package ch6;

// 참조형 매개변수
// 메소드에서 전달받는 매개변수가 참조형 일 경우 메소드에서 전달받은 객체의 값 수정이 가능하다.

class Data1 {
	int x;
}

public class ReferenceParamEx {
	public static void main(String[] args) {

		Data1 d = new Data1(); // Data1타입의 참조변수 d 선언 및 Data1객체 생성
		d.x = 10; // 참조변수 d를 통해 Data1객체의 변수 x에 10을 저장
		System.out.println("main() : x = " + d.x); // 출력 10

		change(d); // static 타입의 chang메소드 호출. 인자값으로 참조변수 d를 전달(d의 주소값)
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(Data1 d) { // 객체 Data1의 주소값이 매개변수에 전달
		d.x = 1000; // 매개변수로 전달받은 객체의 x값(10)을 1000으로 변경
		System.out.println("change() : x = " + d.x); // Data1객체의 주소값이 저장된 d를 통해 d.x(Data1객체주소.x)의 값을 호출
	}
}
