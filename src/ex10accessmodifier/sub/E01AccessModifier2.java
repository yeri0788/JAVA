package ex10accessmodifier.sub;

class DefaultClass {
	void mtFunc() {
		System.out.println("DefalrClass클래스의 myFuns()메소드 호출");
	}
}

public class E01AccessModifier2 {


	private int privateVar; 
	int defaultVar;
	public int publicVar;

	private void privateMethod() {
		privateVar = 400;
		System.out.println("privateMethod() 메소드 호출");
	}
	void defaultMethod() {
		privateVar = 500;
		System.out.println("defaultMethod() 메소드 호출");
	}
	public void publicMethod() {
		privateVar = 600;
		System.out.println("publicMethod() 메소드 호출");
		privateMethod();
	}
}
