package ex12inheritance;

class A {
	public void rideMethod() {
		System.out.println("A의 rideMethod");
	}
	public void loadMethod() {
		System.out.println("A의 loadMethod");
	}
}
class B extends A {
	@Override
	public void rideMethod() {
		System.out.println("B의 rideMethod");
	}
	public void loadMethod(int num) {
		System.out.println("B의 loadMethod");
	}
}
class C extends B {
	@Override
	public void rideMethod() {
		System.out.println("C의 rideMethod");
	}
	public void loadMethod(double num) {
		System.out.println("C의 loadMethod");
	}
}

public class E07RideAndLoad01 {
	
	public static void main(String[] args) {

		A ref1 = new C(); 
		B ref2 = new C(); 
		C ref3 = new C(); 

		System.out.println("오버라이딩 처리된 메서드");
		ref1.rideMethod();
		ref2.rideMethod();
		ref3.rideMethod();

		System.out.println("오버로딩 처리된 메서드");
		ref3.loadMethod();
		ref3.loadMethod(1);
		ref3.loadMethod(1.1);

		ref2.loadMethod();
		ref2.loadMethod(1);
		//		ref2.loadMethod(1.1);

		ref1.loadMethod();
		//		ref1.loadMethod(1);
		//		ref1.loadMethod(1.1);
		
		A refNum1 = new B();
		A refNum2 = new C();
		B refNum3 = new C();
		
		C refAddr1 = new C();
		B refAddr2 = refAddr1;
		A refAddr3 = refAddr1;
		
		A refId1 = new C();
//		B refId2 = refId1;
//		C refId3 = refId1;
		
		B refId2 = (B)refId1;
		C refId3 = (C)refId1;
	}
}









