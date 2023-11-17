package ex14innerclass;

class Unit {
	private String name; 
	private int healthPoint;

	Marine marine;
	Medic medic;

	public Unit(String name, int healthPoint) {
		this.name = name;
		this.healthPoint = healthPoint;
		marine = new Marine();
		//medic = new Medic();
	}

	public String infoStr() {
		return "유닛정보[이름: "+name+", 체력:"+healthPoint+"1";
	}
	class Marine {
		int attackPower;
		public void attack() {
			System.out.println(infoStr()+"\n마린이 공격한다.");
		}
	}
	class Medic {
		int healPower;
		public void heal() {
			System.out.println(infoStr()+"\n메딕이 치료한다.");
		}
	}
}

public class E01InnerClassMain {

	public static void main(String[] args) {

		Unit unit = new Unit("커맨드센터", 1000);
		System.out.println(unit.infoStr());

		Unit.Marine marine = new Unit("O|E", 50).marine;
		marine.attack();

		Unit.Medic medic = new Unit("H|", 30).new Medic();
		medic.heal();
	}
}









