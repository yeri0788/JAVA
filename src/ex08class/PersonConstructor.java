package ex08class;

public class PersonConstructor {

	/* 생성자 
	 
	 
	 */
	
	String name;
	int age;
	String addr;

	/* 디폴트 생성자 
	 해당 클래스에 생성자를 정의하지 않으면 아래와 같이 매개변수, 
	 실행부가 없는 생성자가 자동으로 삽입된다. 
	 */
	
	// 생성자 메소드
	//public PersonConstructor() {}

	public PersonConstructor() {
		name = "이름없음";
		age = 1;
		addr = "미상";
		System.out.println("나는 기본생성자 입니다");
	}

	public PersonConstructor(String name) {
		
//		this는 맨 위에 있는 멤버 변수를 가르킨다. 매개변수와 헷갈리지 않기 위해 붙임
		this.name = name;
		age = 1;
		addr = "출처불명";
		System.out.println("나는 인자생성자[1] 입니다");
	}

	public PersonConstructor (String name, int age) {
		this(name, age, "미상");
		System.out.println("나는 인자생성자[2] 입니다");
	}
	
	public PersonConstructor (String _name, int age, String addr) {
		name =_name;
		this.age = age;
		this.addr = addr;
		System.out.println("나는 인자생성자[3] 입니다");
	}

//	멤버 메서드 : 멤버변수 초기화를 목적으로 생성한다 
	void initialize(String name, int age, String addr) {
//		this(name, age, "미상"); >멤버 메서드는 호출이 불가능하다

		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	void showPersonInfo() {
		System.out.printf("%s 님의 정보1n", this.name);
		System.out.printf("나이:%d\n", age);
		System.out.printf("주소%s\n", addr);
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	