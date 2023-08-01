package Day05.Review;

import java.util.Scanner;

/**
 * 화폐 매수 구하기
 * 
 * 금액 : 537620 
 * 50000 : 개 
 * 10000 : 개 
 * 5000 : 개 
 * 1000 : 개 
 * 500 : 개 
 * 100 : 개 
 * 50 : 개 
 * 10 :개 
 * 5 : 개 
 * 1 : 개 
 * 위와 같이 금액을 입력하면, 
 * 큰 화폐단위부터 계산하여, 
 * 화폐단위별로 화폐매수를 출력하는 프로그램을 작성하시오.
 */
public class Ex03_NumberOfCurrency {
	/*
	 * (순서도) 1. 필요한 변수 선언 - (입력금액), (화폐매수), (화폐단위)
	 * 
	 * 2. (입력금액) 입력
	 * 
	 * 3. 화폐매수 계산 (조건) : 큰 화폐단위부터 계산한다.
	 * 
	 * 3-1. 화폐매수 계산 10 = 537620 / 50000 
	 * (화폐매수) = (입력금액) / (화폐단위)
	 * 
	 * 3-2. 잔액 계산 
	 * 37620 = 537620 - (50000*10) 
	 * 37620 = 537620 % 50000 
	 * i) (잔액) = (입력금액) - (화폐단위 * 화폐매수) 
	 * ii) (잔액) = (입력금액) % (화폐단위)
	 * 
	 * 3-3. 화폐단위 변환 번갈아 가면서, /5, /2 연산을 반복한다. 
	 * (화폐단위) = (화폐단위) / 5 
	 * (화폐단위) = (화폐단위) / 2
	 * 
	 * 4. 3번의 과정을 반복 
	 * - 반복조건 : (화폐단위)가 1보다 크거나 같으면 반복
	 * 
	 * 5. 3-1 에서 구한 화폐매수를 출력한다.
	 */
	
	public static void main(String[] args) {
		int input; // 입력금액
		int count; // 화폐매수
		int money = 50000; // 화폐단위 - 큰 화폐단위부터 시작
		//	int[] lise = {50000,10000,5000,1000,500,100,50,10,5,1}; // money 대신 사용가능
		boolean sw = true; //화폐단위를 전환

		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		input = sc.nextInt();

		while(money >= 1 ) {
			
		// (화폐매수) = (입력금액) / (화폐단위)
		count = input / money;
		System.out.println(money + "\t : " + count + " 개");

		// i) (잔액) = (입력금액) - (화폐단위 * 화폐매수)
		// input = input - (money*count);

		// ii) (잔액) = (입력금액) % (화폐단위)
		input = input % money;

		// (화폐단위) = (화폐단위) / 5
		// (화폐단위) = (화폐단위) / 2
		if(sw) {
			money = money / 5;
			//			sw = false;
		} else {
			money = money / 2;
			//			sw = true;
		}
		sw = !sw; // !(NOT)연산 : true -> false, false -> true
		}
		sc.close();
	}
}
