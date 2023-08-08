package Day11.Ex02_Util;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerSum {

	// "1,2,3,4,5"
	// "," 분리 --> 1 2 3 4 5 (String)
	// 토큰을 int 타입으로 변환하여 합계를 구해보자.

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in); 
	String input = sc.nextLine(); // 사용자로 부터 값 입력
	StringTokenizer st = new StringTokenizer(input, " "); // StringTokenizer 객체 생성후 생성자 전달
	
	int sum = 0;
	
	while( st.hasMoreElements() ) { // 남은 토큰 확인
		int k = Integer.parseInt( st.nextToken() ); // 토큰을 출력해서 int타입으로 변환 후 k 에 저장
		sum += k;
	}
	System.out.println("합계 : " + sum);
}
}
