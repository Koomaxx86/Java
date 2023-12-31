package Day13.Ex01_Collection;

import java.util.*;

/*
 *  Stack
 *  : "쌓다"
 *  데이터를 한 쪽 방향에서 추가하고 삭제할 수 있는 자료구조
 *  최상위 데이터 : TOP
 *  
 *  자료추가 - Push	: TOP 위에 데이터를 추가
 *  자료삭제 - Pop		: TOP 의 데이터를 삭제
 *  
 *  Last In First Out(L.I.F.O / 후입선출)
 *  "마지막에 추가된 데이터가 먼저 삭제된다."
 */

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
