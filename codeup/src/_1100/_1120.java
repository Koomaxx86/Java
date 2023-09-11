package _1100;

import java.util.Scanner;

public class _1120 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double sum = a + b + c;
		double avg = sum / 3;

		System.out.printf("%.2f",avg);
		
		sc.close();
	}
}
