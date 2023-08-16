package Day16.Ex01_Lambda;

interface SmartCalc {
	int cal(int x, int y);
}

public class LambdaToParameter {
	public static void main(String[] args) {

		// 최대값 계산
		SmartCalc sc1 = (x, y) -> {return (x > y) ? x : y;}; // 함수를 sc1에 저장

		// x~y 까지 합계
		SmartCalc sc2 = (x, y) -> { // 함수를 sc2에 저장
			int sum = 0;
			for (int i = x; i <= y; i++) {
			}
			return sum;
		};
		
		smartCalc(sc1, 10, 20); // 메소드 호출. 참조값으로 sc1와 인자값 a, b값을 넘긴다
		smartCalc(sc2, 1, 10); // 메소드 호출. 참조값으로 sc2와 인자값 a, b값을 넘긴다
	}

	public static void smartCalc(SmartCalc sm, int a, int b) { // 전달받은 참조값 sm, int값 a, b
		int result = sm.cal(a, b); // 전달받은 a, b값을 참조변수sm의 cal메소드에 전달하여 return 값을 돌려받는다.
		System.out.println("result : " + result);
	}
}
