
package Day02;

import java.util.Scanner;

public class Ex20_Continue {
	public static void main(String[] args) {
		// 5개의 정수를 입력받아
		// 입력받은 수 중 양수(+)만 합계를 구하여 출력하시오
		Scanner sc = new Scanner(System.in);
		int sum = 0; // 합계

		for (int i = 0; i < 5; i++) { // * 5회 입력을 위한 반복문
			int n = sc.nextInt(); 
			// 음수일때만, 합계에 누적하지 않고 넘어가려면?
			if (n < 0)
				continue;
			sum += n;
		}
		System.out.println("양수의 합 : " + sum);
		sc.close();
	}
}
