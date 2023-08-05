package ch6;
// 기본형 매개변수
// 기본형 매개변수는 값을 읽기만 가능하고 전달받은 값의 변경이 불가능하다.
class Data { 
	int x;
}

public class PrimitiveParamEx {
	public static void main(String[] args) {

		Data d = new Data(); // Data타입의 참조변수 d 선언 및 Data객체 생성
		d.x = 10; // 참조변수 d를 통해 Data객체의 변수 x에 10을 저장
		System.out.println("main() : x = " + d.x); // 출력 10

		change(d.x); // static 타입의 chang메소드 호출. 인자값으로 참조변수 d의 객체 data의 x값을 전달
		
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(int x) { // 객체 data의 x값이 매개변수에 전달
		x = 1000; // 매개변수로 전달받은 x의 값(10)을 다시 1000으로 변경
		System.out.println("change() : x = " + x); // change의 지역변수 x의 값이 출력
	}
}
