package Day15;

import java.io.InputStreamReader;

public class Ex01_InputStreamReader {
	public static void main(String[] args) {

		// 문자 스트림 클래스
		// System.in : 키보드로부터 문자 입력받는 인자
		// System.in을 통해서 키보드로 부터 문자열을 입력받는다.
		InputStreamReader is = new InputStreamReader(System.in);

		while(true)	{ // 무한 반복문
			
			char ch = 0; // 추출된 문자열을 저장하기 위해서 char타입의 ch를 선언 후 초기화 한다.

			try { // try문 안에 스트림을 넣음으로써 예외발생시 예외를 처리한다.
				ch = (char)is.read(); // InputStreamReader의 read 메소드 호출. read메소드는 저장된 문자열을 한 글자씩 int타입으로 반환한다.
									  // 반환된 int 타입을 문자로 출력하기 위해 char형으로 형변환 한뒤 ch에 저장한다.	
			} catch (Exception e) {   // 최상위 예외처리인 Exception을 통해 예외를 처리한다.
				e.printStackTrace();  // printStackTrace 예외처리를 통해 예외를 추적한다.
			}
			
			// InputStreamReader.read() 는 이상 읽어올 문자가 없으면 -1을 반환 한다.(ctrl + Z 입력)
			if ( ch == -1) { // if문을 통해서 read메소드가 -1을 반환하면 더 이상 읽어올 문자가 없다는 의미 이므로 break를 통해 읽어오기를 중지한다.
				break;
			}
			System.out.println(ch); // read를 통해 읽어온 ch를 한 글자씩 출력한다.
		}
	}
}