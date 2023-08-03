package Day07.Ex03_Player;

public class Player {

	// 선수의 난이도
	private PlayerLevel level; // 조상 타입의 level 선언
	
	//기본생성자
	public Player() {
		level = new BeginnerLevel(); // 기본값으로 level에는 비기너가 들어간다
		level.showLevel(); // player 호출시 기본값으로 showlevel 호출
	}

	
	//getter
	public PlayerLevel getLevel() {
		return level;
	}
	
	// 레벨 변경 기능
	public void upgrade(PlayerLevel level) { // 전달받은 참조변수의 주소를 level에 저장
		this.level = level;
		level.showLevel();
	}
	
	public void play(int count) { // level.go의 메소드 호출
		level.go(count); // PlayerLevel 템플릿 메서드 호출. 
	}
	
}
