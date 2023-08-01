package Day01;

public class Ex10_FloatDouble {

	public static void main(String[] args) {
		// 실수 타입 변수 선업
		double var1 = 3.14; // double 타입은 리터럴 d 생략가능

		float var2 = 3.14f; // float 타입 리터럴 : 실수f

		// 실수형 정밀도
		double var3 = 0.123456789123456789;
		float var4 = 0.123456789123456789f;

		// 원주율 (파이)
		double PI = Math.PI;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
		System.out.println("원주율 PI : " + PI);

	}
}
