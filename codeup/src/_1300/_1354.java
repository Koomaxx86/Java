package _1300;
import java.util.Scanner;
public class _1354 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1; i <= n; i++) {
			for (int j=n; j >= i; j--) {
				// i : 1 j:1
				// i : 2 j:2 1
				// i : 3 j:3 2 1
				// i : 4 j:4 3 2 1
				// i : 5 j:5 4 3 2 1
				System.out.print("*");
		}
		System.out.println();
		}
		sc.close();

	}

}
