package Day07.Ex02_Computer;

// 상속받은 클래스가 추상 메소드중 일부를 완성하고,
// 자식 클래스에서 남은 추상메소드를 완성하면 정상적인 클래스가 된다.
public class Gram extends Laptop {

	@Override
	public void typing() { // Laptop에 display가 이미 구현되었다.
		System.out.println("Gram - typing");
	}

	
}
