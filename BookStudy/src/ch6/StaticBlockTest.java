package ch6;

// 초기화 블럭
// 클래스 변수 초기화 순서 : 기본값 -> 명시적초기화 -> 클래스초기화블럭
// 인스턴스 변수 초기화 순서 : 기본값 -> 명시적초기화 -> 인스턴스초기화블럭 -> 생성자
public class StaticBlockTest {
	static int[] arr = new int[10]; // static 멤버변수(정적멤버) 1순위 로 실행. 중복으로 있을 경우 우선 선언된 순서로 실행

	static { // 클래스 초기화 블럭(정적초기화블럭). 정적멤버 실행 후 실행된다. 최초 로딩시 1회만 실행된다. 
		for (int i = 0; i < arr.length; i++) {
			// 1과 10 사이의 임의의 값을 배열 arr에 저장한다.
			arr[i] = (int) (Math.random() * 10) + 1;
		}
	}

	public static void main(String[] args) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] :" + arr[i]);
		}
	}
}
