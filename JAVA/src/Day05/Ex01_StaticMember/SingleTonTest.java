package Day05.Ex01_StaticMember;

public class SingleTonTest {
	public static void main(String[] args) {
		
		SingleTon st01 = SingleTon.getInstance(); // getter 메소드로 기 생성된 객체의 주소를 반환한다(ex - 0x100)
		SingleTon st02 = SingleTon.getInstance(); // getter 메소드로 기 생성된 객체의 주소를 반환한다(ex - 0x100)
		
		// 인스턴스가 메모리 공간에 하나만 할당되어 있다.
		System.out.println(st01 == st02); // st01, st02 둘다 동일한 객체의 주소값을 가르킨다
	}
}
