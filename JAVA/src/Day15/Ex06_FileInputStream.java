package Day15;

import java.io.FileInputStream;

public class Ex06_FileInputStream {
	public static void main(String[] args) {

		// 바이트 타입의 객체 생성
		byte[] data = new byte[100];

		try {
			// 입력을 받아드릴 파일 연결
			// 이미지나 파일등을 가져올때는 바이트 스트림을 쓴다.
			FileInputStream fin = new FileInputStream("./src/Day15/Test.out");
			int i = 0, b;
			// read메소드를 사용해서 한글자씩 읽어온다. int형 반환. -1반환시 종료
			while( (b = fin.read() ) != -1 ) {
				data[i] = (byte) b; 			// 읽어온 문자 b 를 바이트 배열에 형변환 하여 대입
				i++;
			}
			for (byte a : data) {
				
				System.out.print((char)a);
			}
			System.out.println();
			fin.close();
		} catch (Exception e) {
			System.out.println("입출력시, 예외가 발생하였습니다.");
			e.printStackTrace();
		}
		
	}
}
