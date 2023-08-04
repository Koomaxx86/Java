package Day08.Ex05_MultiInterface;

// 마이크의 인터페이스
public interface Microphone { 

	int inputVolumeMax = 50;		//음성 인식 최대 볼륨. 상수. public, static, fainal이 생략되어 있다.
	int inputVolumeMin = 5;			//음성 인식 최소 볼륨. 상수. public, static, fainal이 생략되어 있다.
	
	// 음성인식
	String receiveVoice(String voice); // 추상메소드. public abstract 가 생략되어 있다.
}
