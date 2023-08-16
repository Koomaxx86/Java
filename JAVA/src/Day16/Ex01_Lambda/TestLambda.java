package Day16.Ex01_Lambda;

class Television {
	void volumeUp() { System.out.println("UP"); }
	void volumeDown() { System.out.println("DOWN"); }
}

interface RemoteControl {
	void volumeUp();
	void volumeDown();
}

@FunctionalInterface // 인터페이스가 함수형 인터페이스 인지 체크 (추상 메소드가 1개인지 체크)
interface Calculator {
	int calc(int a, int b);
	
	// 함수형 인터페이스는 추상메소드가 2개 이상있으면 에러 발생
//	double calc(double a, double b);
}

public class TestLambda {
	public static void main(String[] args) {
		
		// 익명 자식 객체
		// Television 앞쪽에 익명으로 이름이 생략된거와 같다.
		Television tv = new Television() { // extends Television과 같다.
//			int channel = 0; // 객체가 생성되면서 타입이 부모타입이 되기에 자식객체에서 생성된 변수들은 접근 불가.
			
			// 메소드 오버라이딩
			void volumeUp() { System.out.println("UP - 자식"); }
			// 메소드 오버라이딩
			void volumeDown() { System.out.println("DOWN - 자식"); }
			
		};
		
		tv.volumeUp();
		tv.volumeDown();

		// 익명 구현 객체
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void volumeUp() {
				System.out.println("UP - 구현");
			}
			
			@Override
			public void volumeDown() {
				System.out.println("DOWN - 구현");
			}
		};
		
		rc.volumeUp();
		rc.volumeDown();
		
		// 익명 구현 객체
		Calculator cal = new Calculator() {
			@Override
			public int calc(int a, int b) {
				return a + b;
			}

//			@Override
//			public double calc(double a, double b) {
//				return a + b;
//			}
		};
		
		int result1 = cal.calc(10, 20);
		System.out.println("result1 : " + result1);
		
		// 람다식
		// 하나의 람다식에는 1개의 함수만 있는 람다식을 쓴 인터페이스에 연결가능하다. 여러개면 변수의 타입을 람다식이 구분불
		Calculator calLambda = (a, b)->{ return a + b; }; 
		int result2 = calLambda.calc(20, 30);
//		double result3 = calLambda.calc(1.5, 3.4);
		System.out.println("result2 : " + result2);
	}
}
