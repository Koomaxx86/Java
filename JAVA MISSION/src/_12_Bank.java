import java.util.Scanner;

public class _12_Bank extends _12_Account {
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		_12_Account[] accountList;
		_12_Account account = new _12_Account();
		
		int number;

		do {

			System.out.println("=======================");
			System.out.println("1. 계좌등록");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 계좌조회");
			System.out.println("5. 계좌목록");
			System.out.println("6. 종료");
			System.out.println("=======================");
			System.out.println("입력>>");

			number = sc.nextInt(); //번호입력

			switch(number) {
			case 1: 
				System.out.print("계좌번호>>");
				System.out.println();
				account.setAccountNumber(sc.next());
				
				System.out.print("예금주>>");
				System.out.println();
				account.setAccountHolder(sc.next());
				
				System.out.print("최초예금액>>");
				account.deposit(sc.nextInt());
				System.out.println();
				
				System.out.print("비밀번호>>");
				account.setPassword(sc.next());
				System.out.println();
				System.out.print("'"+account.getAccountHolder()+"'"+"님의 계좌가 개설되었습니다.");
				break;
				
			case 2: 
				System.out.print("계좌번호>>");
				System.out.println();
				account.setAccountNumber(sc.next());
				
				System.out.print("예금주>>");
				System.out.println();
				account.setAccountHolder(sc.next());
				
				System.out.print("최초예금액>>");
				account.deposit(sc.nextInt());
				System.out.println();
				
				System.out.print("비밀번호>>");
				account.setPassword(sc.next());
				System.out.println();
				System.out.print("'"+account.getAccountHolder()+"'"+"님의 계좌가 개설되었습니다.");
				break;
				
			case 3: number = "쌀국수"; break;
			case 4: number = "라면"; break;
			case 5: number = "돈까스"; break;
			case 6: number = "버거킹"; break;
			}
			
		} while (number != 6);
		System.out.println("메뉴판을 종료합니다.");
		sc.close();
	}
}
