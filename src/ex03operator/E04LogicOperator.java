package ex03operator;

public class E04LogicOperator
{
	public static void main(String[] args)
	{
		/*
		논리연산자
			&&(엠퍼샌드) : 논리 And. 양쪽 모두가 true일때만 true를 반환하고
				나머지는 false를 반환하는 연산자			
			||(하이픈) : 논리 Or. 한쪽만 true이면 true를 반환하고, 양쪽 모두 
				false일때만 false를 반환하는 연산자.			
			! : 논리 Not. 반대의 논리를 반환하는 연산자.
		 */
		int num1=10, num2=20;
		// false && true => false
		boolean result1 = (num1==100 && num2==20);
		// true || false => true
		boolean result2 = (num1<12 || num2>=30);  

		System.out.println("result1의결과:"+ result1);
		System.out.println("result2의결과:"+ result2);
		
		//!(false) => true이므로 if문의 블럭이 실행된다. 
		if(!(num1==num2)) {
			System.out.println("num1과 num2는 다르다");
		}
		else {
			System.out.println("num1과 num2는 같다.");
		}
		
		// 비교 연산시 int로 형변환 된다.
		if(1.0==1) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다.");
		}
	}
}
