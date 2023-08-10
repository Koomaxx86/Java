package ch9;

class Person {
	long id;

	// 메소드 오버라이딩
	public boolean equals(Object obj) {
		if (obj instanceof Person) // instanceof 연산자를 통해 obj을 Person으로 다운 캐스팅이 가능한지 확인
			return id == ((Person)obj).id; // 괄호를 통해 obj를 먼저 Person으로 형변환 한 뒤 .id변수에 접근한다. 
										   // 오버라이딩을 통해 id값이 동일하면 ture를 반환하도록 하였다.
		else
			return false;
	}

	Person(long id) {
		this.id = id;
	}
}

public class EqualsEx2 {
	public static void main(String[] args) {

		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);

		if (p1 == p2) // 두 객체의 메모리 주소를 비교
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다."); // 객체의 주소가 다르기에 false다.

		if (p1.equals(p2)) // 오버라이딩을 통해 조건이 변경된 equals메소드 호출
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");
	}
}
