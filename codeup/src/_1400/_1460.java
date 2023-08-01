package _1400;

import java.util.Scanner;

public class _1460 {
	public static void main(String[] args) {
		// 배열의 크기 n을 입력받아,
		// nxn 구조의 배열에 1부터 시작하여 1씩 증가하는 값을 대입하데,
		// 아래와 같은 구조로 값을 대입하고 출력하시오.
		// (입력예시)
		// 3
		// (출력예시)
		// 1 2 3
		// 4 5 6
		// 7 8 9
		
		Scanner sc = new Scanner(System.in); // 스캐너 호출
		int a = sc.nextInt(); // 참조변수 a에 입력값 저장
		int arr[][] = new int[a][a]; // 2차원 배열 생성. 배열의 값은 입력값x입력값
		int b = 1; // 배열의 값 증가를 위한 변수 선언 후 1로 초기화
		
		for (int i = 0; i < arr.length; i++) { // 1차원 배열 반복
			for (int j = 0; j < arr[i].length; j++) {  // 2차원 배열 반복
				arr[i][j] = b++; // 00 인덱스부터 요소에 b의값(1) 부터 순차입력
			}
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
