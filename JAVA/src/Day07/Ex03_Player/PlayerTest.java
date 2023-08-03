package Day07.Ex03_Player;

public class PlayerTest {
public static void main(String[] args) {
	
	Player player = new Player(); // 플레이어 객체 생성
	player.play(1); // 생성된 객체의 play 메소드 호출 후 값 1을 넘긴다
	System.out.println("------------------------");
	
	AdvancedLevel level = new AdvancedLevel();
	player.upgrade(level);
	player.play(2);
	System.out.println("------------------------");
	
	SuperLevel level2 = new SuperLevel();
	player.upgrade(level2);
	player.play(3);
	System.out.println("------------------------");
}
}
