import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class _14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("몇 게임? ");
		int gameCount = sc.nextInt();

		for (int i = 1; i <= gameCount; i++) {
			int randomNumber = 0;
			List<Integer> list = new ArrayList<Integer>();

			// list에 랜덤 수 입력 및 중복제거
			for (int j = 0; j < 6; j++) {
				do {
					randomNumber = random.nextInt(44) + 1;
				} while (list.contains(randomNumber));
				list.add(randomNumber);
			}
			
			// 출력
			System.out.print("["+i+" 게임] : ");
			for (int number : list) {
				System.out.print(number + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
