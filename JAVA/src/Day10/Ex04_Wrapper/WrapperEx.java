package Day10.Ex04_Wrapper;

public class WrapperEx {
	public static void main(String[] args) {

		// Character
		// char -> Character
		// :문자타입인 char 기본타입을 객체화한 클래스

		// 대소문자 변환
		char a = 'a';
		char A = 'A';

		System.out.println(Character.toUpperCase(a));
		System.out.println(Character.toLowerCase(A));

		char c1 = '7', c2 = 'K';

		// 해당 문자가 숫자인지 확인
		if (Character.isDefined(c1)) {
			System.out.println(c1 + "(은/는) 숫자");
		}

		if (Character.isDefined(c2)) {
			System.out.println(c2 + "(은/는) 영문자");
		}
		
		// Integer
		// int -> Integer
		// : 정수타입을 int 기본타입을 객체화한 클래스
		System.out.println(Integer.parseInt("28")); 	// 문자열 -> 정수
		System.out.println(Integer.toString(28) + 2); 	// 정수 -> 문자열
		System.out.println(Integer.toBinaryString(28)); // 2진수 문자열로 변환
		System.out.println(Integer.bitCount(28)); 		// 2진수의 1의 개수
		
		// deprecated?
		// : 더 이상 사용을 권장하지 않는 문법
		// Integer i = new Integer(28); // 이전 객체 생성방법
		// ------------------------------------------------------------------
		// 자바 5버전 부터는 객체로 생성하여 사용하지 앟아도 오토박싱을 해준다.
		// * 오토박싱 : 기본타입을 Wrapper 클래스로 컴파일러가 자동으로 변환하는 것
		// * 언박싱 : Wrapper 클래스를 기본타입으로 변환하는 것
		// Integer num1 = new Integer(100); // 객체생성 후 사용
		// int num2 = 200; // 기본형
		// int sum = num1 + num2 // 객체형 + 기본형 num1이 언박싱되서 num2와 동일한 타입으로 변환된다
		// Integer num3 = num2; // 기본형인 num2를 오토박싱해서 객체형으로 변환하여 num3에 넣는다.
		// -------------------------------------------------------------------
		Integer i = 28; // 오토박싱을 통한 객체형으로 변환
		System.out.println(i.doubleValue()); // double 타입으로 변환
		
		// Double
		// double -> Double
		// : 실수타입인 double 기본타입을 객체화한 클래스
		Double d = 3.14; // 오토박싱
		System.out.println( d.toString() + 0.06); 					// 실수형 -> 문자열
		System.out.println( Double.parseDouble("3.14") + 0.06 ); 	// 문자열 -> 실수형
		
		// Boolean
		// boolean -> Boolean
		// : 불타입인 boolean 기본타입을 객체화한 클래스
		Boolean b = ( i < 40 );
		System.out.println( Boolean.toString(b)); 				// "true"
		System.out.println( Boolean.parseBoolean("falese")); 	// "false" -> false / 문자열에서 boolean타입으로 변환
		
	}
}