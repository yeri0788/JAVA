package ex12inheritance;
/*
 강아지를 표현한 클래스 
	- Dog is a Animal이 성립하므로 상속관계로 표현하기에 
		적합한 모델	
	멤버변수
		강아지의종류 : 푸들, 포매라니안 등 -> dogKind
		이름 -> name
	멤버메소드
		bark() : 강아지가 짖는것을 표현
			출력결과 : 이름이 XX이고 종(포유류)이 
				YY인 강아지가 짖는다.
		showDog() : 강아지의 현재상태(멤버변수)를 출력하는 
			메소드
	인자생성자
		: 부모클래스까지 초기화할수 있도록 구성할 것
 */

public class AnimalDog extends Animal{
	//확장한 멤버변수를 만들어야함 
	String dogKind;  //강아지 종류
	String name;    //이름
	/*
 부모 클래스의 species 멤버변수는  private로 선언되어 자식에서는 접근이 불가능
 이떄는 public으로 선언된 getter 메서드를 통해 접근해야한다. 
	 */

	void bark()
	{
		System.out.printf("\n 이름이 %s이고 종(포유류)이 %s인 "
				+ "강아지가 짖는다\n" , this.name, getSpecies());
	}
	void showDog() {
		/*
	 여기서 사용된 super은 부모 클래스의 객체를 가리키는 의미로 
	 부모클래스의 showAnimal() 메서드를 호출합니다. 
		 */
		super.showAnimal();
		System.out.println("개 종류는 :" + dogKind);
		System.out.println("개 이름은 :" + name);
	}
	//생성자 메서드
	public AnimalDog(String species, int age, String gender, String dogkind, String name) {
/*
 자식 클래스에서는 반드시 부모클래스의 객체를 먼저 생성해야 한다.
 여기서 사용된 suoer()는 부모클래스의 생성자 메서드를 호출하는 용도로 사용된다. 
 */
		super(species, age, gender);
		//자신의 멤버변수를 초기화 안다. 
		this.dogKind = dogkind;
		this.name = name;
	}
}










