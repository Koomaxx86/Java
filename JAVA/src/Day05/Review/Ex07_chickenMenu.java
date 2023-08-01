package Day05.Review;
import java.util.Scanner;

public class Ex07_chickenMenu {

public static void menu() {
	System.out.println("########## 메 뉴 판 ##########");
	System.out.println("1. 굽네치킨 - 볼케이노 치킨");
	System.out.println("2. BBQ - 황금올리브 반반 치킨");
	System.out.println("3. 교촌치킨 - 허니콤보 치킨");
	System.out.println("4. BHC - 뿌링클");
	System.out.println("5. 레드락 치킨 - 양념치킨");
	System.out.print("########## 입력 :");
	}

public static String selectMenu(int menuNo) {
	String menuName = " ";
	switch(menuNo) {
	case 1: menuName = "굽네치킨 - 볼케이노 치킨"; break;
	case 2: menuName = "BBQ - 황금올리브 반반 치킨"; break;
	case 3: menuName = "교촌치킨 - 허니콤보 치킨"; break;
	case 4: menuName = "BHC - 뿌링클"; break;
	case 5: menuName = "레드락 치킨 - 양념치킨"; break;
	}
	return menuName;
}
			
/*
  ########## 메 뉴 판 ##########
  1. 굽네치킨 - 볼케이노 치킨
  2. BBQ - 황금올리브 반반 치킨
  3. 교촌치킨 - 허니콤보 치킨
  4. BHC - 뿌링클
  5. 레드락 치킨 - 양념치킨
  ########## 입력 :
  
  메뉴번호에 따라 메뉴 변수에 해당메뉴를 저장해주고,
  "(해당메뉴) 이 주문되었습니다." 라고 출력하시오.
  0을 입력하기 전까지 반복하고,
  0을 입력하면 반복을 종료합니다.
  종료 시, "?개의 주문을 완료합니다." 라고 출력하시오.
*/

public static void main(String[] args) {
	
	int menuNo = 0;
	String menuName = " ";
	int count = 0;
	Scanner sc = new Scanner(System.in);
	
	do {
		
		menu();
		
		menuNo = sc.nextInt();

		if(menuNo == 0) break;
		
		menuName = selectMenu(menuNo);

		if(menuNo >= 1 && menuNo <= 5) {
			System.out.println(menuName +"이 주문되었습니다.");
			System.out.println();
			++count;
		}

	} while (menuNo != 0);
	System.out.println(count+"개의 주문을 완료합니다.");
	
	sc.close();
	}
}
