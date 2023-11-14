package ex07string;

public class E02StringMethod3 {
	
	public static void main(String[] args) {

		System.out.println("String 클래스의 주요 메소드 3");

		String str1 = "Welcome to java";
		String str2 = "자바야 놀자";


		System.out.println("###11###");
		System.out.println(str1.lastIndexOf("ava"));
		System.out.println(str1.lastIndexOf("J"));
		System.out.println("indexOf:" +
				str1.indexOf("a"));
		System.out.println("lastIndexOf:" +
				str1.lastIndexOf("a"));

		
		System.out.println("### 12 ###");
		System.out.println("J를G로 변경하기");
		System.out.println(str1.replace("J", "G"));
		System.out.println("java를 Korea로 변경하기");
		System.out.println(str1.replace("java","Korea"));

		System.out.println("### 13 ###");
		String phoneNumber = "010-1234-5678";
		String[] phoneArr = phoneNumber.split("-");
		for(int i=0 ; i<phoneArr.length ; i++) { 
			System.out.printf("phoneArr[%d]=%s\n",
					i, phoneArr[i]);
		}

		phoneArr = phoneNumber.split ("%");
		for(int i=0 ; i<phoneArr.length ; i++) { 
			System.out.printf("phoneArr[%d]=%s\n",i, phoneArr[i]);
		}

		/*
				14] substring()
		 */
		System.out.println("### 14 ###");
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,7));
	}

}
