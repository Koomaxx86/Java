package Day03;

public class Ex04_Foreach {
	public static void main(String[] args) {
		String[] week = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};

		for (int i = 0; i < week.length; i++) { // week의 길이만큼 반복
			System.out.print(week[i] + " "); // 0번 인덱스의 요소값을 week의 길이값 만큼 출력
		}
		System.out.println();
		// foreach : ctrl + space
		// foreach 문
		// 배열 또는 컬렉션의 모든 요소를 순서대로 반복하는 반복문
		// for( 요소타입 요소명 : 배열) {}
		for (String day : week) { // day변수에 week를 하나씩 입력
			System.out.print(day + " "); // day : week[i]. 입력된 day값을 출력
		}
		System.out.println();
	}
}
