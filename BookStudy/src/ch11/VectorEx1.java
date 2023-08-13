package ch11;

import java.util.*;

public class VectorEx1 {
	public static void main(String[] args) {

		Vector v = new Vector(5); // 용량(capacity)이 5인 Vector을 생성한다.
		// 크기(실제자료가 저장된)가 3이고 용량(비어있는 공간까지 포함안 배열의 용량)이 5인 배열 생성  
		v.add("1"); // Vector타입으로 생성한 v를 통해 add메소드로 문자타입 요소 1을 저장
		v.add("2");
		v.add("3");
		print(v); // 프린트 메소드. 참조변수 v의 참조값(예시: 0x100)

		// trimToSize 메소드를 통해 배열에 비어있는 공간을 삭제한다.
		// trimToSize : size(크기)에 맞게 capacity(용량)을 줄인다
		// 배열의 크기는 변경이 불가능하기에 trimToSize를 실행한 새로운 객체를 생성 후 새로운 주소값을 v에 할당한다.
		v.trimToSize();
		System.out.println("=== After trimToSize() ===");
		print(v); // 참조변수 v의 참조값이 변경되었다. 참조변수 v의 참조값(예시: 0x200)

		// ensureCapacity 메소드를 통해 배열의 용량을 늘린다.
		// ensureCapacity(n) : 배열의 Capacity(용량)을 n으로 늘린다.(기 생성된 capacity보다 늘릴수는 없다) 
		// 기존 배열의 크기 변경이 불가능 하기에 ensureCapacity를 실행한 새로운 객체를 생성 후 새로운 주소값을 v에 할당한다.
		v.ensureCapacity(6);
		System.out.println("=== After ensureCapacity(6) ===");
		print(v); // 참조변수 v의 참조값이 변경되었다. 참조변수 v의 참조값(예시: 0x300)

		// setSize 메소드를 통해 배열의 크기를 7로 늘린다.
		// setSize(n) : 배열의 Size(크기)를 n으로 늘린다. (기존 크기가 n 이상일 경우 뒤에서 부터 요소가 제거되고 생성된다)
		// 기존 배열의 크기 변경이 불가능 하기에 ensureCapacity를 실행한 새로운 객체를 생성 후 새로운 주소값을 v에 할당한다.
		// 크기를 n으로 변경하면 요소의 갯수가 n보다 작아도 Size는 n으로 취급되며 빈 공간은 null값을 가진다.
		v.setSize(7);
		System.out.println("=== After setSize(7) ===");
		print(v);// 참조변수 v의 참조값이 변경되었다. 참조변수 v의 참조값(예시: 0x400)

		// clear 메소드로 배열의 모든 요소를 삭제한다.
		// 참조값의 변화는 없다.
		v.clear();
		System.out.println("=== After clear() ===");
		print(v); // 참조변수 v의 참조값이 변경되지 않는다. 참조변수 v의 참조값(예시: 0x400)
	}

	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size :" + v.size());
		System.out.println("capacity :" + v.capacity());
		System.out.println();
	}
}
