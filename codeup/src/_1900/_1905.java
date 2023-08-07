package _1900;

import java.util.Scanner;

public class _1905 {
	
	public static int method(int n) {
	
		if (n == 0) return 0;

		return n + method(n - 1); // return 현재n값 + n-1메소드의 n 값 + 다음메소드 호출
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int result = method(input);
		System.out.println(result);

		sc.close();
	}
}
