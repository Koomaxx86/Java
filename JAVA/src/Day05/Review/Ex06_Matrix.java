package Day05.Review;

import java.util.Scanner;


public class Ex06_Matrix {
public static void main(String[] args) {
	// 양의 정수 M과 N을 입력받아 저장하고,
	// M행 N열의 2차원 배열을 생성한.
	// 각 요소의 값을 입력받고, 그대로 출력하시오.
	// (입력 예시)
	// M : 2
	// N : 3
	// 1 2 3 
	// 4 5 6
	// (출력 예시)
	// 1 2 3 
	// 4 5 6 
	Scanner sc = new Scanner(System.in);
	int M, N, X, Y;
	System.out.println("M : ");
	M = sc.nextInt();
	System.out.println("N : ");
	N = sc.nextInt();
	
	// M행 N열의 2차원 배열 선언 및 생성
	int[][] arr = new int[M][N];
	
	// 2차원 배열은 이중반복문으로 접근한다.
	// 바깥 반복문 - 반복변수 i : 행 접근
	// 안쪽 반복문 - 반복변수 j : 열 접근
	// arr.length           : 행 크기
	// arr[i].length        : 열 크기
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			arr[i][j] = sc.nextInt();
		}
	}

	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
	// 위와 같이, X행 Y열 2차원 배열을 생성하고,
	// 순서대로 값을 입력받아 그대로 출력해보세요
	// (단 출력시 foreach문을 사용)
	
	System.out.println("X : ");
	X = sc.nextInt();
	System.out.println("Y : ");
	Y = sc.nextInt();
	
	int[][] arr1 = new int[X][Y];
	
	for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr1[i].length; j++) {
			arr1[i][j] = sc.nextInt();
		}
	}
	
	for(int[] a : arr1) { // 2차원 배열 arr1의 1차원 배열에 접근
		for(int b : a) { // arr1의 2차원 배열에 접근하여 int형 값을 가져온다
		System.out.print(b+" ");
	}
		System.out.println();
	}
	sc.close();
}
}