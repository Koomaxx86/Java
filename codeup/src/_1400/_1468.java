package _1400;

import java.util.Scanner;

public class _1468 {
	public static void main(String[] args) {

		// 1. n을 입력받는다
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// 2. nxn 구조로 배열을 생성한다
		int arr[][] = new int[n][n];
		int sw = 1; // 역방향 정방향
		int k = 1;

		// 3. 1~n 행까지 반복한다
		// 바깥쪽 반복문 : i - 행
		for (int i = 0; i < n; i++) {
			// 정방향
			// 홀수행 일떄는
			// 왼쪽에서 온른쪽으로 1씩 증가
			if (sw == 1) {
				// 안쪽 반복문 : j - 열
				for (int j = 0; j < n; j+=sw) {
					// i:0
					// j:0 1 2 3 4
					arr[i][j] = k++;
				}
			}
				// 역방향
				// 짝수행 일떄는,
				// 오른쪽에서 왼쪽으로 1씩 증가
				for (int j = n - 1; j >= 0; j=+sw) {
					// i : 1
					// j : 4 3 2 1
					arr[i][j] = k++;
				}
		
				sw = 1;
			}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
