import java.util.Scanner;

public class Bank extends Account {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Account[] accountList = new Account[1000];
		int count = 0;
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

				accountList[count] = new Account();
				System.out.print("계좌번호>> ");
				accountList[count].setAccountNumber(sc.next());
				System.out.println();

				System.out.print("예금주>> ");
				accountList[count].setAccountHolder(sc.next());
				System.out.println();

				System.out.print("최초예금액>> ");
				accountList[count].deposit(sc.nextInt());
				System.out.println();

				System.out.print("비밀번호>> ");
				accountList[count].setPassword(sc.next());
				System.out.println();
				System.out.print("'"+accountList[count].getAccountHolder()+"'"+"님의 계좌가 개설되었습니다.");
				break;

			case 2: 
				System.out.println("========== 입금 ==========");
				System.out.print("계좌번호>> ");
				String tmpNumber = sc.next();
				System.out.println();

				System.out.print("입금액>> ");
				int tmpMoney = sc.nextInt();
				System.out.println();

				for (Account i : accountList) {
					if(i.getAccountNumber().equals(tmpNumber)) {
						System.out.println("'"+i.getAccountHolder()+"' 님에게 입금하는게 맞으십니까?" );
					}
				}
				System.out.print("1. 예 . 아니오\n입력>>");
				int num = sc.nextInt();
				if(num == 1)


			} while (number != 6);
			System.out.println("메뉴판을 종료합니다.");
			sc.close();
		}
	}
}