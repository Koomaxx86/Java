package Day15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02_FileReader {
	public static void main(String[] args) {

		// FileReader - 문자 스트림 클래스
		// 문자를 다룰때 사용한다.
		// new FileReader("파일경로");
		FileReader fr = null; // FileReader형식의 fr참조변수 선언 후 null값으로 초기화 한다.

		try { // 예외 발생시 처리를 위한 try문
			// 해당 파일을 스트림 클래스로 다루기 위해서 스트림클래스와 파일을 연결해야된다.
			fr = new FileReader("./src/Day15/test.txt"); // FileReader 객체를 생성 후 생성자로 연결할 파일의 경로를 적어준다.
			int data = 0; // 읽어온 데이터를 저장할 data선언 후 0으로 초기화
			
			// read()	: 한 문자씩 읽어와서 int 타입으로 반환
			//			: 더 이상 읽어올 문자가 없으면 -1 반환
			while( (data = fr.read()) != -1) { // fr에 연결된 파일에 접근하여 read메소드를 통해서 한글자씩 읽어들여 data에 저장.
				System.out.print( (char) data );	// 읽어드린 data안에 글자를 char로 변환해서 출력
			}
			
			System.out.println();
			System.out.println("인코딩 타입 : " + fr.getEncoding()); // getter을 통해 Ex02_FileReader의 메소드인 Encoding메소드를 읽어온다.
			fr.close();											  // Encoding메소드는 encoding 정보를 반환해준다.
			
		} catch (FileNotFoundException e) { // 파일의 연결, 상태에 관한 문제가 발생시 출력되는 예외
			System.err.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		} catch (IOException e) { // 문자열에 관련된 예외가 발생시 출력되는 예외
			System.err.println("문자 입력 시 예외가 발생하였습니다.");
			e.printStackTrace();
		}
		
	}
}
