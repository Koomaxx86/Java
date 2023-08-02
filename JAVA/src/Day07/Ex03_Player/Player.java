package Day07.Ex03_Player;

public class Player {

	// 선수의 난이도
	private PlayerLevel level; // 조상 타입의 level 선언
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevel();
	}

	
	//getter
	public PlayerLevel getLevel() {
		return level;
	}
	
	// 레벨 변경 기능
	public void upgrade(PlayerLevel level) {
		this.level = level;
		level.showLevel();
	}
	
	public void play(int count) {
		level.go(count); // PlaterLevel 템플릿 메서드 호출. 
	}
	
}
