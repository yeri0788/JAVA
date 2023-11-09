package ex05method;

import java.util.Scanner;

/*
�޼���(�Լ�)�� ��Ģ
- Java���� main�޼���� ������ public static void�� �����ϱ�� ��ӵǾ�
	�ִ�.
- static���� ����� �޼���� static���� ����� �޼��常 ȣ���� �� �ִ�.
- �޼��� ȣ�� �� ��ȯ���� ȣ���� ��ġ�� ��ȯ�ȴ�. �̶� �޼���� �޸�
	���� �Ҹ�ȴ�.
- ��ȯ���� ���� void�� �޼���� ������ �Ϸ�Ǹ� ȣ���� ��ġ�� ������ 
	�帧�� ���ƿ´�.
*/
public class E01MethodBasi
{
	/*
	 �޼���1 : ��ȯ��O, �Ű�����O ���·� ����
	 	=> �Ű����� 2���� ������ ���޹޾� ���� ����� ��ȯ�Ѵ�. ��ȯ����
	 	ȣ���� �������� ��ȯ�Ѵ�.
	 */
	public static int simpleFunc(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	/*
	 �޼ҵ�2 : ��ȯ��X, �ŰԺ���X ���·� ����	
	 	=> ���޵Ǵ� �� ���� �̸��� �Է¹��� �� namePrint()�޼��带 ȣ��
	 	�Ѵ�. �̿Ͱ��� ��ȯ���� ���� ��쿡�� �ݵ�� void�� ����ؾ� 
	 	�Ѵ�.
	 */
	public static void menuPrint()
	{
		System.out.println("����� �̸��� �����ΰ���?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		namePrint(name);
	}
	
	/*
	 �޼ҵ�3 : ��ȯ��X, �ŰԺ���O ���·� ����
	 	=> ���ڿ��� ���޹޾� �ܼ��� ��¸� �Ѵ�. ��ȯ���� ���� ��쿡��
	 	������ ����Ǹ� ȣ���ߴ� �������� ������ �帧�� �̵��ȴ�.
	 */
	public static void namePrint(String n) {
		System.out.println("�� �̸��� "+ n +" �Դϴ�.");
	}
	
	// main�޼���� Java���� �����(Entry point)�� ��Ȱ�� �Ѵ�.
	public static void main(String[] args) {
		/*
		 �޼��带 ȣ���Ҷ��� �Լ��� ������ �״�� ����ϸ� �ȴ�.
		 �Ű������� �ִٸ� ������ŭ �����Ѵ�. �Ű������� ������ �ٸ��ų�
		 Ÿ��(��)�� ���� ������ ������ �߻��Ѵ�.
		 simpleFunc(1, 2, 3)�� ���� ����ϸ� �ش� �Լ��� ȣ���� �� ����
		 �Ƿ� ������ �߻��Ѵ�.
		 */
		int result = simpleFunc(1, 2);  // �Ǽ����� ������.
		System.out.println("1��2�� ������ ���:"+result);
		System.out.println("10��20�� ������ ���:"+ simpleFunc(10, 20));
		
		menuPrint();
		/*
		Java���� main()�޼����� ���� ������ ���α׷� ��ü�� ����ȴ�.
		 */
	}
}
