package ex04controlstatement;

/*
break문	: 반복문이나 switch문에서 주로 사용되며 블럭내에서 탈출할때
	사용한다. 만약 충첩된 반복문이라면 가장 가까운 블럭 하나만 탈출
	한다.	
continue문 : 반복문의 처음으로 돌아간다. while문의 경우	조건을 확인
	하고, for문의 경우 증감식이 실행된다. 따라서 continue아래 문장은 
	실행되지 않는다.
*/
public class E06BreakContinue
{
	public static void main(String[] args)
	{
//		while(true) {
//			System.out.println("출력문1");
//			System.out.println("출력문2");
//			
//			break;
//			
//			System.out.println("출력문3"); // 에러
//			System.out.println("출력문4");
//		}
		
//		int num = 10;
//		while(true) {
//			System.out.println("출력문1");
//			System.out.println("출력문2");
//			
//			if(num==10) continue;
//			
//			System.out.println("출력문3"); 
//			System.out.println("출력문4");
//		}
		
		int i= 0;
		// true를 사용하면 무한루프가 됨.
		while(true) {  
			/*
			 반복문 내에서 break, continue문을 사용할때는 반드시 
			 조건문과 같이 사용해야 한다. 그렇지 않으면 해당코드 
			 하위는 실행되지 않는 쓰레기코드가 되기때문이다.
			 */
			i++;
			System.out.printf("[i가 %d일때]\n", i);
			
			System.out.println("continued이전 출력");
			// i가 짝수이면 반복의 처음으로 돌아간다.
			if(i%2==0) continue;
			System.out.println("continued이후 출력");
			
			System.out.println("break이전 출력");
			// i가 3이면 반복문을 탈출한다.
			if(i==3) break;
			System.out.println("break이후 출력");
		}
		
		/*
		 중첩된 반복문 안에서 break문을 만나면 "가장 가까운 반복문 
		 하나"만 탈출한다.
		 */
		for(int x=1 ; x<=5 ; x++) {
			// x는 5까지 전체 출력된다.
			System.out.println("x="+x);
			for(int y=1 ; y<=5 ; y++) {
				System.out.println("y="+y);
				if(y==3)
					break;   // y는 3까지만 출력된다.				
			}
		}
	}
}