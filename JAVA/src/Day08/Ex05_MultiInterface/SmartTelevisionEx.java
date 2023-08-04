package Day08.Ex05_MultiInterface;

public class SmartTelevisionEx {
	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision(); // 스마트텔레비전 객체생성
		
		tv.turnOn(); // 오버라이딩된 SmartTelevision의 메소드 호출
		tv.setVolume(20); // 오버라이딩된 SmartTelevision의 메소드 호출 후 int 값 20 전달
		int channel = tv.channelSearch("MBC"); // 오버라이딩된 SmartTelevision의 메소드 호출.
		tv.setChannel(channel); // int형 변수 channel의 값을 전달
		
		String[] idolContent = tv.contentSearch("아이돌");
		System.out.println("========== 검색된 컨텐츠 =========");
		
		for (int i = 0; i < idolContent.length; i++) {
			System.out.println(idolContent[i]);
			if (i < idolContent.length-1) 
				System.out.print(", ");
			}
		
		System.out.println();
		tv.receiveVoice("오늘 날씨 어떄?");
		
		tv.turnOff();
		}
	}

