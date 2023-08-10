package Day12;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
public static void main(String[] args) {
	
	Set<Integer> set = new HashSet<Integer>();
	
	
	// 1, 2, 3, 4, 5
	System.out.println( set.add(1) ); // true / false 확인을 위해 프린트문 안에 선언
	System.out.println( set.add(2) );
	System.out.println( set.add(3) );
	System.out.println( set.add(4) );
	System.out.println( set.add(5) );
	System.out.println();
	
	for (Integer item : set) {
		System.out.println("item : " + item);
	}
	System.out.println();
	
	// 이미 존재하는 3, 5를 추가
	System.out.println( set.add(3));
	System.out.println( set.add(5));
	System.out.println();
	
	for (Integer item : set) { // 3, 5 데이터 재확인
		System.out.println("item : " + item);
	}
	System.out.println();
	
	set.remove(3);
	set.remove(5);
	System.out.println("size : " + set.size());
	System.out.println();
	
	for (Integer item : set) {
		System.out.println("item : " + item);
		
	}
	
}
}
