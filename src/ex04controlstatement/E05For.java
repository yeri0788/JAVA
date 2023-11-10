package ex04controlstatement;

public class E05For {
	
	public static void main(String[] args) {
		
		
//		 for (초기값; 조건식; 증감식)
		
		
		for(int i=1; i<=5; i++) {
			System.out.println("i=" + i);
		}
		
		int sum = 0;
		for(int j=1; j<=100; j++) {
			sum+= j;
		}
		System.out.println("1~100까지의 합:" + sum);
		
		
		int total = 0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				total += i;
			}
		}
		System.out.println("1~10사이 2의 배수의 합(방법 1)" + total);
		/*
		total = 0;
		for(int i=1; i<=10; i+=2) {
			total += i;
		}
		System.out.println("1~10사이 2의 배수의 합(방법 2)" + total);
		
		int a = 1;
		for(;;) {
			System.out.println("for문으로 만든 무한루프" + a);
			a++;
		}
		
		for(int j=0; j<=5; j++);
		{
			System.out.println("나는 누구 여긴 어디" + j);
		}
		
		
//		System.out.println("위 for문 함수에서 선언한 변수 j + " + j);
		System.out.println("위 main 함수 지역에서 선언한 변수 total" + total);
		*/
		
//		구구단
		/*
		System.out.println("=========================");
		
		for(int dan = 2; dan<=9; dan++) {
			for(int su = 1; su<=9; su++) {
				System.out.printf("%-2d*%-2d=%2d  ", dan, su, (dan*su));
			}
			System.out.println();
		}
		
		for(int su = 1; su<=9; su++) {
			for(int dan = 2; dan<=9; dan++) {
				System.out.printf("%-2d*%-2d=%2d  ", dan, su, (dan*su));
			}
			System.out.println();
		}
		*/
		
//		0001
//		0010
//		0100
//		1000
		int x=1;
		while(x<=4) {
			int y=1;
			while(y<=4) {
				if(x+y==5) {
					System.out.print("1  ");
				}
				else {
					System.out.print("0  ");
				}
				y++;
			}
			System.out.println();
			x++;			
		}
		
		System.out.println("===================");
		
		for(int su=1; su<=4; su++) {
			for(int dan=1; dan<=4; dan++) {
				if((dan + su)==5) {
					System.out.print("1  ");
				}else {
					System.out.print("0  ");
				}
			}
			System.out.println();
		}
	}



}


