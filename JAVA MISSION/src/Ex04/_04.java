package Ex04;
import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) { // 입력받은 값 만큼 반복 행
			for (int s = i; s <= input - 1; s++) { // 앞쪽 공백 입력
				System.out.print(" ");
			}
			for (int j = 2; j <= i*2; j++) // *입력
				System.out.print("*");
			System.out.println();
		}
		sc.close();
	}
}
