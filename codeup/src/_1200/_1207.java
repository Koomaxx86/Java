package _1200;

import java.util.Scanner;

public class _1207 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();

	int sum = a+b+c+d;
	if(sum == 1) {
		System.out.println("도");
	} else if (sum == 2) {
		System.out.println("개");
	} else if (sum == 3) {
		System.out.println("걸");
	} else if (sum == 4) {
		System.out.println("윳");
	} else {
		System.out.println("모");
	}
	sc.close();
}
}
