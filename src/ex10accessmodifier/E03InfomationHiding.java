package ex10accessmodifier;

class FruitSeller6{
	private int numOfApple;
	private int myMoney;
	private final int APPLE_PRICE;

	public FruitSeller6(int money, int appleNum, int price) {
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

class FruitBuyer6{

	private int myMoney;
	private int numOfApple;

	public FruitBuyer6(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}

	public void buyApple(FruitSeller6 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: "+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}

public class E03InfomationHiding {

	public static void main(String[] args) {

		FruitSeller6 seller1 = new FruitSeller6(0, 100, 1000);
		FruitSeller6 seller2 = new FruitSeller6(0, 80, 500);
		FruitBuyer6 buyer = new FruitBuyer6(10000, 0);

		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showsaleResult();
		seller2.showsaleResult();
		buyer.showBuyResult();
		
		/*
		 멤버 변수를 프라이빗으로 선언하면 클래스 외부에서는 접근이 불가능해
		 기존코드에서는 모드 에러가 발생한다. (이 부분은 주석으로 처리)
		 즉 멤버변수의 정보은닉을 통해 비정상적인 접근을 차단하고 
		 멤버 메서드를 통해서만 구매가 이루어질 수 있도록 구현해야한다.
		 */
		
//		각각의 판매자에게 천원을 지불하고 사과를 구매한다.
		buyer.buyApple(seller1, 1000); //단가가 1000원이라 1개 구매 
		buyer.buyApple(seller2, 1000); //단가가 500원이라 2개 구매

		
//		각각의 판매자에게 천원을 지불하고 사과를 구매한다. 
//		seller1.myMoney += 1000; //판매자 1에게 천원을 지불 
//		seller1.numOfApple -= 50;  //사과 50개를 구매 
//		buyer.numOfApple += 50; //구매자는 사과 50개 증가 
//		
//		seller2.myMoney += 1000;  //판매자 1에게 천원을 지불 
//		seller2.numOfApple -= 70;   //사과 70개를 구매 
//		buyer.numOfApple += 70;   //구매자는 사과 70개 증가
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















