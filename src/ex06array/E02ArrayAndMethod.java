package ex06array;

public class E02ArrayAndMethod
{
	public static void main(String[] args)
	{
		/*
		배열을 선언과 동시에 초기화한다. 원소의 갯수를 통해 크기가 
		결정된다. 생성된 배열 객체의 주소값을 할당하게 된다.
		 */
		int[] arr = {1, 2, 3, 4, 5};
		
		// 배열변수 선언하였지만 아직은 참조할 배열 객체가 없는 상태
		int[] ref;
		System.out.println("초기화 직후 출력");
		// 초기값 그대로인 1~5까지 출력된다.
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " "); // 1 2 3 4 5 출력
		}
		System.out.println();
		
		/*
		 배열명을 인수로 전달하는 것은 배열의 참조값(주소값)을 전달하는 
		 것이다. 즉, 배열 자체가 전달되지 않는다.
		 아래 출력문에는 배열객체의 참조값이 출력된다.
		 */
		System.out.println("arr변수:"+arr); 
		/*
		arr은 참조값이지만, 7은 기본자료형인 int이므로 값 자체가 전달
		된다.
		 */
		ref = addAllArray(arr, 7);	
		
		/*
		main에서 생성했던 배열객체의 참조값을 매개변수로 넘기고, 다시
		반환받았으므로 결국은 동일한 배열을 참조하게 되어 아래 출력문
		에서는 동일한 결과가 2번 출력된다.
		 */
		System.out.println("메소드 호출 후 출력");
		for(int i=0 ; i<ref.length ; i++) {
			System.out.print(ref[i]+" ");  // 8 9 10 11 12 출력됨			
		}
		
		System.out.println();
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");  // 8 9 10 11 12 출력됨			
		}		
	}
	
	/*
	 매개변수로 전달된 배열의 참조값을 ar이 받게되므로 결국 해당 메서
	 드에서도 동일한 배열을 참조하게된다. 즉, main메서드에서 생성한 
	 배열과 동일한 배열을 참조하게 된다.
	 */
	static int[] addAllArray(int[] ar, int addVal) {
		
		for(int i=0 ; i<ar.length ; i++) {
			/*
			 ar[i] = ar[i] + addVal;
			 아래 복합대입연산자를 풀어서 쓰면 이와같이 된다. 즉 배열의 
			 i번째 원소에 addVal을 더한 후 다시 대입하므로 결과적으로 
			 각 원소의 7씩 증가하게 된다.
			 */
			ar[i] += addVal;
		}
		// 배열 변수의 참조값을 그대로 반환한다.
		return ar;
	}
}