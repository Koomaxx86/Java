package ch6;

// 참조형 반환타입
// 객체를 메소드가 받은 뒤 메소드 내에서 객체를 생성하여 해당 객체의 주소값을 반환할 수 있다.

class Data3 {
	int x;
}

public class ReferenceReturnEx {
	public static void main(String[] args) {

		Data3 d = new Data3(); // Data3객체 생성
		d.x = 10; // 참조변수를 통한 값 수정

		Data3 d2 = copy(d); // copy 메소드 실행. 인자값으로 참조변수 d 전달. 반환된 참조변수 tmp의 주소값을 d2에 저장
		System.out.println("d.x =" + d.x);
		System.out.println("d2.x =" + d2.x); // d.x -> tmp.x -> d2로 이어진 값이 출력된다.
	}

	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3(); // Data3 객체 생성 후 tmp에 저장
		tmp.x = d.x; // d를 통해 main에서 생성한 data3의 객체의 x의 값을 새로 생성한 tmp.x에 전달

		return tmp; // d.x를 통해 전달받은 값을 가진 tmp객체의 주소를 반환
	}
}
