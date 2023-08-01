package _1200;

import java.util.Scanner;

public class _1228 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = (a - 100) * 0.9;
		double d = (b - c) * 100 / c;
		System.out.println(d);
		if (d <= 10) {
			System.out.println("정상");
		} else if (d > 10 && 20 >= d) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
		sc.close();
	}
}
