
public class _12_Account {
	
	String accountNumber;		// 계좌번호
	String accountHolder;		// 예금주
	int Balance;					// 잔액
	String Password;					// 비밀번호
	
	final int MIN_BALANCE = 0;			// 최소잔액
	final int MAX_BALANCE = 1000000000;	// 최대잔액
	
	final int MIN_TRANSFER = 1;			// 최소입출금액
	final int MAX_TRANSFER = 1000000;	// 최대입출금액
	
	// 예금
	public void deposit(int money) {
		Balance += money;
	}

	// 인출
	public void Withdrawal(int money) {
		Balance -= money;
	}
	
	// 기본생성자
	_12_Account() {
		this("계좌없음", "이름없음", 0);	
	}
	
	// 매개변수 생성자
	public _12_Account(String accountNumber, String accountHolder, int Balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.Balance = Balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	
	@Override
	public String toString() {
		return "_12_Account [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", Balance="
				+ Balance + ", Password=" + Password + ", MIN_BALANCE=" + MIN_BALANCE + ", MAX_BALANCE=" + MAX_BALANCE
				+ ", MIN_TRANSFER=" + MIN_TRANSFER + ", MAX_TRANSFER=" + MAX_TRANSFER + "]";
	}
}
