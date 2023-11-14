package ex08class;

class Account {
	String name;
	String accountNumber;
	int balance;

//	입금처리
	void deposit(int money) {
		balance += money;
		System. out.println(money+"원이 입금됨");
	}

//	출금처리
	void withdraw(int money) {
		if(balance >= money) {
			balance -= money;
			System. out.println("계좌에서"  + money + "원이 출금됨");
		}
		else {
			System. out.println("잔고부족으로 출금불능");
		}
	}
	
//	계좌조회
	void showAccount() {
		System.out.println("계좌주:"+ name);
		System.out.println("계좌번호:"+ accountNumber);
		System.out.println("잔고:"+ balance);
	}

//	초기화 메서드 (통장을 만듦)
	void init(String n, String a, int b) {
		name = n;
		accountNumber = a;
		balance = b;
	}
}

public class E04AccountMain {
	public static void main(String[] args) {

//		첫번째 계좌 객체 생성
		Account account = new Account();
//		초기화 메서드를 통해 객체 초기화
		account.init("장동건", "111-21-8888", 10000);
//		임금 출금 후 계좌정보 확인
		account.deposit(9000);
		account.withdraw(5000);
		account.showAccount();

		Account account2 = new Account();
		account2.name = "정우성";
		account2.accountNumber = "123-45-67890";
		account2.balance = 90000;
		account2.showAccount();

	}
}
