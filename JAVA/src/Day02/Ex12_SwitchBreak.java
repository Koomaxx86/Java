package Day02;

import java.util.Scanner;

public class Ex12_SwitchBreak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		// 입력 받은 정수를 5로 나눈 나머지
		// 2보다 작을면 "*" 출력
		// 그렇지 않으면 "**" 출력
		// switch 문을 사용하여 작성하시오.
		switch (num % 5) {
		case 0:
			System.out.println("*");
		break;
		case 1:
			System.out.println("*");
		break;
		default:
			System.out.println("**");
			sc.close();
		}
	}
}
