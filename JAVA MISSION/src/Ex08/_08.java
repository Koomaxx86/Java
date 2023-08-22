package Ex08;
import java.util.Scanner;

public class _08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[][] = new int[n][n];
		int sw = 1; // 역방향 정방향
		int k = 1; // 누적된 숫자의 증가를 위한 변수

		// 바깥쪽 반복문 : i = 행
		for (int i = 0; i < n; i++) {
			if (sw == 1) { // 홀수 일때 정방향

				for (int j = 0; j < n; j++) {
					arr[i][j] = k++; // 1부터 누적증가되는 k의 값을 배열에 저장
				}
				sw = 2;
			} else {

				for (int j = n - 1; j >= 0; j--) // 짝수열의 맨뒷자리에서부터 시작해야 되기에 n-1번 인덱스 부터 호출
					arr[i][j] = k++;

			}
			sw = 1; // 홀수로 전환을 위해 변수값 초기화
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
