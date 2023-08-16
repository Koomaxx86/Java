package Day16.Ex01_Lambda;

@FunctionalInterface
interface PrintString {
	void showString(String msg);
}

public class LambdaToReturn {
	public static void main(String[] args) {

		// returnLambda 메소드와 인자를 ps1에 저장
		PrintString ps1 = returnLambda(1); 
		PrintString ps2 = returnLambda(2);
		PrintString ps3 = returnLambda(3);

		// PrintString의 showString 메소드를 호출
		ps1.showString("안녕하세요1");
		ps2.showString("안녕하세요2");
		ps3.showString("안녕하세요3");
	}

	private static PrintString returnLambda(int code) {
		switch (code) {

		case 1:
			// 람다식. msg값을 전달받아서 case1 출력면 msg에 전달
			return msg -> System.out.println("메시지 : " + msg);
		
		case 2:
			return msg -> {
				System.out.print("메시지 : ");
				System.out.println(msg);
			};
		
		case 3:
			return (msg) -> System.out.println(msg);
		}
		return (msg) -> System.out.println(msg);
	}
	
}
