package kr.or.iei.func;

public class Example {
	
	public void exam1() {
		int num1;
		num1 = 100;
		char ch1 = '1';
		long num2 = 10000L;
		float fNum = 3.14f;
		final double PI = 3.14;
		
		System.out.println("���� ��� : " + (num1 + num1));
		num1 = 300;
		System.out.println("���� ��� : " + (num1 + num1));
		System.out.println("���� ��� : " + (ch1 + ch1));
	}
	
	public void exam2() {
		//���� 4�� ����
		
		String name = "���±�";	//�̸��� ������ ���� -> String
		int age = 27;	//���̸� ������ ���� -> int
		String address = "����� ���α� �õ� 190-146 �߾��������� A�� 302ȣ";	//�ּҸ� ������ ���� -> String
		char sex = '��';	//����(��/��) -> char

		//�� ���� ���� �� ���� ���� �Է� �� ���
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
		System.out.println("���� : " + sex);
	}
	
	public void exam3() {
		int num = 2147483647;
		int result = num + 1;	//�����÷� �߻�
		System.out.println(result);
	}
	
	public void exam4() {
		int num1 = 10;
		int num2 = 20;
		double fNum = 12.548923154875231;
		
//		System.out.println("������ ���� num�ȿ� ����ִ� ���� " + num1 + "�Դϴ�.");
//		System.out.printf("������ ���� num�ȿ� ����ִ� ���� %d�Դϴ�.\n", num1);
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) + "�Դϴ�.");
		System.out.printf("%d + %d = %d�Դϴ�.\n", num1, num2, num1 + num2);
		System.out.println("�Ǽ��� ���� fNum�ȿ� ����ִ� ���� " + fNum + "�Դϴ�.");
		System.out.printf("�Ǽ��� ���� fNum�ȿ� ����ִ� ���� %.5f�Դϴ�.\n", fNum);
	}
}
