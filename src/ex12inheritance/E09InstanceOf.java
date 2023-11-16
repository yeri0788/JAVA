package ex12inheritance;

import java.security.PublicKey;

class Box {
	public void boxWrap() {
		System.out.println("Box로 포장합니다");
	}
}
class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("PaperBox로 포장합니다");
	}
}
class GoldPaperBox extends PaperBox {
	public void goldWarp() {
		System.out.println("GildPaperBox로 포장합니다");
	}
}

public class E09InstanceOf {

	static void warpBox(Box b) {
		if(b instanceof GoldPaperBox) {
			((GoldPaperBox) b).goldWarp();
		}
		else if(b instanceof PaperBox) {
			((PaperBox) b).paperWrap();
		}
		else if(b instanceof Box) {
			b.boxWrap();
		}
	}
	public static void main(String[] args) {
	
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		warpBox(box1);
		warpBox(box2);
		warpBox(box3);
		
		String str = new String("나는 누구?");
//		wrapBox(str);
		
	}
	
}














