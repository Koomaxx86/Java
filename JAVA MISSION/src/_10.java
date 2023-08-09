import java.util.Scanner;

public class _10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][] input = new String[5][2]; // 입력금액
		int[] lise = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 }; // 화폐매수가 저장될 배열
		int count; // 화폐매수

		// 입력값 저장
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 1; j++) {
				input[i][j] = sc.next();
				if(input[i][j].equals("QUIT")) 
					return;
				}
			}
		
		// 화폐 카운트
		for ( int i = 0; i < 10; i++ ) {
			for ( int j = 0; j < 1; j++ )
				
		}
		

		System.out.println(input[0][0]);
		System.out.println(input[0][1]);
		sc.close();
	}
}
