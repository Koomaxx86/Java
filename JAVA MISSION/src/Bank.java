import java.util.Scanner;

public class Bank extends Account {

	static Account[] accountList = new Account[1000];
	static Scanner sc = new Scanner(System.in);
	static String adminPassworld = "1111";

	// 출금 금액 한도 체크
	static void check(int money) {
		if (money < account.MIN_TRANSFER || account.MAX_TRANSFER < money)
			System.out.print("1원 ~ 100만원까지만 송금가능합니다. ");
	}

	// 비밀번호 확인
	static void accountPasswordCheck(String tmpPassword) {
		for (Account i : accountList) {
			if (i.getPassword().equals(tmpPassword)) {
				continue;
			} else {
				break;
			}
		}
	}

	public static void main(String[] args) {

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
				System.out.print("계좌번호>> ");
				accountList[count] = new Account();
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

				count++;
				break;

			case 2: 
				System.out.println("========== 입금 ==========");
				System.out.print("계좌번호>> ");
				String tmpNumber = sc.next();
				
				System.out.print("입금액>> ");
				int tmpMoney = sc.nextInt();
				check(tmpMoney);
				System.out.println();

				for (Account i : accountList) {
					if (i.getAccountNumber().equals(tmpNumber)) {
				System.out.println("'"+i.getAccountHolder()+"' 님에게 입금하는게 맞으십니까?" );}
				System.out.print("1. 예\n2.아니오\n입력>> ");
				int num = sc.nextInt();
				if(num == 1) {
					System.out.println("'"+i.getAccountHolder()+"' 님의 계좌에 "+tmpMoney+"원이 입금되었습니다.");
					i.deposit(tmpMoney);
				} else {
					break;
				}

			case 3:
				System.out.println("========== 출금 ==========");
				System.out.print("계좌번호>> ");
				tmpNumber = sc.next();

				System.out.print("비밀번호>> ");
				String tmpPassword = sc.next();
				accountPasswordCheck(tmpPassword);
				System.out.println();

				System.out.print("출금액>> ");
				tmpMoney = sc.nextInt();
				check(tmpMoney);
				System.out.println("'"+i.getAccountHolder()+"' 님의 계좌에 "+tmpMoney+"원이 출금되었습니다.");
				i.Withdrawal(tmpMoney);
				break;

			case 4:
				System.out.println("========== 계좌조회 ==========");
				System.out.print("계좌번호>> ");
				String acountNumber = sc.next()
						accountNumberCheck(acountNumber);
				System.out.print("비밀번호>> ");
				String tmpPassword = sc.next();
				accountPasswordCheck(tmpPassword)
				System.out.println("'"+i.getAccountHolder()+"' 님의 계좌 잔액은 "+getBalance+"원 입니다.");
				break;

			case 5:
				System.out.println("입력>> ");
				System.out.println("관리자 비밀번호>> ");
				if(adminPassworld.equls(sc.next()) ? continue : break);
				System.out.print("예금주\t계좌번호\t잔고");
				for(Account i : accountList)
					System.out.print(i.accountHolder()+"/t"+i.accountNumber+"/t"+i.Balance);
				break;

			case 6:
				System.out.print("시스템을 종료합니다.");
			} 
		} while (number != 6);
	}
}
