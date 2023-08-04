package Day08.Ex05_MultiInterface;

// 다중 구현
// public class 클래스명 implements 인터페이스A, 인터페이스B ...{ }
// 스마트 텔레비전 객체를 생성하기위해서 스마트리모컨과 서치 기능을 implements했다.
public class SmartTelevision implements SmartRemoteControl, Searchable {

	int volume; // 볼륨 변수 선언
	int channel; // 채널 변수 선언
	String keyword; // 키워드 변수 선언
	int x, y; // 터치패드 좌표

	@Override
	public void turnOn() { // remotecontrol의 추상메소드 오버라이딩 후 완성
		System.out.println("전원 ON");
	}

	@Override
	public void turnOff() { // remotecontrol의 추상메소드 오버라이딩 후 완성
		System.out.println("전원 OFF");
	}

	@Override
	public void setVolume(int volume) { // remotecontrol의 추상메소드 오버라이딩 후 완성
		this.volume = volume;
		System.out.println("volume : " + volume);
	}

	@Override
	public String receiveVoice(String voice) { // Microphone의 추상메소드 오버라이딩 후 완성
		System.out.println("음성 입력 : " + voice);
		return "voice : " + voice;
	}

	@Override
	public int channelSearch(String keyword) { // searchable의 추상메소드 오버라이딩 후 완성
		int channel = 0;

		switch (keyword) {
		case "Mnet":
			channel = 27;
			break;

		case "SBS":
			channel = 5;
			break;

		case "KBS":
			channel = 7;
			break;

		case "MBC":
			channel = 11;
			break;
		}
		return channel; // 전달받은 문자열에 맞는 channel값을 int 타입으로 리턴한다
	}

	@Override
	public String[] contentSearch(String keyword) {
		String[] movieContent = { "엘리멘탈", "범죄도시3", "미션임파서블", "인시디어스", "타짜" };
		String[] idolContent = { "뉴진스", "BTS", "피프티피프티", "르세라핌", "이미테이션레이블" };
		String[] recommendContent = { "추천 컨텐츠", "메타 코미디 클럽", "숏박스", "쯔양 먹방" };
		String[] choiceContent;

		switch (keyword) {
		case "영화":
			choiceContent = movieContent;
			break;

		case "아이돌":
			choiceContent = idolContent;
			break;

		default:
			choiceContent = recommendContent;
			break;
		}
		return choiceContent;
	}

	@Override
	public void touch(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("(x, y) : " + x + ", " + y);
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.println("channel : " + channel);
	}
}
