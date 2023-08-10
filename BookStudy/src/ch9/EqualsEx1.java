package ch9;

// 매개변수로 객체의 참조변수를 받아서 비교한뒤 그 결과를 boolean값으로 반환
public class EqualsEx1 {
	public static void main(String[] args) {

		Value v1 = new Value(10); // Value 객체를 생성 후 생성자에 매개변수에 10을 전달 후 참조변수 v1에 객체의 주소 저장
		Value v2 = new Value(10); // Value 객체를 생성 후 생성자에 매개변수에 10을 전달 후 참조변수 v2에 객체의 주소 저장

		if (v1.equals(v2)) // v1과 v2의 주소값 비교
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다."); // 값은 동일하더라도 객체의 주소는 다르다.

		v2 = v1; // 객체 v1의 참조값을 v2에 복사

		if (v1.equals(v2)) // v1과 v2의 주소값 비교
			System.out.println("v1과 v2는 같습니다."); // v1의 참조값을 v2에 대입하였기에 둘은 같은 주소값을 가진다.
		else
			System.out.println("v1과 v2는 다릅니다.");
	}
}

class Value {
	int value;

	Value(int value) { // 매개변수가 있는 생성자
		this.value = value; // this.를 통해 자신의 변수를 가르킨다.
	}
}