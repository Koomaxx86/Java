package ch9;

public class ToStringTest {
	public static void main(String[] args) {
		String str = new String("KOREA");
		java.util.Date today = new java.util.Date();

		// String 클래스는 toString는 문자열을 반환하도록 오버라이딩 되있다.
		System.out.println(str);
		System.out.println(str.toString());
		// Date 클래스는 Date객체가 가지고 있는 날짜와 시간을 문자열로 변환하여 반환하도록 오버라이딩 되어 있다.
		System.out.println(today);
		System.out.println(today.toString());
	}
}
