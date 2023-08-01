package Day04.Ex06_PassingArgument;

public class CallbyValue {
	public static int sum(int a, int b) { // main으로부터 10과 20의 값을 전달받음
		a = 100;
		b = 200;
		System.out.println("***** sum 메소드 *****");
		System.out.println("(a,b) : " + a + ", " + b); // 위에 정의된 a,b의 값으로 변경 
		int sum = a+b;
		return sum; // 100과 200을 더한 값을 sum으로 반환
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("***** main 메소드 *****");
		System.out.println("(a,b) : " + a + ", " + b);

		int sum = sum(a, b);
		System.out.println("sum : " + sum); // CallbyValue에서 반환된 sum(300) 의 출력

		System.out.println("***** sum 메소드 *****");
		System.out.println("(a,b) : " + a + ", " + b);
	}
}
