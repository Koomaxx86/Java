package Day15;

import java.io.FileWriter;
import java.io.IOException;

// 연결된 파일에 문자열을 저장하는 클래스
public class Ex03_FileWriter {
public static void main(String[] args) {

	FileWriter fw = null; // FileWriter타입의 참조변수 fw선언 후 null값으로 초기화
	String str = "텍스트 파일에 출력할 내용"; // 저장할 문자열을 선언
	
	try {
		fw = new FileWriter("./src/Day15/test2.txt");	// FileWriter객체 생성 후 스트림과 경로의 파일을 연결
		// write메소드 호출. 인자로 str타입, 시작 index번호, 길이를 주면 된다.
		fw.write(str, 0, str.length());					// write 메소드에서 전달받은 문자열을 배열화 하여 출력한다.
		fw.close();										// 자원해제	
		System.out.println("텍스트 파일이 저장되었습니다.");
	} catch (IOException e) {
		System.err.println("입출력 시, 예외가 발생하였습니다.");
		e.printStackTrace();
	}
}
}
