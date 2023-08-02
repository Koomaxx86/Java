import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum1 = 0; // 홀수의 합계
		int sum2 = 0; // 짝수의 합계

		// 홀수 출력
		for (int i = 1; i <= input; i++) {
			if (i % 2 == 1 && i != input-1 && i != input) {
				System.out.print(i + "+");
				sum1 += i;
			} else if (i % 2 == 1) {
				System.out.print(i);
				sum1 += i;
			}
		}
		System.out.println("=" + sum1);

		// 짝수 출력
		for (int i = 1; i <= input; i++) {
			if (i % 2 == 0 && i != input-1 && i != input) {
				System.out.print(i + "+");
				sum2 += i;
			} else if (i % 2 == 0) {
				System.out.print(i);
				sum2 += i;
			}
		}
			System.out.println("=" + sum2);

			// 약수 출력
			for (int i = 1; i <= input; i++) {
				if (input % i == 0) {
					System.out.print(i + " ");
				}
			}
			sc.close();
		}
	}
