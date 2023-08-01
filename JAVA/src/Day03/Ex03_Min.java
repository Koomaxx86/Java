package Day03;

import java.util.Scanner;

public class Ex03_Min {
	public static void main(String[] args) {
		// 첫째 줄에 입력할 개수 N 입력받고,
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N 개의 정수 중, 최소값을 구하여 출력하시오
		// (입력예시)
		// 5
		// 90 60 70 100 55
		// 최소값 : 55
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n]; // * 배열의 생성

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE; // int에서 나타낼수 있는 최대값
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		System.out.println("최소값 : " + min);
		sc.close();
	}
}