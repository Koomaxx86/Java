package ch11;

import java.util.*;

public class ArrayListEx1 {
	public static void main(String[] args) {

		ArrayList list1 = new ArrayList(10); // 길이가 10인 ArrayList 생성
		// ArrayList에는 객체만 저장가능
		list1.add(5); // autoboxing에 의해 기본형이 참조형으로 자동변환
		list1.add(4); // autoboxing에 의해 기본형이 참조형으로 자동변환
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		// List subList메소드 사용. list1의 subList메소드를 사용해 1번 ~ 3번까지의 객체를 반환 후 list2에 저장한다.
		// 읽기만 할꺼라면 list1.subList만 사용해도 된다
		// 아래 코드는 코드를 불러옴과 동시에 객체를 생성한다.
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);

		// Collection 은 인터페이스, Collections는 유틸 클래스
		Collections.sort(list1); // list1 과 list2를 정렬한다.
		Collections.sort(list2); // Collections.sort(List 1)
		print(list1, list2);

		// list1이 list2의 모든 요소를 포함 하고 있는지 확인하는 메소드
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

		list2.add("B"); // 배열에 내용을 추가했다. 맨뒤에서 부터 추가가 된다.
		list2.add("C");
		list2.add(3, "A"); // 원하는 index에 A를 추가한다.
		print(list1, list2);

		list2.set(3, "AA"); // 원하는 index의 내용을 삭제 후 AA로 변경한다.
		// list1.remove(1); // 인덱스가 1인 객체를 삭제
		// list1.remove(new Integer(1)); // 값이 1인 객체를 삭제
		print(list1, list2);

		// list1에서 list2와 곂치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("lise1.retainAll(list2):" + list1.retainAll(list2));
		print(list1, list2);

		// list2에서 list1에 포함된 객체들을 삭제한다.
		for (int i = 0; i < list2.size() - 1; i++) {
			// get메소드를 통해 객체를 하나씩 반환 후 contains를 통해 비교한다
			if (list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:" + list1);
		System.out.println("list2:" + list2);
		System.out.println();
	}
}
