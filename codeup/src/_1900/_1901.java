package _1900;

import java.util.Scanner;

public class _1901 {

	public static void method (int n) {
		if(n == 0)
		return;
		
		method(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();
	
	method(input);
	sc.close();
}
}
