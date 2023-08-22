package Ex10;
import java.util.Scanner;

public class _10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][] 입력 = new String[4][2]; // 입력금액
		int[][] 수량 = new int[4][10];
		int[] 단위 = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int 잔액 = 0;
		int 합계[] = new int[10];

		// 입력값 저장
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 1; j++) {
				입력[i][j] = sc.next();
				if (입력[i][j].equals("QUIT"))
					return; // QUIT 입력시 종료
			}
		}

		// 화폐 카운트
		for (int i = 0; i < 입력.length; i++) {
			for (int n = 0; n < 10; n++) {
				if (n == 0) { // 최초 1회 계산
					수량[i][n] = Integer.parseInt(입력[i][1]) / 단위[n];
					잔액 = Integer.parseInt(입력[i][1]) % 단위[n];
				} else { // 잔액 이어서 계산
					수량[i][n] = 잔액 / 단위[n];
					잔액 = 잔액 % 단위[n];
				}
				합계[n] += 수량[i][n];
			}
		}

		// 기본 출력
		System.out.println("성명  출장비\t오만원\t만원\t오천원\t천원\t오백원\t백원\t오십원\t십원\t오원\t일원");
		for (int i = 0; i < 입력.length; i++) {
			System.out.print(입력[i][0]+" "+입력[i][1]+"\t");
			for (int n = 0; n < 10; n++) {
				System.out.print(수량[i][n]+"\t");
			}
			System.out.println();
		}
			System.out.print("전체 화폐매수 :\t");
			for (int i : 합계) {
				System.out.print(i+"\t");
			}
		
		sc.close();
	}
}