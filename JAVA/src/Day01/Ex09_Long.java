package Day01;

public class Ex09_Long {
	public static void main(String[] args) {
// int (4byte : 32bits) : 2^32개 : 42억 개
		// int 수 표현 범위 : -21억xxx ~ 21억xxx
		
		// long (8byte : 64bits) : 2^64개
		long ln1 = 1000;
		long ln2 = 210000000;
		// long 타입 리터럴 : 숫자L
		// 자동형변환이 되야되나 int타입으로는 22억의 표현이 불가능해서 long타입으로 변환해야됨
		long ln3 = 220000000l;
		
		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);
	}

}
