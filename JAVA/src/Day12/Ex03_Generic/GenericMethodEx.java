package Day12.Ex03_Generic;

class GenericMethod {

	// 제네릭 메소드
	// - 반환타입, 매개변수에 타입 매개변수를 사용
	public <T> T method(T t) {
		return t;
	}

	// 매개변수를 타입매개변수로 사용
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}

	// 매개변수 2개를 타입 매개변수로 사용
	public <K, V> void method3(K k, V v) {
		System.out.println(k + " : " + v);
	}
}

public class GenericMethodEx {
	public static void main(String[] args) {

		GenericMethod gm = new GenericMethod();

		// 제네릭 메소드 호출
		// - 객체.<타입>메소드명( 인자 );
		String str1 = gm.<String>method("제네릭 메소드"); // String타입 전달. String 반환
		System.out.println("str1 : " + str1);

		// 전달인자의 값으로 타입을 유추할 수 있으면,
		// 제네릭 메소드 호출 시, 제네릭 타입 생략가능
		String str2 = gm.method("타입 지정 생략 가능");		// 매개변수가 " "이라서 자동으로 인지한다.
		System.out.println("str2 : " + str2);

		boolean bool1= gm.<Double>method2(10.5, 10.5);
		System.out.println("bool1 : " + bool1);

		boolean bool2= gm.<Double>method2(10.5, 20.5);
		System.out.println("bool2 : " + bool2);

		gm.<String, Integer>method3("자바 점수 ", 90);
		gm.method3("DB 점수 ", 100);
	}
}
