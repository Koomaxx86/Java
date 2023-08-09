package Day12.Ex01_Time;

import java.time.LocalDateTime;

public class DateTimeOperation {
	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();

		System.out.println("현재 시간 : " + now);

		// 날짜, 시간 추가하기
		// +1년 +1개월 +1일 -3시간 -15분 -25초
		// (메소드 체이닝), 빌더 패턴
		LocalDateTime targetTime = now.plusYears(1).plusMonths(1).plusDays(1).plusHours(-3).plusMinutes(-15).plusSeconds(-25);
		
		System.out.println("변경 시간 : " + targetTime); // 위에서 증가된 값이 출력된다.
	}
}
