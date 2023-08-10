import java.util.Scanner;

public class _10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][] input = new String[4][2]; // 입력금액
		int[][] count = new int[4][10];
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		

		// 입력값 저장
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 1; j++) {
				input[i][j] = sc.next();
				if(input[i][j].equals("QUIT")) return;
			}
		}

		// 화폐 카운트
		for ( int i = 0; i < input.length; i++ ) { 
				for (int n = 0; n < 10; n++ ) {
					count[i][n] = Integer.parseInt(input[i][1]) / money[n];
					
				}
			}

		System.out.println(input.length);
		sc.close();
	}
}
