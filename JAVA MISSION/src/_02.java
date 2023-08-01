import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int num1; // 홀수의 합계
		int num2; // 짝수의 합계

		for (int i = 1; i <= input; i++) {
			if (i % 2 == 1 && != i) {
				System.out.print(i + "+");
				if (i % 2 == 1 && i == input - 1) {
					System.out.print(i);
				}
			}
		}
	}
}