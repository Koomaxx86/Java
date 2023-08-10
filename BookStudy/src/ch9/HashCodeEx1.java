package ch9;

public class HashCodeEx1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// String 타입으로 선언된 객체라서 둘의 객체주소가 아닌 문자열을 비교한다.
		System.out.println(str1.equals(str2));
		// String클래스는 문자열의 내용이 같으면 같은 해시코드를 반환하도록 hashCode메서드가 오버라이딩 되있다. 
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// 객체의 주소값으로 해시코드를 생성하기 떄문에 다른 해시코드값을 반환한다.
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
}
