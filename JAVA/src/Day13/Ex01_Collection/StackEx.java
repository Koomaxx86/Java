package Day13.Ex01_Collection;

import java.util.*;

public class StackEx {
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();

		System.out.println("empty : " + stack.isEmpty());

		// push(요소) : 요소를 TOP 위에 추가
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		System.out.println("empty : " + stack.isEmpty());
		System.out.println("1 포함 여부 : " + stack.contains(1)); // 값 포함여부 확인

		for (Integer item : stack) {
			System.out.println("item : " + item);
		}

		// peek()		: TOP의 데이터를 반환
		System.out.println("TOP : " + stack.peek()); // 최상위 요소의 값 확인
		System.out.println("size : " + stack.size()); // 요소의 갯수 확인

		// pop()		: TOP의 요소를 삭제
		stack.pop();					// 최상위 삭제
		stack.remove(1);				// index로 삭제
		stack.remove( (Integer) 3 );	// 객체를 지정하여 삭제(내부 값)

		for (Integer item : stack) {
			System.out.println("item : " + item);
		}

		stack.clear();
		System.out.println("empty : " + stack.isEmpty());
	}
}
