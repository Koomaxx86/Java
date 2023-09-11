package _1100;

import java.util.Scanner;

public class _1116 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + (a / b));
		
		sc.close();
	}
}
