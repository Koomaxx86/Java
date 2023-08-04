package Day08.Ex05_MultiInterface;

// 인터페이스 다중 상속
// public interface 인터페이스명 extends 인터페이스A, 인터페이스B...{}
// 인터페이스는 다른 인터페이스를 extends로 상속 받아야된다.
// implements는 사용 불가
// 스마트리모컨에 기능을 합칠 remotecontrol과 microphone를 합친다.
public interface SmartRemoteControl extends RemoteControl, Microphone {

	// 터치패드 기능
	// -x, y 좌표 위치에 터치패드를 클릭
	void touch(int x, int y);
}
