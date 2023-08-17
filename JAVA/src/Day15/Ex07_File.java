package Day15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// 파일 객체는 정보를 보기 위함이다.
public class Ex07_File {

	static Scanner sc = new Scanner(System.in);

	/**
	 * 메뉴 출력 메소드
	 */
	public static void menu() {
		System.out.println("########## 파일 관리 ##########");	
		System.out.println("1. 디렉토리 생성");
		System.out.println("2. 디렉토리 파일목록");
		System.out.println("3. 파일정보 조회");
		System.out.println("4. 파일 삭제");
		System.out.println("5. 폴더 삭제");
		System.out.println("0. 종료");
		System.out.println("########## 번호 : ");
	}

	/**
	 * 디렉토리 생성하는 메소드
	 * @param filePath
	 */
	public static void makeDirectory(String filePath) {
		// File타입의 객체를 생성하면서 생성자에 filePath(파일의 경로값)을 준다
		File file = new File(filePath);	
		// 폴더 생성 메소드
		// mkdir()		: 생성할 경로의 상위 경로까지 기존 디렉토리가 존재해야한다.
		// mkdirs()		: 생성할 경로의 상위 경로까지 디렉토리를 생성해준다.
		if (file.mkdir()) {
			System.out.println("디렉토리 생성 성공!!!");
		} else {
			System.err.println("디렉토리 생성 실패!!!");
		}
		System.out.println("경로 : " + filePath);
	}


	/**
	 * 디렉토리 파일목록 반환하는 메소드
	 * @param filePath
	 * @return
	 */
	public static File[] listDirectory(String filePath) { 
		System.out.println(filePath);
		System.out.println("------------------------------------");
		File file = new File(filePath); // 필요한 경로를 생성자로 받은 객체를 생성
		// listFiles 메소드를 통해 하위 경로의 있는 파일목록을 file 배열로 반환
		File[] fileList = file.listFiles();	

		for (File subFile : fileList) { // foreach를 통해 fileList 배열의 목록을 하나씩 subFile에 저장
			// lastModified()메소드를 통해 파일의 수정시간을 반환받아서 update에 저장
			// 1970년도 부터 수정된 시간까지의 ms로 반환하게된다.
			long update = subFile.lastModified(); 
			// update에 저장된 ms 값을 날짜와 시간으로 변환하기 위해 Date객체에 생성자로 전달 후 객체로 생성
			Date date = new Date(update);
			// 날짜와 시간을 원하는 양식으로 표현하기 위해 SimpleDateFormat 객체 생성 후 원하는 양식 셋팅
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			// 생성된 SimpleDateFormat 객체에 update값을 가진 date를 인자로 전달하여
			// 미리 셋팅한 SimpleDateFormat의 날짜 양식으로 출력한다
			String updateDate = sdf.format(date);

			System.out.println( subFile.getName() + "\t\t");  // 파일명
			System.out.println( subFile.length() + "\t\t");		// 파일크기
			System.out.println( updateDate + "\t\t");		// 수정일자
			System.out.println();
		}
		System.out.println("------------------------------------");
		return fileList;
	}

	/**
	 * 파일 정보를 조회하는 메소드
	 * @param filePath
	 */
	public static void fileInfo(String filePath) {
		File file = new File(filePath);//파일의 경로를 생성자로 가진 객체 생성
		System.out.print("파일 종류 : ");
		// 파일의 종류를 확인하는 메소드를 통해 지정한 경로의 파일이 디렉토리인지 파일인지 확인
		if( file.isDirectory() ) System.out.println("디렉토리");
		if( file.isFile() ) System.out.println("일반파일");

		//파일 목록 반환하는 2번 항목과 동일
		long update = file.lastModified();
		Date date = new Date(update);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String updateDate = sdf.format(date);

		System.out.println( file.getName() + "\t\t");  // 파일명
		System.out.println( file.length() + "\t\t");		// 파일크기
		System.out.println( updateDate + "\t\t");		// 수정일자
		System.out.println();
	}

	/**
	 * 파일 삭제 메소드
	 * @param filePath
	 */
	public static void deleteFile(String filePath) {

		File file = new File(filePath);

		// exists() 파일이나 디렉토리의 존재여부를 확인하는 메소드.(true/false)
		if( file.exists()) {
			
			// delete()
			// - 파일 삭제 성공 --> true
			// - 파일 삭제 실패 --> false
			// * 하위 경로에 파일이 존재하면 삭제가 되지 않는다.
			if( file.delete()) {
				System.out.println("파일 삭제 성공!!!");
			} else {
				System.out.println("파일 삭제 실패!!!");
			}
		} else {
			System.err.println("파일이 존재하지 않습니다!!!");
		}
	}

	/**
	 * 폴더를 삭제하는 메소드
	 * @param filePath
	 */
	public static void deleteDirectory(String filePath) {
		File file = new File(filePath); // 파일 객체생성
		File[] subFiles = file.listFiles();	// 하위 파일목록 반환. 파일 및 폴더

		// 하위경로에 파일이 있으면, 하위 파일들을 먼저 삭제
		if( subFiles != null) {
			// 하위 경로의 파일들을 삭제
			for (File subFile : subFiles) {
				// 재귀함수
				deleteDirectory(subFile.getPath());
			}
		}

		// 폴더 삭제
		if (file.delete()) {
			System.out.println("폴더 삭제 성공!!!");
		} else {
			System.out.println("폴더 삭제 실패!!!");
		}
	}

	//--------------------------------------------------------------------

	public static void main(String[] args) {

		int menuNo;

		do {
			menu();
			menuNo = sc.nextInt();
			sc.nextLine();

			if ( menuNo == 0 ) break;

			System.out.print("파일 경로 : ");
			String filePath = sc.nextLine();

			switch (menuNo) {
			case 1 :
				// 디렉토리 생성 		- 입력 : 디렉토리 경로
				makeDirectory(filePath);
				break;
			case 2 :
				// 디렉토리 파일 목록 	- 입력 : 디렉토리 경로
				listDirectory(filePath);
				break;
			case 3 :
				// 파일정보 조회 		- 입력 : 파일경로
				fileInfo(filePath);
				break;
			case 4 :
				// 파일 삭제 			- 입력 : 파일 경로
				deleteFile(filePath);
				break;
			case 5 :
				// 폴더 삭제 			- 입력 : 디렉토리 경로
				deleteDirectory(filePath);
				break;

			default :
				break;
			}
		} while(true);
	}
}
