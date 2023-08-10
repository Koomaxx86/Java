package Day13.Ex01_Collection;

import java.util.*;

public class VectorEx {

	public static void printList(List<?> list) { // list 하위를 다루기 위해 list로 제한. 와일드카드 사용으로 여러 요소를 받을수 있다.
		
		if ( list == null || list.isEmpty() ) { // null은 주소값이 없음. isEmpty는 내용이 없음
			System.out.println("요소가 없습니다.");
			return;
		}
		
		Iterator<?> it = list.iterator(); 		// iterator 인터페이스
		while ( it.hasNext() ) {
			Object item = it.next();
			System.out.print(item);
			if( it.hasNext()) 					// 남은요소 확인
				System.out.print(", ");
			else System.out.println();
		}
	}

	public static void main(String[] args) {

		// 컬렉션 객체 생성
		// 컬렉션타입<요소타입> 변수명 = new 클래스명<요소타입>();

		// 벡터 객체 생성
		Vector<String> vector = new Vector<String>(10); // 기본용량은 10이다. 입력을 안하면 10으로 생성한다.
														// 요소타입을 String으로 지정했다.
		// 요소 추가
		vector.add("아메리카노"); 
		vector.add("청포도에이드");
		vector.add("인크레드불");
		vector.add("초코우유");

		// 개수, 용량확인
		System.out.println("개수 : " + vector.size()); // 요소의 갯수
		System.out.println("용량 : " + vector.capacity()); // 배열 갯수
		System.out.println();

		// 검색
		// 반복 방법1
		System.out.println(">>반복 1");
		for (int i = 0; i < vector.size(); i++) {
			String item = vector.get(i);				// vector에서는 get메소드로 index에 접근 후 item에 저장
			System.out.println("메뉴 이름 : " + item);
		}
		System.out.println();

		// 반복 방법2
		System.out.println(">>반복 2");
		for (String item : vector) { // foreach문
			System.out.println("메뉴 이름 : " + item);
		}
		System.out.println();

		// 반복 방법3
		System.out.println(">>반복 3");
		// Iterator 를 이용한 반복
		// Iterate = "반복하다", Iterator - "반복자"
		// 해당 리스트 컬렉션으로부터 Iterator 객체를 가져와서 반복할 수 있음

		// Iterator 메소드
		// hasNext()			: 다음 요소의 존재여부
		// next()				: 다음 요소를 반환
		// 컬렉션객체.iterator() 	: 해당 컬렉션에 대한 iterator 객체를 반환
		
		

		System.out.println(">>반복 3");
		// vector컬렉션객체에 대한 iterator객체 반환. 인터페이스 Iterator타입의 it로 저장
		Iterator<String> it = vector.iterator(); 
		while ( it.hasNext() ) {
			String item = it.next();
			System.out.print(item);
			if( it.hasNext()) 					 // 남은요소 확인
				System.out.print(", ");
			else System.out.println();
			System.out.println("-----------------------------------------------");
			
			System.out.println("(삭제 전 출력)");
			printList(vector);

			
			// 삭제
			// - 삭제할 때, index가 앞으로 한 칸씩 당겨진다
										// 0			1			2			3
										// 아메리카노		청포도에이드	인크레드불		초코우유
			vector.remove(0);			// 청포도에이드		인크레드불		초코우유
			vector.remove(1);			// 청포도에이드		초코우유
			vector.remove("청포도에이드");	// 초코우유
			vector.remove("초코우유");		// empty (요소없음)

			System.out.println("(삭제 후 출력)");
			printList(vector);
			System.out.println("--------------------------------------------------");
			
			// 컬렉션.isEmpty() : 요소가 하나도 없으면 true, 비어있지 않으면 false
			if( vector.isEmpty()) {
				System.out.println("메뉴가 없습니다.");
			} else {
				printList(vector);
			}
			
			Scanner sc = new Scanner(System.in);
			List<String> newMenuList = new Vector<String>();
			System.out.println("메뉴 추가하기 (종료 : 0)");
			do {
				System.out.print("추가 메뉴 : ");
				String menu = sc.nextLine();
				if( menu.equals("0")) break;
				newMenuList.add(menu);
			} while (true);
			
			System.out.println("##### [vector] #####");
			printList(vector);
			System.out.println("##### [newMenuList] #####");
			printList(newMenuList);
			
			vector.addAll(newMenuList);		// vector <- newMenuList의 요소 모두 추가
			System.out.println("##### [vector] #####");
			printList(vector);
			
			sc.close();
		}
	}
}