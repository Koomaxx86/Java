package Ex28;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/*
정수를 다루는 Vector 컬렉션을 생성하고 활용하는 프로그램을 <실행결과> 을 참고하여 완성하시오.
( 단, 반복이 필요한 경우 Iterator 를 이용하시오. )
벡터 요소 수 : 5
10 20 30 40 50
요소 수 : 5
벡터 용량 : 10
총합 : 150
 */
public class VectorCollection {
	
	public static void main(String[] args) {
		
		// 벡터 객체 생성
		Vector<Integer> vector = new Vector<>(10);
		
		System.out.print("벡터 요소 수 : ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int value = 10;
		
		// 입력된 값 만큼 반복 하며 생성된 배열에 10씩 증가된 값 저장
		for (int i = 0; i < N; i++) {
			vector.add(value);
			value += 10;
		}

		// 요소 출력
		// vector에 입력된 값 iterator로 변경
		Iterator<Integer> it = vector.iterator();
		
		// 배열에 순회
		while( it.hasNext() ) {
			// 배열의 각 요소의 저장
			Integer result = it.next();
			System.out.print(result + " ");
		}
		System.out.println();

		System.out.println("요소 수 : " + vector.size());
		System.out.println("벡터 용량 : " + vector.capacity());
		
		// 요소 총합
		int sum = 0;
		for (int i = 0; i < vector.size(); i++) {
			// 벡터의 i번 index의 요소값을 누적 합
			sum += vector.get(i);
		}
		
		System.out.println("총합 : " + sum);
		sc.close();
	}
}
