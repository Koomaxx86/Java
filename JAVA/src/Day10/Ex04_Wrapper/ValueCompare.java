package Day10.Ex04_Wrapper;

public class ValueCompare {
	public static void main(String[] args) {

		Integer intObj1 = 10; // 오토박싱(new Integer(10)과 같다(객체를 생성 후 생성자에 10의 인자를 넘겨준다). 비교범위 내 이기에 값을 비교한다
		Integer intObj2 = 10; // 해시코드 값이 동일하다. 둘이 같은 주소를 가르킨다.

		
		// byte 범위 안에서는 같은 레퍼런스로 쓰인다.
		System.out.println(System.identityHashCode(intObj1));
		System.out.println(System.identityHashCode(intObj2));
		
		System.out.println("intObj1 == intObj2");
		System.out.println("결과 : " + (intObj1 == intObj2)); // 오버라이딩 된 메소드로 내부의 값을 비교
		System.out.println("언박싱하여 비교");
		System.out.println("결과 : " + (intObj1.intValue() == intObj2.intValue()));
		
		// equals() : 래퍼객체가 가진 내부의 값을 비교하는 메소드
		// 상속 받은 래퍼클래스에서 오브젝트의 메소드를 오버라이딩 해서 값을 비교하게 되있다.
		System.out.println("equals() 메소드로 비교");
		System.out.println("결과 : " + intObj1.equals(intObj2));
		
		System.out.println("---------------------------------------------");
		
		Integer intObj3 = 200; // new Integer(200)과 같다.비교 범위를 벗어 나서 참조값을 비교한다.
		Integer intObj4 = 200; // 비교 범위를 벗어나서 해시코드 확인시 다른 객체로 나온다.
		
		// byte 범위 밖에서는 다른 레퍼런스로 쓰인다.
		System.out.println(System.identityHashCode(intObj3));
		System.out.println(System.identityHashCode(intObj4));
		
		// ==, != 기호로 래퍼객체를 비교하면,
		// 아래의 범위에서는 내부의 값을 ==, != 기호로 바로 값의 비교 가능
		// 범위를 벗어나면 참조값을 비교한다.
		// Boolean		: true, false
		// 정수 타입		: -128 ~ 127
		// char			: \u0000 ~ \u007f
		
		System.out.println("intObj3 == intObj4");
		System.out.println("결과 : " + (intObj3 == intObj4)); 						// 객체의 값을 비교. 범위를 벗어나서 객체의 주소를 비교한다.
		System.out.println("언박싱하여 비교");
		System.out.println("결과 : " + (intObj3.intValue() == intObj4.intValue())); 	// 객체 내부의 intValue 값을 비교

		System.out.println("equals() 메소드로 비교");
		System.out.println("결과 : " + intObj3.equals(intObj4));
	}
}
