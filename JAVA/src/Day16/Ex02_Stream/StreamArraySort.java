package Day16.Ex02_Stream;

import java.util.Arrays;

public class StreamArraySort {
	public static void main(String[] args) {

		int arr[]	= {10, 5, 2, 3, 4};
		
		// Arrays.sort(arr);		arr 배열에 정렬을 적용한다.

		// sorted() 메소드에는 오토박싱이 자동으로 된다.
		// stream 객체의 sorted()는 복사된 배열에 정렬을 한뒤 다시 가져와서 사용한다.
		int sortedArr[] = Arrays.stream(arr).sorted().toArray(); // 배열을 정렬

		System.out.println("기본 배열에 정렬을 적용 X");
		for (int i : arr) { 
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println("- 오름차순 정렬");
		System.out.println("복사된 배열에 정렬을 적용 O");
		for (int i : sortedArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println("- 내림차순 정렬");
		// boxed() -> 오토박싱
		// ( (a,b) -> b-a ) 인자를 넘겨주기 위해 boxed()를 통해 먼저 객체화 시킨다.
		Object reversedArr[] = Arrays.stream(arr).boxed().sorted( (a,b) -> b-a ).toArray();
		for (Object obj : reversedArr) {
			System.out.print((Integer) obj + " ");
		}
		System.out.println();
		System.out.println();
		
		// sorted + forEach
		System.out.println("정렬과 반복을 동시에");
		Arrays.stream(arr).sorted().forEach( (n) -> System.out.print(n + " "));
	}
}
