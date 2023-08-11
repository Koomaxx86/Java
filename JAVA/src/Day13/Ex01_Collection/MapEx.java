package Day13.Ex01_Collection;

import java.util.*;

/**
 * Map
 * : 키(key), 값(value)를 쌍으로 구성한 요소를 다루는 컬렉션
 * * key는 중복되지 않는다.
 * 
 * 요소 추가
 * - put(key, value)	: 키와 값을 추가
 * 						- 중복된 키가 추가되면, 마지막에 추가된 값이 저장된다.
 * 
 * 요소 검색
 * - get(key)			: 키에 해당하는 값 반환
 * - contains(key)		: 키 존재 여부
 * - isEmpty()			: 값 존재 여부
 * - size()				: 요소의 개수
 * - keySet()			: 모든 키를 Set 객체로 반환
 * - values()			: 모든 값을 Collection 객체로 반환
 * 
 * 요소 삭제
 * - remove(key)		: 키에 해당하는 값 삭제
 * - clear()			: 모든 요소 삭제
 */

// 만들어지는 순서는
public class MapEx {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		// 요소 추가
		map.put("RM", 90);
		map.put("진", 100);
		map.put("슈가", 70);
		map.put("정국", 95);
		map.put("뷔", 60);
		map.put("제이홉", 50);
		map.put("지민", 80);

		map.put("RM", 99);		// 중복된 키를 입력하면, 마지막에 추가한 값으로 지정된다.

		System.out.println("총 개수 : " + map.size());
		System.out.println();
		
		System.out.println("지민의 코딩성적 : " + map.get("지민"));
		System.out.println("RM의 코딩성적 : " + map.get("RM"));
		System.out.println();
		
		// keySet() : 모든 키를 가져온다
		Set<String> keySet = map.keySet(); 
		
		for (String key : keySet) {  // foreach문은 순차 출력인 데 map은 무작위. 순서가 어떻게?
			Integer value = map.get(key); // key값을 기준으로 출력
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		map.remove("지민");
		System.out.println("총 개수 : " + map.size());
		System.out.println();
		
		// Iterator 를 이용한 반복
		// map.entrySet()			: iterator() 메소드를 갖는 Set 객체를 반환
		// entrySet.iterator()		: Map 컬렉션을 순차검색할 수 있는 iterator 객체를 가져옴
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Set인터페이스에 Map.Entry(이너인터페이스)
		Iterator<Map.Entry<String, Integer>> entryIterator = map.entrySet().iterator();
		
		while ( entryIterator.hasNext() ) {
			Map.Entry<String, Integer> entry = entryIterator.next(); // key와 value값을 저장할수 있는 entry
			String key = entry.getKey(); 		// 키
			Integer value = entry.getValue();	// 값
			
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		map.clear();		// 모든요소 삭제
		
		System.out.println("총 개수 : " + map.size());
		System.out.println("empty 여부 : " + map.isEmpty());
	}
}
