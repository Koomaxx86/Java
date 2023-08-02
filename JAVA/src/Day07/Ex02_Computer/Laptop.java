package Day07.Ex02_Computer;

// 추상 클래스의 추상 메소드를 구현하지 않으면,
// 해당 클래스를 추상 클래로 정의해야한다.
public abstract class Laptop extends Computer {

	@Override
	public void display() { // 오버라이딩 된 추상메소드
		System.out.println("Laptop - display");
	}
	
	// Computer의 typing 추상메소드를 완성하지 않아서 
	// 본 Laptop class 또한 추상 class이다.

	
	
}
