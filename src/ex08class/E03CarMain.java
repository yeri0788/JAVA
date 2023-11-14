package ex08class;


	class Car {
		String carModel;
		Human owner;

		void initialize() {
			carModel = "람보르기니";
			owner = new Human();
			owner.name = "스티브로져스";
			owner.age = 30;
			owner.energy = 10;
		}

		void initialize(String model, int year, String name, int age,int energy) {
			carModel = model;
			owner = new Human();
			owner.name = name;
			owner.age = age;
			owner.energy = energy;
		}
		void showCarInfo() {
			System.out.println("[차량정보]");
			System.out.printf("모델명:%s\n", carModel);
			owner.showState();
		}

	}////end of Car Class
	
	
public class E03CarMain {

		public static void main(String[] args) {

		
		Car car1 = new Car();
		car1.initialize(); 
		car1.showCarInfo();


//    이렇게는 잘 안쓴다,,, 
		Car car2 = new Car();
		car2.carModel = "밴틀리";
		car2.owner = new Human();
		car2.owner.name ="토니스타크";
		car2.owner.age = 52;
		car2.owner.energy = 8;
		car2.showCarInfo();

		
//		매개변수가 있는 초기화메서드를 이용하여 객체를 생성한다. 
//		가장 효율적인 코드 
		
		Car car3 = new Car();
		car3.initialize("스포츠카" , 2012, "성유겸", 8, 10);
		car3.showCarInfo();

		
//		이건 객체만 생성하고 초기화 하지 않은 상태로 예외 발생. null 빈 공간이 생기게 된다. 
		Car car4 = new Car();
		car4.showCarInfo();

	}
}
