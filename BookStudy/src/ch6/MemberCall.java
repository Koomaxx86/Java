package ch6;

public class MemberCall {

	int iv = 10;
	static int cv = 20;

	int iv2 = cv;
	// static int cv2 = iv // static 변수는 인스턴스 변수 사용불가
	static int cv2 = new MemberCall().iv; // static 변수는 객체를 생성한 인스턴스의 인스턴스변수에는 접근가능. 객체의 생성과 동시에 접근하는 코드

	static void staticMethod1() {
		System.out.println(cv); 
		//System.out.println(iv); // static메소드에서 iv접근 불가
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // 객체 생성 후 iv접근 가능
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // 인스턴스 메소드는 cv, iv둘다 접근가능
	}
	
	static void staticMethod2() {
		staticMethod1();
		//instanceMethod1(); // stattic 메소드는 인스턴스메소드 접근 불가
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // 객체 생성 후 인스턴스메소드 접근가능
	}
	
	void instanceMethod2() { // 인스턴스 메소드에서는 둘 다 접근가능하다.
		staticMethod1();
		instanceMethod1();
	}
}
