package Day03;

import java.util.Scanner;

public class Ex02_Max {
	public static void main(String[] args) {
		// 첫째 줄에 입력할 개수 N 입력받고,
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N 개의 정수 중, 최대값을 구하여 출력하시오
		// (입력예시)
		// 5
		// 90 60 70 100 55 
		// 최댓값 : 100
		/*
	 (순서도)
	 1. 정수 하나를 입력받는다
	 2. 입력받은 정수를 변수 N에 대입한다
	 3. N번 반복하여 N개의 정수를 입력받는다
	 4. 입력받은 N개의 정수를 배열 arr에 저장한다
	 5. 배열 arr를 반복하여, max 와 i번째 요소를 비교한다
	 6. 두 요소 중 더 큰 요소를 변수 max 에 대입한다
	 7. 반복이 끝나고, 변수 max를 출력한다
		 */
		Scanner sc = new Scanner(System.in);
		//	 1. 정수 하나를 입력받는다
		//	 2. 입력받은 정수를 변수 N에 대입한다 
		int n = sc.nextInt();
		int arr[] = new int[n];

				for(int i = 0; i<arr.length; i++) {
					//	3. N번 반복하여 N개의 정수를 입력받는다
					//	4. 입력받은 N개의 정수를 배열 arr에 저장한다
					arr[i] = sc.nextInt();
				}
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length; i++) {
			//	5. 배열 arr를 반복하여, max 와 i번째 요소를 비교한다
			if(max < arr[i])
				//	6. 두 요소 중 더 큰 요소를 변수 max 에 대입한다
				max = arr[i];
		}
		// 7. 반복이 끝나고, 변수 max를 출력한다
		System.out.println("최댓값 : " + max);
		sc.close();
	}
}