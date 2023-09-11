package _1000;

import java.util.Scanner;

public class _1019 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		String[] arrDate = date.split("\\.");

		int year = Integer.parseInt(arrDate[0]);
		int month = Integer.parseInt(arrDate[1]);
		int day = Integer.parseInt(arrDate[2]);

		System.out.printf("%04d.%02d.%02d", year, month, day);
	}
}
