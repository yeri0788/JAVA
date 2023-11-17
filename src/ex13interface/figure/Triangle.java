package ex13interface. figure;

public class Triangle extends FigureData implements IFigure, IDrawable {
	public Triangle(int width, int height) {
		super (width, height);
	}

	@Override
	public void draw(String figureName) {
		System. out.println(figureName +"을(를) 그려봅니다");
	}
	public void area(String figureName) {
		System.out.println(figureName +"의 면적은(밑변*높이*0.5):"
				+ (width*height*0.5));
	}
}