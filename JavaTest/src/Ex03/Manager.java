package Ex03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Manager {
	
	public static LinkedList<Student> getTxtToList(LinkedList<Student> list) {

		try {
			// student.txt파일의 파일타입 객체생성
			File file = new File("student.txt");
			Scanner sc = new Scanner(file);
			Student std;

			// 다음 내용이 없을떄까지 반복
			while (sc.hasNextLine()) {
				// student.txt에서 한줄 씩 읽어들여서 stn에 저장
				String stn = sc.nextLine();
				// stn에서 읽어온 글자를 /로 구분하여 배열에 저장
				String[] data = stn.split("/");
				// 0번 index의 요소를 int형으로 변환 후 no에 저장
				int no = Integer.parseInt(data[0]);
				// 1번 index의 요소를 String로 변환 후 name에 저장
				String name = data[1];
				// 2번 index의 요소를 int형으로 변환 후 score에 저장
				int score = Integer.parseInt(data[2]);
				// 3번 index의 요소를 String로 변환 후 className에 저장
				String className = data[3];
				// 형변환 한 모든 데이터를 생성자로 넘겨서 Student 객체를 생성
				std = new Student(no, name, score, className);
				list.offer(std);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	public static void main(String[] args) {
		System.out.println();
	}
}

