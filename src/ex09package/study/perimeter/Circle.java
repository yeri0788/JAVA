package ex09package.study.perimeter;

public class Circle {
	double rad;
	final double PI;
	
	public Circle(double rad) {
		this.rad = rad;
		PI = 3.14159;
	}
	public double getPerimeter() {
		return 2 * PI * rad;
	}

}
