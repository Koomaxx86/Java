import java.util.Scanner;

public class _10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][] 입력 = new String[4][2]; // 입력금액
		int[][] 수량 = new int[4][10];
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[]

		// 입력값 저장
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 1; j++) {
				입력[i][j] = sc.next();
				if(입력[i][j].equals("QUIT")) return;
			}
		}

		// 화폐 카운트
		for ( int i = 0; i < 입력.length; i++ ) { 
				for (int n = 0; n < 10; n++ ) {
					
					수량[i][n] = Integer.parseInt(입력[i][1]) / money[n];
					
				}
			}

		System.out.println(input.length);
		sc.close();
	}
}
