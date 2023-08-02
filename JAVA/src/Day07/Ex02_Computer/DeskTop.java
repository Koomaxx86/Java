package Day07.Ex02_Computer;

// 부모 클래스의 추상메소드는 반드시 오버라이딩 해야된다
public class DeskTop extends Computer {

	@Override
	public void display() { // 오버라이딩 된 추상메소드
		System.out.println("DeskTop - display");
	}

	@Override
	public void typing() { // 오버라이딩 된 추상메소드
		System.out.println("DeskTop - typing");
	}
	

}
