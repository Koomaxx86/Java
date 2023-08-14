package Day15;

import java.io.*;

public class Ex05_TextFileCopy {
	public static void main(String[] args) {

		// Text.txt 파일을 Test4.txt 파일로 복사
		FileReader fr = null;
		FileWriter fw = null;

		int data = 0;

		try {
			fr = new FileReader("./src/day15/Test.txt"); // Test파일과 연결
			fw = new FileWriter("./src/day15/Test4.txt"); // Test4와 연결

			while( (data = fr.read()) != -1) { // read를 통해 한글자씩 읽어온다.
				fw.write(data); // 읽어온(Test)를 test4에 작성
			}
			
			fr.close();
			fw.close();
			System.out.println("파일이 복사되었습니다.");
			System.out.println("Test.txt -> Test4.txt");
		} catch (IOException e) {
			System.err.println("입출력 시, 예외가 발생하였습니다.");
			e.printStackTrace();
		}

	}
}
