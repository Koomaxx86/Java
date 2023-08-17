package _1000;

import java.util.Scanner;

public class _1150 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        int num3 = scanner.nextInt();

	        int min = num1;  

	        if (num2 < min) {
	            min = num2;
	        }

	        if (num3 < min) {
	            min = num3;
	        }

	        System.out.println(min);

	        scanner.close();
	    }
	}
