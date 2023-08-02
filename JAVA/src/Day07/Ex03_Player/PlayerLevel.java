package Day07.Ex03_Player;

public abstract class PlayerLevel {

	// 달기리, 점프, 회전
	public abstract void run();
	public abstract void jump();
	public abstract void turn();

	// 난이도 출력 메세지
	public abstract void showLevel();

	// 템플릿 메소드
	final public void go(int count) { // final 타입이라서 상속이 안된다
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
