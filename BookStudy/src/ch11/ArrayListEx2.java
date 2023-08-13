package ch11;

import java.util.*;

public class ArrayListEx2 {
	public static void main(String[] args) {

		final int LIMIT = 10;
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();

		// 인터페이스 List를 구현한 ArrayList 객체를 생성한다.
		// 전체 문자열 / 최대치를 해서 한줄에 출력할 평균 문자열갯수를 구한 뒤 여유분으로 +10했다.
		List list = new ArrayList(length / LIMIT + 10);

		// 문자열의 길이 -1까지 반복.
		// i += LIMIT를 통해 10개단위로 잘라서 출력할수 있다. 
		//	- 처음 0 -> 10 -> 20
		for (int i = 0; i < length; i += LIMIT) {
			if (i + LIMIT < length)
				// 문자열 source에 substring메소드를 사용해서 i 부터 (i + LIMIT-1)까지의 문자열을 추출한뒤 list.add 메소드를 통해서 문자열 전체를 저장
				// 저장된 문자열은 뒤에서 부터 쌓인다.
				list.add(source.substring(i, i + LIMIT));
			else
				list.add(source.substring(i));
		}

		// list의 총 길이만큼 반복을 한다.
		for (int i = 0; i < list.size(); i++) 
			// get메소드를 통해서 저장된 문자열을 출력한다.
			System.out.println(list.get(i));	
	}
}
