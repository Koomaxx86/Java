package _1100;

import java.util.Scanner;

public class _1122 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		int min = time / 60;
		int sec = time % 60;
		
	
		System.out.print(min + " " + sec);
		
		sc.close();
	}
}
