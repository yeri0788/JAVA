package ex07string;

public class E02StringMethod1 {
	
	public static void main(String[] args) {
		System.out.println("String 클래스의 주요 메소드");
		
		String str1 = "welcome to java";
		String str2 = "자바야 놀자";
		
		System.out.println("### 1 ###");
		System.out.println("str1의 길이: " + str1.length());
		System.out.println("str2의 길이: " + str2.length());
		
		
		System.out.println("### 2 ###");
		System.out.println("str1의 두 번쨰 문자:"
				+ str1.charAt(1));
		System.out.println("str2의 두 번쨰 문자:"
				+ str1.charAt(2));

		System.out.println("### 3 ###");
		String str3 = "A";
		String str4 = "B";
		System.out.println(str3.compareTo(str4));//-1
		System.out.println(str4.compareTo(str3));//1
		System.out.println("ABC" .compareTo("ABC")==0 ?
				"문자열이같다" : "문자열이다르다");

		System.out.println("### 4 ###");
		System.out.println("JAVA".concat(" WORLD") .concat (" Go"));
		System.out.println("JAVA"+" WORLD"+" GO");


		System.out.println("### 5 ###");
		System.out.println(str1.contains("To"));
		System.out.println(str1.contains("to"));
	}
}
