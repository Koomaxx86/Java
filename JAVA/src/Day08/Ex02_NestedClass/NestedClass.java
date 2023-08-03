package Day08.Ex02_NestedClass;

public class NestedClass {
	public static void main(String[] args) {

		// 아우터 클래스 A 객체 생성
		A a = new A();
		a.a = 10;
		a.b = 20;
		System.out.println("A의 a : " + a.a);
		System.out.println("A의 b : " + a.b);
		a.aMethod(); // 메소드에 속해있는 x,y변수가 이너 클래스에 속해 있어서 접근불가

		// 이너 클래스인 B 객체 생성
		A.B b = a.new B(); // 기 생성한 객체 a를 통해서 B를 생성해야되고 타입 또한 아우터 클래스명.이너클래스명 으로 해야된다
		b.x = 30;
		b.y = 40;
		System.out.println("B의 x : " + b.x);
		System.out.println("B의 y : " + b.y);
		b.bMethod();
	}
}
