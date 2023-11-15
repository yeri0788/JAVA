package ex10accessmodifier;

class FruitSeller5{
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;

	public FruitSeller5(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}

	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num; 
		myMoney += money;
		return num;
	}

	public void showsaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}

class FruitBuyer5{

	int myMoney;
	int numOfApple;

	public FruitBuyer5(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}

	public void buyApple(FruitSeller5 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: "+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}

public class E02FruitSalesMain5 {

	public static void main(String[] args) {

		FruitSeller5 seller1 = new FruitSeller5(0, 100, 1000);
		FruitSeller5 seller2 = new FruitSeller5(0, 80, 500);
		FruitBuyer5 buyer = new FruitBuyer5(10000, 0);

		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showsaleResult();
		seller2.showsaleResult();
		buyer.showBuyResult();

		/*
		 아래의 코드는 문법적으로 오류가 없으나 지불 금액과 구매한 사과의 관계가
		 맞지 않은 논리적 오류가 발생되었다. 
		 코드(메서드)로 구현한 규칙이 무너지게 된다. 
		 객체지향 프로그래밍에서는 이런 오류를 막기 위해 멤버 변수에 대한
		 "정보은닉"을 권장하고 있다. 
		 멤버 변수의 외부접근을 원천적으로 차단하고 멤버 메서드를 통해서만 
		 접근하게 하여 프로그래밍의 논리적 오류를 차단하는 역할
		 */
//		각각의 판매자에게 천원을 지불하고 사과를 구매한다. 
		seller1.myMoney += 1000; //판매자 1에게 천원을 지불 
		seller1.numOfApple -= 50;  //사과 50개를 구매 
		buyer.numOfApple += 50; //구매자는 사과 50개 증가 
		
		seller2.myMoney += 1000;  //판매자 1에게 천원을 지불 
		seller2.numOfApple -= 70;   //사과 70개를 구매 
		buyer.numOfApple += 70;   //구매자는 사과 70개 증가
//		구매자의 금액은 줄어들지 않음   
		
		
//		buyer.buyApple(seller1, 5000);
//		buyer.buyApple(seller2, 5000);

		System.out.println("구매행위가 일어난 후의 상태");
		System.out.println("첫번째 판매자1");
		seller1.showsaleResult();
		System.out.println("두번째 판매자2");
		seller2.showsaleResult();
		System.out.println("손님은 왕이다. ");
		buyer.showBuyResult();
	}
}















