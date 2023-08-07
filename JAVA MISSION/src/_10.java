import java.util.Scanner;

public class _10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] money = new int[10]; // 입력금액
		String[] name = new String[10]; // 이름
		int[] lise = {50000,10000,5000,1000,500,100,50,10,5,1}; // 화폐매수가 저장될 배열
		int count; // 화폐매수
		
		
		for (int i = 0; i <= 2; i++) {
			name[i] = sc.next();
			money[i] = sc.nextInt();
//			if( name[i].equals("QUIT")) return;
		} 
		System.out.println(name[0]+" "+money[0]);
		sc.close();
	}
}
