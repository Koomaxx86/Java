package Day07.Ex02_Computer;

public abstract class Computer {

	// 추상메소드를 정의하면, abstract 키워드를 붙여주어야 한다.
	// 추상메소드를 정의하면, 클래스도 추상 클래스로 정의해야한다.
	public abstract void display(); // 추상 메소드
	public abstract void typing(); // 추상 메소드

	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}
