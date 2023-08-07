package _1900;

import java.util.Scanner;

public class _1904 {

	public static void method (int n, int m) {
		
		if(n > m) {
		return; 
		
		} else if (n % 2 == 1) {
			System.out.print(n + " ");
		}
		
		method(n+1, m);
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();
	int input1 = sc.nextInt();
	method(input, input1);
	sc.close();
}
}
