package _1900;

import java.util.Scanner;

public class _1902 {

	public static void method (int n) {
		if(n == 0)
		return;
		System.out.println(n);
		
		method(n-1);
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();
	method(input);
	sc.close();
}
}
